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
            printMessage("Die Quadratzahl von " + i + " ist " + i * i + "\n");
        }

        printMessage("\n\n");
    }

    public static void printMessage(String message)
    {
        System.out.println(message);
    }
}



