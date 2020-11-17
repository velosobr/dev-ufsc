#include "Arduino.h"
#include "ESP8266.h"
#include "Relay.h"
#include "SoilMoisture.h"
#include "SolenoidValve.h"


#define WIFI_PIN_TX	11
#define WIFI_PIN_RX	10
#define RELAYMODULE_PIN_SIGNAL	3
#define SOILMOISTURE_5V_PIN_SIG	A3
#define SOLENOIDVALVE_PIN_COIL1	2


const char *SSID     = "WIFI-SSID"; 
const char *PASSWORD = "PASSWORD" ; 



char* const host = "www.google.com";
int hostPort = 80;

ESP8266 wifi(WIFI_PIN_RX,WIFI_PIN_TX);
Relay relayModule(RELAYMODULE_PIN_SIGNAL);
SoilMoisture soilMoisture_5v(SOILMOISTURE_5V_PIN_SIG);
SolenoidValve solenoidValve(SOLENOIDVALVE_PIN_COIL1);


// define vars for testing menu
const int timeout = 10000;
char menuOption = 0;
long time0;

void setup() 
{
    Serial.begin(9600);
    while (!Serial);
    Serial.println("start");
    
    wifi.init(SSID, PASSWORD);
    menuOption = menu();
    
}

void loop() 
{
    
    
    if(menuOption == '1') {
    wifi.httpGet(host, hostPort);
    char* wifiBuf = wifi.getBuffer();

    char *wifiDateIdx = strstr (wifiBuf, "Date");
    for (int i = 0; wifiDateIdx[i] != '\n' ; i++)
    Serial.print(wifiDateIdx[i]);

    }
    else if(menuOption == '2') {
    
    relayModule.on(); 
    delay(500);       
    relayModule.off();
    delay(500);       
    }
    else if(menuOption == '3') {
    // Soil Moisture Sensor - Test Code
    int soilMoisture_5vVal = soilMoisture_5v.read();
    Serial.print(F("Val: ")); Serial.println(soilMoisture_5vVal);

    }
    else if(menuOption == '4') {
    
    solenoidValve.on();
    delay(500);   
    solenoidValve.off();
    delay(500);   

    }
    
    if (millis() - time0 > timeout)
    {
        menuOption = menu();
    }
    
}


char menu()
{

    Serial.println(F("\nWhich component would you like to test?"));
    Serial.println(F("(1) ESP8266-01 - Wifi Module"));
    Serial.println(F("(2) Relay Module"));
    Serial.println(F("(3) Soil Moisture Sensor"));
    Serial.println(F("(4) 12V Solenoid Valve - 3/4''"));
    Serial.println(F("(menu) send anything else or press on board reset button\n"));
    while (!Serial.available());

    while (Serial.available()) 
    {
        char c = Serial.read();
        if (isAlphaNumeric(c)) 
        {   
            
            if(c == '1') 
    			Serial.println(F("Now Testing ESP8266-01 - Wifi Module"));
    		else if(c == '2') 
    			Serial.println(F("Now Testing Relay Module"));
    		else if(c == '3') 
    			Serial.println(F("Now Testing Soil Moisture Sensor"));
    		else if(c == '4') 
    			Serial.println(F("Now Testing 12V Solenoid Valve - 3/4''"));
            else
            {
                Serial.println(F("illegal input!"));
                return 0;
            }
            time0 = millis();
            return c;
        }
    }
}
