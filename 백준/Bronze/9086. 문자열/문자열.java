import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int idx = 0; idx < num; idx++)
        {
            char[] tmp = scanner.nextLine().toCharArray();
            System.out.print(tmp[0]);
            System.out.print(tmp[tmp.length - 1]);
            System.out.println();
        }
    }
}