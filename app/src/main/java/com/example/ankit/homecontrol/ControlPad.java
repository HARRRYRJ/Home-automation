package com.example.ankit.homecontrol;

import android.app.ProgressDialog;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Handler;
import android.provider.Telephony;
import android.speech.RecognizerIntent;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.LoginFilter;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ControlPad extends AppCompatActivity {
    StringBuilder buff;
    int handlerState = 0;
    Handler btHandler;
    ConnectedThread mConnectedThread = null;
    TextToSpeech tts;
    boolean isBluetoothConnected = false;
    BluetoothAdapter btAdapter = null;
    BluetoothSocket btSocket = null;
    ProgressDialog progress;
    String address = "";
    Switch bulbSwitch, fanSwitch;
    int temprature = 0;
    TextView tempraturePanel;
    ImageView voiceActivationImg;
    Toolbar toolbar;
    ImageView fanImage, bulbImage;
    public static RotateAnimation animation = null;
    static final UUID homeuuid = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_pad);
        buff = new StringBuilder();
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Easy Way");
        setSupportActionBar(toolbar);

        fanImage = (ImageView) findViewById(R.id.fanIMG);
        bulbImage = (ImageView) findViewById(R.id.bulbIMG);
        address = getIntent().getExtras().getString("address");
        fanSwitch = (Switch) findViewById(R.id.fanSwitch);
        bulbSwitch = (Switch) findViewById(R.id.bulbSwitch);
        voiceActivationImg = (ImageView) findViewById(R.id.voiceModeBtn);
        tempraturePanel = (TextView) findViewById(R.id.tempPanel);


        btHandler = new Handler() {
            public void handleMessage(android.os.Message msg) {
                if (msg.what == handlerState) {
                    String readMsg = (String) msg.obj;
                    buff.append(readMsg);

                }
                Log.e("recvd: ", "" + buff.toString());
                Pattern temp_pattern = Pattern.compile("([0-9]+)");
                Pattern msg_pattern = Pattern.compile("[A-Z]{2,10}");
                Matcher temp_matcher = temp_pattern.matcher(buff.toString());
                Matcher msg_matcher = msg_pattern.matcher(buff.toString());


                if (temp_matcher.find()) {
                    temprature = Integer.parseInt(temp_matcher.group());
                    tempraturePanel.setText(temprature + "");
                    // Log.e("Re Temp",""+temp_matcher.group());
                }

                if (msg_matcher.find()) {
                    //  Log.e("Re Msg",""+msg_matcher.group());

                    if (msg_matcher.group(0).equals("FO")) {
                        fanSwitch.setChecked(true);

                    }
                    if (msg_matcher.group(0).equals("FF")) {
                        fanSwitch.setChecked(false);
                    }
                    if (msg_matcher.group(0).equals("LO")) {
                        bulbSwitch.setChecked(true);
                    }
                    if (msg_matcher.group(0).equals("LF")) {
                        bulbSwitch.setChecked(false);
                    }

                    if (msg_matcher.group().equals("SITFO")) {
                        speak("Hello  The Current Temprature is " + temprature + " degree celcius Should  I  Turn  Fan   On             Say   Yes  or  No  ");
                        ActivateVoiceMode();
                    }

                    if (msg_matcher.group().equals("SITFF")) {
                        speak("Hello The Current Temprature is " + temprature + " degree celcius Should  I  Turn  Fan   Off             Say   Yes  or  No  ");
                        ActivateVoiceMode();
                    }
                }


                // speak(recvData.toString());
                //    Log.e("Handler ","received from board: "+buff.toString());
                buff = new StringBuilder();
                // recvData="";

            }
        };


        tts = new TextToSpeech(ControlPad.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status != TextToSpeech.ERROR) {
                    tts.setLanguage(Locale.US);
                }
            }
        });

        voiceActivationImg.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == MotionEvent.ACTION_UP) {
                    ActivateVoiceMode();
                }
                return true;
            }
        });

        bulbSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean state) {
                if (state) {
                    bulbImage.setImageResource(R.drawable.glow);
                } else {
                    bulbImage.setImageResource(R.drawable.fake);
                }
                if (btSocket != null) {
                    turnLight(state);
                }

            }
        });

        fanSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean state) {
                Rotate(state);
                if (btSocket != null) {
                    Log.e("fan ", "turning " + state);
                    turnFan(state);
                }
            }
        });

    }


    private void Rotate(boolean conf) {

        if (conf) {
            animation = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
            animation.setInterpolator(new LinearInterpolator());
            animation.setDuration(500);
            animation.setRepeatCount(Animation.INFINITE);
            fanImage.setAnimation(animation);
            fanImage.startAnimation(animation);
        } else {

            animation = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
            animation.setInterpolator(new DecelerateInterpolator());
            animation.setDuration(500);
            animation.setRepeatCount(4);
            fanImage.setAnimation(animation);
            fanImage.startAnimation(animation);

            fanImage.clearAnimation();

        }


    }


    private void msg(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onPause() {
        super.onPause();
        //App is going to close down so turn On CCTV_MODE on
        turnCCTV_MODE();

    }

    private boolean isConnected() {
        ConnectivityManager manager = (ConnectivityManager) this.getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo info = manager.getActiveNetworkInfo();

        return info != null && info.isAvailable() && info.isConnected();

    }

    @Override
    public void onResume() {
        super.onResume();

        BluetoothSocket tempSocket = getBtSocket();
        try {
            tempSocket.connect();
            speak("Connection    Established  From    Board");
            getCurrentInfo();
            msg("Connection Estabilished ");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (tempSocket != null) {
            mConnectedThread = new ConnectedThread(tempSocket);
            mConnectedThread.start();
            progress.dismiss();
            //TODO: here through thread send command to remote device

        } else {
            msg("Cannot Connect To Device");
        }

    }

    //================================================================
    //                  SPEECH SECTION
    //================================================================

    public void ActivateVoiceMode() {
        // tts.speak("Voice Mode Activated", TextToSpeech.QUEUE_FLUSH, null);
        if (isConnected()) {

            Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
            intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
            intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Plz Say Commands ");
            startActivityForResult(intent, 1);
        } else {
            speak("No Internet Connection           Please Have it First");
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == RESULT_OK) {
            ArrayList<String> dataList = new ArrayList<>();
            dataList = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            for (int i = 0; i < dataList.size(); i++) {
                Log.e("voice got ", "" + dataList.get(i));

                String current_data = dataList.get(i).toUpperCase();
                if (current_data.equals("YES")) {
                    sendConfirmationTrue();
                }
                if (current_data.equals("NO")) {
                    sendConfirmationFalse();
                }


                if (current_data.equals("LED ON")) {
                    PutTheLedOn();
                    tts.speak("Turning LED on", TextToSpeech.QUEUE_FLUSH, null);
                }
                if (current_data.equals("LED OFF")) {
                    PutTheLedOff();
                    tts.speak("Turning LED off", TextToSpeech.QUEUE_FLUSH, null);
                }
                if (current_data.equals("GOOD NIGHT SARA")) {
                    PutTheLedOff();
                    tts.speak("good night mister rj           have a sweet dream", TextToSpeech.QUEUE_FLUSH, null);
                }
                if (current_data.equals("GOOD NIGHT ")) {
                    PutTheLedOff();
                    tts.speak("good night mister rj           have a sweet dream", TextToSpeech.QUEUE_FLUSH, null);
                }
                if (current_data.equals("WAKE UP SARA")) {
                    PutTheLedOn();
                    tts.speak("nice to meet you again mister rj           what is the command for me", TextToSpeech.QUEUE_FLUSH, null);
                }
                if (current_data.equals("WAKE UP ")) {
                    PutTheLedOn();
                    tts.speak("nice to meet you again mister rj           what is the command for me", TextToSpeech.QUEUE_FLUSH, null);
                }
                if (current_data.equals("TELL THEM ABOUT YOURSELF")) {
                    tts.speak("", TextToSpeech.QUEUE_FLUSH, null);
                    //tts.setSpeechRate((float) 0.4);
                    // mConnectedThread.SendToBluetooth("TTU:");

                    tts.speak("hi      this  is  saara  my creator is mister    harry rj       i am a   arduino based home automation system                                                 memory  32256  bytes                                               micro controller               atmega 328p-p u", TextToSpeech.QUEUE_FLUSH, null);
                }
                if (current_data.equals("fan on")) {

                }
                if (current_data.equals("HI SARA")) {
                    tts.speak("hi harry    what can i do for you  mister rj", TextToSpeech.QUEUE_FLUSH, null);
                }
                if (current_data.equals("HEY SARA")) {
                    tts.speak("hi harry    what can i do for you  mister rj", TextToSpeech.QUEUE_FLUSH, null);
                }
                if (current_data.equals("SARA")) {
                    tts.speak("hi harry    what can i do for you  mister rj", TextToSpeech.QUEUE_FLUSH, null);
                }
                if (current_data.equals("HOW ARE YOU")) {
                    tts.speak("i am fine thank you   what about you", TextToSpeech.QUEUE_FLUSH, null);
                }
                if (current_data.equals("I'M UPSET ")) {
                    tts.speak("why         is someone break your heart ", TextToSpeech.QUEUE_FLUSH, null);
                }
                if (current_data.equals("I M UPSET")) {
                    tts.speak("why         is someone break your heart ", TextToSpeech.QUEUE_FLUSH, null);
                }

                tts.speak("why         is someone break your heart ", TextToSpeech.QUEUE_FLUSH, null);
            }
            if (current_data.equals("M UPSET")) {
                tts.speak("why         is someone break your heart ", TextToSpeech.QUEUE_FLUSH, null);
            }
            if (current_data.equals("UPSET")) {
                tts.speak("why         is someone break your heart ", TextToSpeech.QUEUE_FLUSH, null);
            }
            if (current_data.equals("NO NOT LIKE THAT")) {
                tts.speak("then chill  mister rj", TextToSpeech.QUEUE_FLUSH, null);
            }
            if (current_data.equals("I LOVE YOU SARA")) {
                tts.setSpeechRate((float) 0.95);
                tts.speak("I AM JUST A MACHINE MISTER RJ            I HAVE NO FEELINGS            BUT STILL I LOVE YOU  ", TextToSpeech.QUEUE_FLUSH, null);
            }
            if (current_data.equals("THANK YOU SARA")) {
                tts.speak("its my pleaser mister rj", TextToSpeech.QUEUE_FLUSH, null);
            }
            if (current_data.equals("WHAT IS THE TEMPERATURE")) {
                tts.speak("Hello The Current Temprature is " + temprature + " degree celcius", TextToSpeech.QUEUE_FLUSH, null);
            }
            //ActivateVoiceMode();

        }
    }

}

    public void speak(String cmd) {
        tts.setSpeechRate((float) 0.8);
        tts.speak(cmd, TextToSpeech.QUEUE_FLUSH, null);
    }
    //=================================================================
    //                 ARDUINO  COMMAND DISPATCHER
    //=================================================================


    public void turnLight(boolean On) {
        if (On) {
            try {
                Log.e("Control Pad", "turning on");
                btSocket.getOutputStream().write("TLO:".toString().getBytes());
            } catch (IOException e) {
                Log.e("Control Pad ", "Cannot Write to bluetooth ");
            }
        } else {
            try {
                Log.e("Control Pad", "turning off");
                btSocket.getOutputStream().write("TLF:".toString().getBytes());
            } catch (IOException e) {
                Log.e("Control Pad ", "Cannot Write to bluetooth");
            }
        }
    }

    private void goodNight() {
        try {
            Log.e("Control Pad", "good night");
            btSocket.getOutputStream().write("GN:".toString().getBytes());
        } catch (IOException e) {
            Log.e("Control Pad ", "Cannot Write to bluetooth");
        }
    }

    private void wakeUp() {
        try {
            Log.e("Control Pad", "wake up");
            btSocket.getOutputStream().write("WU:".toString().getBytes());
        } catch (IOException e) {
            Log.e("Control Pad ", "Cannot Write to bluetooth");
        }
    }

    private void sendConfirmationTrue() {
        try {
            Log.e("Control Pad", "turning on");
            btSocket.getOutputStream().write("CO:".toString().getBytes());
        } catch (IOException e) {
            Log.e("Control Pad ", "Cannot Write to bluetooth");
        }

    }

    private void sendConfirmationFalse() {
        try {
            Log.e("Control Pad", "turning off");
            btSocket.getOutputStream().write("CF:".toString().getBytes());
        } catch (IOException e) {
            Log.e("Control Pad ", "Cannot Write to bluetooth");
        }

    }

    private void turnFan(boolean On) {
        if (On) {
            try {
                Log.e("Control Pad", "turning on");
                btSocket.getOutputStream().write("TFO:".toString().getBytes());
            } catch (IOException e) {
                Log.e("Control Pad ", "Cannot Write to bluetooth ");
            }
        } else {
            try {
                Log.e("Control Pad", "turning off");
                btSocket.getOutputStream().write("TFF:".toString().getBytes());
            } catch (IOException e) {
                Log.e("Control Pad ", "Cannot Write to bluetooth");
            }
        }
    }

    private void PutTheLedOff() {
        turnLight(false);
    }

    private void PutTheLedOn() {
        turnLight(true);
    }

    private void getCurrentInfo() {
        try {
            Log.e("Control Pad", "getting info");
            btSocket.getOutputStream().write("CI:".toString().getBytes());
        } catch (IOException e) {
            Log.e("Control Pad ", "Cannot Write to bluetooth");
        }
    }

    private void turnCCTV_MODE() {
        try {
            Log.e("Control Pad", "turning cctv mode on");
            btSocket.getOutputStream().write("CCTVACT:".toString().getBytes());
        } catch (IOException e) {
            Log.e("Control Pad ", "Cannot Write to bluetooth");
        }
    }


    //==================================================================
    //                  BLUETOOTH CONNECTIVITY HANDLER
    //==================================================================

    private void Disconnect() {
        if (btSocket != null) {
            try {
                btSocket.close();
            } catch (IOException e) {
                Log.e("Control Pad ", "Cannot Close Bluetooth Socket");
            }
        }
    }

    public BluetoothSocket getBtSocket() {
        boolean ConnectSuccess = true;

        Log.e("Control Pad ", "trying to connect..........");
        progress = ProgressDialog.show(ControlPad.this, "Connecting...", "Please wait!!!");  //show a progress dialog
        if (btSocket == null || !isBluetoothConnected) {
            btAdapter = BluetoothAdapter.getDefaultAdapter();//get the mobile bluetooth device
            BluetoothAdapter.getDefaultAdapter().cancelDiscovery();
            Class<?> clazz = btAdapter.getRemoteDevice(address).getClass();
            Class<?>[] paramTypes = new Class<?>[]{Integer.TYPE};

            try {
                Method m = clazz.getMethod("createRfcommSocket", paramTypes);
                Object[] params = new Object[]{Integer.valueOf(1)};
                try {
                    btSocket = (BluetoothSocket) m.invoke(btAdapter.getRemoteDevice(address), params);

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        return btSocket;

    }

private class ConnectedThread extends Thread {
    private final InputStream btInStream;
    private final OutputStream btOutStream;
    private boolean isThreadRunning = false;

    public ConnectedThread(BluetoothSocket btSocket) {
        InputStream tmpIn = null;
        OutputStream tmpOut = null;
        try {

            if (!btSocket.isConnected()) {
                btSocket.connect();
                Log.e("Thread:", "Connected");
            }
            Log.e("Thread ", "already connected ");
            tmpIn = btSocket.getInputStream();
            tmpOut = btSocket.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }

        btInStream = tmpIn;
        btOutStream = tmpOut;
    }

    public void run() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        byte[] buffer = new byte[20];
        int bytes;
        // Listening for received msg
        while (true) {
            if (btInStream != null) {
                try {
                    // Log.e("Thread ","obtaining msg ");
                    bytes = btInStream.read(buffer);
                    String readMsg = new String(buffer, 0, bytes);
                    //Data Sent to UI Thread through os handler
                    btHandler.obtainMessage(handlerState, bytes, -1, readMsg).sendToTarget();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

    public void SendToBluetooth(String input) {
        byte[] msgBuffer = input.getBytes();
        try {
            btOutStream.write(msgBuffer);
        } catch (IOException e) {
            msg("Cannot Send Command To Bluetooth");
            e.printStackTrace();
        }
    }

}

}
