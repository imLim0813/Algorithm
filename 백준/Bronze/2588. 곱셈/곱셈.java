import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String a_str = scanner.nextLine();
        String b = scanner.nextLine();
        int a = Integer.parseInt(a_str);

        for (int i=b.length() - 1; i >= 0; i --)
        {
            int tmp = (b.charAt(i) - '0');
            System.out.println(a * tmp);
        }
        System.out.println(a * Integer.parseInt(b));
    }
}