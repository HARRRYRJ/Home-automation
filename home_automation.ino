#include <DHT.h>
#include <Servo.h>
int get_motion_zone();
void automate_with_motion();
int get_temperature();
int get_humidity();
void fan_on();
void fan_off();
void turn_light_on();
void turn_light_off();
void automate_with_temperature();
void rotate_camera();
void send_confirmation_off();
void send_confirmation_on();
void send_current_state();
void handle_bluetooth_command();
Servo myservo;
#define DHTTYPE DHT11
#define dht_pin 8
DHT dht(dht_pin, DHT11);
char command;
String string;
boolean light_on = false;
int fan_relay = 7;
int light_relay = 13;
boolean fan_master_key = true;
boolean light_master_key = true;
int t, h;
int pos = 90;
int src, dst;
int pirpin_THREE = 3;
int pirpin_FIVE = 5;
int pirpin_SIX = 6;
int incr = 1;
int time_since_last_motion = 0;
int zone;
boolean conf_sent = false;
boolean CCTV_MODE = true;
//unsigned long start_time_millis;
//unsigned long 
void turn_light_on()
{
 
  if(digitalRead(light_relay)==LOW){
    Serial.println("turning on light");
    digitalWrite(light_relay, HIGH);
    }
}


void turn_light_off()
{
  
  if(digitalRead(light_relay)==HIGH){
    Serial.println("turning off light");
    digitalWrite(light_relay, LOW);
    }
  
}


void fan_on() {
  conf_sent = true;
  Serial.println("fon");
  if(digitalRead(fan_relay)==LOW){
    Serial.println("turning on fan");
    digitalWrite(fan_relay, HIGH);
    }
}


void fan_off() {
  conf_sent = true;
  Serial.println("fof");
  if(digitalRead(fan_relay)==HIGH){
    Serial.println("turning off fan");
    digitalWrite(fan_relay, LOW);
    }
}


int get_temperature() {
  return dht.readTemperature();
}


int get_humidity() {
  return dht.readHumidity();
}


void automate_with_temperature() {

  delay(100);

  t = get_temperature();
  delay(100);
  Serial.print("???");
  Serial.print(t);
  Serial.println("???");
  Serial.println(time_since_last_motion);
  
  
    //Serial.println(fan_master_key);
  
    if(time_since_last_motion <= 6000)
    {
      
          if(t>=25)
          {
               if(fan_master_key==false)
               {
                return;
               }
      
                 else
                 {
                   fan_on();
                   fan_master_key=true;
                 }
        
          }
      
   
  
       else 
            {
                if (fan_master_key==true)
                {
                  return;
           
                }
             else
                  {
                 fan_off();
                  }
      
           }
      
    }


             else
                 
               {
                   if(fan_master_key=false)
                     {
                         fan_off();
                         fan_master_key=true;
                         
                     }
                  else
                         {
                          fan_off();
                         
                         }
                            Serial.println("$$$FF$$$");
                     
              }
        
    
    
  
      



}




void rotate_camera() {
  // For the sake of bluetooth command delay
  // we rotate camera at the cost of keep waiting other devices
  // we rotate it when CCTV_MODE is true

  if (CCTV_MODE==true) {
    for (int i = src; i < dst; i += incr) {
      myservo.write(i);
      delay(50);
      handle_bluetooth_command();         // For Continued Bluetooth listening
    }
    for (int i = dst; i > src; i -= incr) {
      myservo.write(i);
      delay(50);
      handle_bluetooth_command();       // For Continued Bluetooth listening
    }
  }

}


int get_motion_zone() {
  int zone;
  if (digitalRead(pirpin_THREE) == HIGH) {
    zone = 1;
  }
  if (digitalRead(pirpin_FIVE) == HIGH) {
    zone = 2;
  }
  if (digitalRead(pirpin_SIX) == HIGH) {
    zone = 3;
  }
  return zone;
}


