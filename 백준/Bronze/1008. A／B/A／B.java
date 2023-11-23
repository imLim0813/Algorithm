import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split("\\s");
        System.out.println(Double.parseDouble(array[0]) / Double.parseDouble(array[1]));
    }
}