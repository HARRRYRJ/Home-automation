package com.example.ankit.homecontrol;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Set;

public class Home extends AppCompatActivity {

    BluetoothAdapter btAdapter;
    Set<BluetoothDevice> pairedDevice;
    ArrayList<String> devices, addresses;
    ListView deviceListView;
    Switch btSwitch;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        deviceListView = (ListView) findViewById(R.id.devicesListView);

        btSwitch = (Switch) findViewById(R.id.bluetoothSwitch);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Home Automation");
        setSupportActionBar(toolbar);

        btAdapter = BluetoothAdapter.getDefaultAdapter();
        if (btAdapter == null) {
            Toast.makeText(this, "Bluetooth Adapter Not Found !", Toast.LENGTH_LONG).show();
        } else {

            if (btAdapter.isEnabled()) btSwitch.setChecked(true);
            btSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                    if (!btAdapter.isEnabled() && b) {
                        Intent intent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
                        startActivityForResult(intent, 1);

                    } else {
                        btAdapter.disable();

                    }

                }
            });

            assingList();

            deviceListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Intent intent = new Intent(Home.this, ControlPad.class);
                    Bundle bundle = new Bundle();
                    bundle.putString("address", addresses.get(i));
                    intent.putExtras(bundle);
                    startActivity(intent);
                }
            });
        }

    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    public void assingList() {
        devices = new ArrayList<>();
        addresses = new ArrayList<>();
        pairedDevice = btAdapter.getBondedDevices();
        if (pairedDevice.size() > 0)
            for (BluetoothDevice bt : pairedDevice) {
                devices.add(bt.getName());
                addresses.add(bt.getAddress());
            }

        deviceListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, devices));
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1 && resultCode == RESULT_OK) {
            assingList();
        }


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
