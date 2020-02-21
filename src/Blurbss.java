import java.util.Random;
import java.util.Scanner;

public class Blurbss //naming corresponds to
{
    // random number generator used by all functions
    public static Random r = new Random();

    public static String Blurb()
    {
        String result = Whoozit(); // A Blurb is a Whoozit
        int num = r.nextInt(9) + 1;
        for (int i = 0; i < num; i++) //followed by one or more Whatzits.
        {
            result += Whatzit();
        }
        return result;
    }

    public static String Whoozit()
    {
        String result = "x"; // A Whoozit is the character 'x' ...
        int num = r.nextInt(9);
        for (int i = 0; i < num; i++)
        {
            result += "y"; // followed by zero or more 'y's.
        }
        return result;
    }

    public static String Whatzit()
    {
        String result = "q"; // A Whatzit is a 'q'
        int num = r.nextInt(2);
        if (num == 0)
        {
            result += "z"; // followed by either a 'z' or a 'd',
        }
        else // (num == 1)
        {
            result += "d";
        }
        result += Whoozit(); // followed by a Whoozit.
        return result;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("This program makes Blurbs.");
        System.out.println("How many blurbs do you want?");
        int n = scan.nextInt();
        while (n > 0)
        {
            System.out.println(Blurb());
            n--;
        }
    }
}