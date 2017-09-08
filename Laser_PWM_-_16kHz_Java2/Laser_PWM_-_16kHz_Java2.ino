int laserInt = 0;
byte inShort[2];
int a = 0;
int nBytes;

//Code block for converting arrays to integers: https://forum.arduino.cc/index.php?topic=119262.0
union ArrayToInteger {
  byte array[2];
  int integer;
};

void setup() {
  TCCR1A = _BV(WGM21) | _BV(WGM20); //WGMx - fast PWM mode - Pins 9,10 (timer 2)
  TCCR1B = _BV(WGM22) | _BV(CS20); //WGMx - fast PWM mode, CS20 - set pre-scaler to 1
  OCR1A = 1024; //Set top of counter to 1024 (must be power of 2) - pins 9
  Serial.begin(9600);
  Serial.setTimeout(100); //Wait up to 1 second for full byte string
  pinMode(8, OUTPUT);
  pinMode(9, OUTPUT);
  pinMode(10, OUTPUT);
  pinMode(13, OUTPUT);
  digitalWrite(8, LOW);
  analogWrite(9, 0);
  analogWrite(10, 0);
  digitalWrite(13, LOW);

}
 
void loop() {
  if(Serial.available() > 0){
    Serial.readBytes(inShort, 2);
    ArrayToInteger converter; //Create a converter
    converter.array[0] = inShort[0];
    converter.array[1] = inShort[1];
    laserInt = converter.integer;
    if(laserInt >= 10000){
      laserInt -= 10000;
      analogWrite(9, laserInt);
    }
    else analogWrite(10, laserInt);
  }  
}
