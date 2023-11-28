import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        for (int i=0; i<num; i++)
        {
            String[] array = scanner.nextLine().split("\\s");
            System.out.println(Integer.parseInt(array[0]) + Integer.parseInt(array[1]));
        }
    }
}