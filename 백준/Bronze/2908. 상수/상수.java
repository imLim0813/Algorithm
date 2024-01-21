import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] num = scanner.nextLine().split("\\s");

        String tmp = "";
        for (int idx=0; idx<num[0].length(); idx++)
        {
            tmp += num[0].charAt(num[0].length()-1-idx);
        }
        int num1 = Integer.parseInt(tmp);

        tmp = "";
        for (int idx=0; idx<num[1].length(); idx++)
        {
            tmp += num[1].charAt(num[1].length()-1-idx);
        }
        int num2 = Integer.parseInt(tmp);

        if (num1 > num2)
        {
            System.out.println(num1);
        }
        else
        {
            System.out.println(num2);
        }
    }
}