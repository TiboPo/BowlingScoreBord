int worpen = 0;
int spelerNummer = 0;
int tijd = 0;
int actief = 0;
int kegel3 = 0;

void setup() {
  Serial.begin(9600);
  pinMode(A3, INPUT);
  pinMode(A4, INPUT);
  pinMode(A0, INPUT);
  }
void loop() {
  int knop1 = digitalRead(A3);
  int knop2 = digitalRead(A4); 
  int sensor = digitalRead(A0);
        if (knop1 == 1) {
            actief = 1;
            tijd = 0;
            worpen++;
            if (worpen == 4) {
                spelerNummer++;
                worpen = 1;
            }
        }
        if (knop2 == 1) {
            actief = 0;
            if (sensor == 1) {
                kegel3 = 1;
            } else {
                kegel3 = 0;
            }
        }
        if (actief == 1) {
            tijd++;
        }
        if (spelerNummer == 6) {
            spelerNummer = 0;
        }
        delay(250);
        Serial.print("t"+String(tijd));
        Serial.print("s"+String(actief));
        Serial.print("w"+String(worpen));
        Serial.print("n"+String(spelerNummer));
        Serial.print("k"+String(kegel3));
        Serial.println("/");
    }
