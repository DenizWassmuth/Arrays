import java.util.Scanner;

public class Main
{
    static void main() {

        printMessage("\nLEVEL 1 - EASY\n");

        // 1. Einfache Zahlenfolge ausgeben
        printMessage("1. Einfache Zahlenfolge ausgeben\n");

        int[] zahlen = new int[5];
        zahlen[0] = 1;
        zahlen[1] = 2;
        zahlen[2] = 3;
        zahlen[3] = 4;
        zahlen[4] = 5;

        for (int i = 0; i < zahlen.length; i++)
        {
            printMessage("index " + i + " = " + zahlen[i]);
        }

        printMessage("\n");


        // 2. Alle Elemente eines Arrays anzeigen
        printMessage("2. Alle Elemente eines Arrays anzeigen\n");

        String[] namen = {"Max", "Ben", "Flo", "Ila", "Lia"};
        for (String s : namen)
        {
            printMessage(s);
        }

        printMessage("\n");


        // 3.Quadratzahlen berechnen
        printMessage("3.Quadratzahlen berechnen\n");

        int[] quadratZahlen = {2,4,6,8};

        for (int i : quadratZahlen)
        {
            printMessage("Die Quadratzahl von " + i + " ist " + i * i);
        }

        printMessage("\n\n");

        printMessage("\nLEVEL 2 - MEDIUM\n");

        //1. Nur gerade Zahlen ausgeben
        printMessage("1. Nur gerade Zahlen ausgebn\n");

        int[] nurGeradeZahlen = {1,2,3,4,5,6,7,8,9,10};
        for (int i : nurGeradeZahlen)
        {
            if (i % 2 == 0)
            {
                printMessage(String.valueOf(i));
            }
        }

        printMessage("\n\n");


        // 2. Summe berechnen
        printMessage("2. Summe berechnen\n");

        int[] beliebigeZahlen = {3,6,7,8,22,56,88,179,21,55,};

        int summe = 0;
        for (int i : beliebigeZahlen)
        {
            int zwischenSumme = summe;
            summe += i;
            printMessage("Die Summe aus " + zwischenSumme + " und " + i + " ist " + summe);
        }

        printMessage("\n\n");


        // 3. Index mit ausgeben
        printMessage("3. Index mit ausgeben\n");

        String[] staedteNamen = {"Berlin", "Hamburg", "Wuppertal", "München", "Köln"};
        for (int i = 0; i < staedteNamen.length; i++)
        {
            printMessage("index " + i + " = " + staedteNamen[i]);
        }

        printMessage("\n\n");


        // 4. Minimum und Maximum finden
        printMessage("4. Minimum und Maximum finden\n");

        int[] minMaxZahlen = {206,899,7,66,22,11,88,179,21,1001,};

        int min = minMaxZahlen[0];
        int max = minMaxZahlen[0];

        for (int i : minMaxZahlen)
        {
            if (i < min)
            {
                min = i;
            }

            if (i > max)
            {
                max = i;
            }

            printMessage(String.valueOf(i));
        }

        printMessage("");

        printMessage("min = " + min);
        printMessage("max = " + max);


        printMessage("\n\n");

        printMessage("\nLEVEL 3 - Bonus\n");

        // 1. Array-Werte verdoppeln
        printMessage("1. Array-Werte verdoppeln\n");

        int[] doppelWerte = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < doppelWerte.length; i++)
        {
            printMessage("alter Wert auf index " + i + " = " + doppelWerte[i]);

            int doppelWert =  doppelWerte[i] * 2;
            printMessage(doppelWerte[i] + " verdoppelt = " + doppelWert);

            doppelWerte[i] = doppelWert;

            printMessage("neuer Wert auf index " + i + " = " + doppelWerte[i] + "\n");
        }


        printMessage("\n\n");

        // 2. Arrays kombinieren
        printMessage("2. Arrays kombinieren\n");

        String[] vornamen = {"Max", "Frida", "Loki", "Paul", "Anna"};
        String[] nachnamen = {"Schmidt", "Lore", "Nordmann", "Fitze", "Siebert"};
        for (int i = 0; i < vornamen.length; i++)
        {
            String nachname = "None";
            boolean bHasNoName = nachnamen.length - (i + 1) < 0;
            if (!bHasNoName)
            {
                nachname = nachnamen[i];
            }

            String vorUndNachname = vornamen[i] + " " + nachname;
            printMessage(vorUndNachname);
        }


        printMessage("\n\n");

        // 3. Benutzereingabe verarbeiten
        printMessage("3. Benutzereingabe verarbeiten\n");

        Scanner scanner = new Scanner(System.in);

        int[] eingabe = new int[5];

        for (int i = 0; i < eingabe.length; i++)
        {
            printMessage("Bitte geben sie eine Zahl ein!");
            eingabe[i] = scanner.nextInt();
        }

        printMessage("\n");

        for (int i: eingabe)
        {
            printMessage(String.valueOf(i));
        }

        printMessage("\n\n");

        // 4. einfacher Notenrechner
        printMessage("4. einfacher Notenrechner\n");

        int[] noten = {80,90,60,50,100};

        printMessage("Deine bisherigen Noten: ");
        for (int i = 0; i < noten.length; i++)
        {
            printMessage(String.valueOf(noten[i]));
        }

        printMessage("\nAb welchem Durchschnitt hat man bestanden? ");
        int durchschnit = scanner.nextInt();

        int summe = 0;
        for (int i : noten)
        {
            summe += i;
        }

        String bestanden = "Du hast bestanden!";
        boolean bBestanden = summe / noten.length >= durchschnit;
        if (!bBestanden)
        {
            bestanden = "Du hast nicht bestanden!";
        }

        printMessage(bestanden);


    }

    public static void printMessage(String message)
    {
        System.out.println(message);
    }



}



