import java.util.Scanner;
import java.lang.Math;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split("\\s");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[1]);
        int c = Integer.parseInt(array[2]);
        
        if ((a == b) && (b == c))
        {
            System.out.println(10000 + a * 1000);
        }
        else if (a == b)
        {
            System.out.println(1000 + a * 100);
        }
        else if (b == c)
        {
            System.out.println(1000 + b * 100);
        }
        else if (a ==c)
        {
            System.out.println(1000 + c * 100);
        }
        else
        {
            System.out.println(Math.max(Math.max(a,b), Math.max(b, c)) * 100);
        }
    }
}