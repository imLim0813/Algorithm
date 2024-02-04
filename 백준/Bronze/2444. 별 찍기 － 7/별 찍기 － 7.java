import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int NUM = Integer.parseInt(scanner.nextLine());

        for (int idx = 0; idx < NUM; idx++)
        {
            for (int j = 1; j < NUM - idx; j ++)
            {
                System.out.print(' ');
            }
            for (int j = 0; j < 2 * (idx + 1) - 1; j ++)
            {
                System.out.print('*');
            }
            System.out.println();
        }

        for (int idx = 0; idx < NUM; idx++)
        {
            for (int j = 0; j < idx+1; j++)
            {
                System.out.print(' ');
            }
            for (int j = 2 * (NUM - (idx+1)) - 1; j > 0; j--)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}