void automate_with_motion() {

  
   time_since_last_motion+=10;
 // time_since_last_motion +=millis()-start_time_millis ;
  //start_time_millis=millis();
  if (time_since_last_motion <= 6000&&(digitalRead(pirpin_THREE) == HIGH) || (digitalRead(pirpin_FIVE) == HIGH) || (digitalRead(pirpin_SIX) == HIGH)) {
      
                  turn_light_on();
                  light_master_key = true;
                 // Serial.println("$$$LF$$$");
                   
                }

             
 Serial.println(light_master_key);           
 if(light_master_key==true)
    {
     turn_light_on();
    }            

  
    else
      {
        turn_light_off();
        light_master_key=true;
        //Serial.println("$$$LO$$$"); 
      }
       rotate_camera();
      
  if ((digitalRead(pirpin_THREE) == LOW) && (digitalRead(pirpin_FIVE) == LOW) && (digitalRead(pirpin_SIX) == LOW))return;

  if (digitalRead(pirpin_THREE) == HIGH ) {
    time_since_last_motion = 0;
    src = 0; dst = 60;
    Serial.println("Motion   Detected   From   Zone   A");
  }

  if (digitalRead(pirpin_FIVE) == HIGH ) {

    time_since_last_motion = 0;
    src = 60; dst = 120;
    Serial.println("Motion   Detected   From   Zone   B");

  }

  if (digitalRead(pirpin_SIX) == HIGH) {

    time_since_last_motion = 0;
    src = 120; dst = 180;
   Serial.println("Motion   Detected   From   Zone   C");

  }

  // Here We are sure for a motion detection
  // Turn Lights on
  
          turn_light_on();
        
  
  // And Rotate Camera
  rotate_camera();

}

void initialize_sensors() {
      delay(5000);
  }


void send_confirmation_on() {
  Serial.print("$$$SITFO$$$");
}


void send_confirmation_off() {
  Serial.print("$$$SITFF$$$");
}

void send_current_state() {

  delay(1000);
  Serial.println("");

  if (digitalRead(fan_relay) == HIGH) {
    Serial.println("$$$FO$$$");

  } else {
    Serial.println("$$$FF$$$");
  }

  if (digitalRead(light_relay) == HIGH) {
    Serial.println("$$$LO$$$");
  } else {
    Serial.println("$$$LF$$$");
  }
}

void handle_bluetooth_command() {


  if (Serial.available() > 0) {
    string = "";

  }

  while (Serial.available() > 0) {
    //Serial.println("cmd inc");
    command = ((byte)Serial.read());

    if (command == ':') {
      break;
    }
    else {
      string += command;
    }

    delay(10);
  


  if (string == "WU") {
    turn_light_on();
  }

  if (string == "GN") {
    turn_light_off();

  }

  if (string == "TLO") {
    turn_light_on();
    light_on = true;
  }

  if (string == "TLF") {

    turn_light_off();
    light_on = false;
  }

  if (string == "TFO") {
    fan_on();
    fan_master_key=true;
//    t = get_temperature();
//    if (t < 25) {
//
//      if (conf_sent == false) {
//        send_confirmation_on();
//        conf_sent = true;
//      }
//
//    }
  }

  if (string == "TFF") {
    fan_off();
    fan_master_key=false;
//    if (t > 25) {
//      if (conf_sent == false) {
//        send_confirmation_off();
//        conf_sent = true;
//      }
//    }

  }

  if (string == "CO") {
    fan_on();
    fan_master_key = true;
    conf_sent = true;
  }

  if (string == "CF") {
    fan_on();
    fan_master_key = true;
    conf_sent = true;
  }

  if (string == "CI") {
    // This is sent when app connects so , We send current state and turn CCTV mode off
    send_current_state();
    Serial.println("cctv mode turned off");
    CCTV_MODE = false;
    string = "";
  }

  if (string == "CCTVACT") {
    CCTV_MODE = true;
  }
  }
}

void setup() {
  // put your setup code here, to run once:
  Serial.begin(9600);
  myservo.attach(9);
  initialize_sensors();
  pinMode(fan_relay, OUTPUT);
  pinMode(pirpin_THREE, INPUT);
  pinMode(pirpin_FIVE, INPUT);
  pinMode(pirpin_SIX, INPUT);
  pinMode(light_relay, OUTPUT);
  digitalWrite(light_relay, LOW);
  delay(100);
 // start_time_millis= millis();
}




void loop() {
  // put your main code here, to run repeatedly:
  automate_with_temperature();
  automate_with_motion();
  handle_bluetooth_command();

}
