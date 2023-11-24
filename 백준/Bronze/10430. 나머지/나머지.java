import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split("\\s");
        int A = Integer.parseInt(array[0]);
        int B = Integer.parseInt(array[1]);
        int C = Integer.parseInt(array[2]);

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C) * (B%C))%C);
    }
}