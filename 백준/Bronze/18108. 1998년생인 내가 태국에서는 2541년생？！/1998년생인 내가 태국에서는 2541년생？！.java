import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int tmp = Integer.parseInt(scanner.nextLine());
        int DIFF = 2541 - 1998;
        System.out.println(tmp - DIFF);
    }
}