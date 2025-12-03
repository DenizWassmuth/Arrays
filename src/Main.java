import java.util.Scanner;

public class Main
{
    static void main() {
        printMessage("\nLEVEL 1 - EASY\n");

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

        printMessage("\n\n");

        String[] namen = {"Max", "Ben", "Flo", "Ila", "Lia"};
        for (String s : namen)
        {
            printMessage(s);
        }

        printMessage("\n\n");

        int[] quadratZahlen = {2,4,6,8};

        for (int i = 0; i < quadratZahlen.length; i++)
        {
            printMessage("Die Quadratzahl von " + quadratZahlen[i] + " ist " + quadratZahlen[i] + quadratZahlen[i] + "\n");
        }

    }

    public static void printMessage(String message)
    {
        System.out.println(message);
    }
}



