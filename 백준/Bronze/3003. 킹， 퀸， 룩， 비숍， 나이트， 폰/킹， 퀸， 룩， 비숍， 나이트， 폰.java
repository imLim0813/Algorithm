import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] tmp = scanner.nextLine().split("\\s");
        int[] num = {1, 1, 2, 2, 2, 8};

        for (int i=0; i < tmp.length; i++)
        {
            System.out.printf(String.valueOf(num[i] - Integer.parseInt(tmp[i])) + " ");
        }
    }
}