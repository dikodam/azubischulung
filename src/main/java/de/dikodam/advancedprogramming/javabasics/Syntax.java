package de.dikodam.advancedprogramming.javabasics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Syntax {

public static void main(String[] args) {

// Einzeiler Kommentare

/*
Mehrzeiler
Kommentar
*/

// Variablendeklaration/Zuweisung

String variablenname = "wert";

// if-else

int bblaaa = 5;

if (bblaaa > 5) {
System.out.println("Zahl ist voll groß");
} else if (bblaaa > 2) {
System.out.println("Zahl geht klar");
} else {
System.out.println("Zahl zu klein");
}

// schleifen

// einfache for

for (int i = 12; i < 27; i++) {
// 27 - 12 -> 15
System.out.println("ENTE");
}

// enhanced for
int[] zahlen = {1, 2, 4, 5, 6};
// for i in zahlen:
for (int zahl : zahlen) {
System.out.println("Zahl zum quadrat ist: " + zahl * zahl);
}

int zaehler = 0;
while (zaehler < 5) {
System.out.println("upsi, Endlosschleife");
zaehler++;
}

int zahl = 0;

//        System.out.println(zahl++);
//        System.out.println("Zahl ist jetzt aber " + zahl);
System.out.println(zahl++);
zahl--;
--zahl;

// Zuweisung mit Operator

zahl += 3;
zahl *= 3;
zahl -= 3;
zahl /= 3;

// boolsche operatoren
// AND
System.out.println(true && true); // true
System.out.println(true && false); // false
System.out.println(false && false); // false
// OR
System.out.println(true || true); // true
System.out.println(true || false); // true
System.out.println(false || false); // false
// NOT
System.out.println(!true); // false
System.out.println(!false); // true
// XOR
System.out.println(true ^ true); // false
System.out.println(true ^ false); // true
System.out.println(false ^ false); // false

// Vergleiche

boolean ergebnis;
ergebnis = 1 == 2;
ergebnis = 1 != 2;
ergebnis = 1 > 2;
ergebnis = 1 >= 2;
ergebnis = 1 < 2;
ergebnis = 1 <= 2;

// Arrays haben feste Länge

int[] arraySize5 = new int[5];
// System.out.println(arraySize5[5]); // java.lang.ArrayIndexOutOfBoundsException: 5

int[] arrayVordefiniert = new int[]{1, 2, 3, 4};
System.out.println("vordefiniertes Array hat Länge " + arrayVordefiniert.length);

}

}
