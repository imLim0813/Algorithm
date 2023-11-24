import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split("\\s");
        long tmp = 0;
        for (int i=0; i <= 2; i++)
        {
            tmp += Long.parseLong(array[i]);
        }
        System.out.println(tmp);
    }
}