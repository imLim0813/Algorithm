import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        String[] array = tmp.split("\\s");
        System.out.println(Integer.parseInt(array[0]) + Integer.parseInt(array[1]));
    }
}