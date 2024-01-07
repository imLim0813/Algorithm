import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] tmp = scanner.nextLine().split("");
        String num = scanner.nextLine();

        System.out.println(tmp[Integer.parseInt(num) - 1]);
    }
}