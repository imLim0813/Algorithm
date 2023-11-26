import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split("\\s");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);

        if (a > b)
        {
            System.out.println('>');
        }
        else if (a < b)
        {
            System.out.println('<');
        }
        else
        {
            System.out.println("==");
        }
    }
}