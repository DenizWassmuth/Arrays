import java.util.Scanner;

public class Main
{
    public static void main()
    {
        printMessage("\nLevel 1 - easy");

        int[] zahlen = new int[5];
        zahlen[0] = 1;
        zahlen[1] = 2;
        zahlen[2] = 3;
        zahlen[3] = 4;
        zahlen[4] = 5;

        for(int i = 0; i < zahlen.length; i++)
        {
            printMessage("index " + i + " = " + zahlen[i]);
        }
    }

    public static void printMessage(String message){

        System.out.println(message);
    }
}



