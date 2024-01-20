import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();

        for (int idx=0; idx<cnt; idx++)
        {
            int repeat = scanner.nextInt();
            String text = scanner.next();

            for (int j=0; j < text.length(); j++)
            {
                for (int k=0; k < repeat; k++)
                {
                    System.out.print(text.charAt(j));
                }
            }
            System.out.println();
        }
    }
}