import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split("\\s");
        int hour = Integer.parseInt(array[0]);
        int minute = Integer.parseInt(array[1]);

        if (minute >= 45)
        {
            System.out.printf("%s %s", Integer.toString(hour), Integer.toString(minute - 45));
        }
        else
        {
            if (hour > 0)
            {
                System.out.printf("%s %s", Integer.toString(hour - 1), Integer.toString(minute + 15));
            }
            else
            {
                System.out.printf("%s %s", Integer.toString(hour + 23), Integer.toString(minute + 15));
            }
        }
    }
}