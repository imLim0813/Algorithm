import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split("\\s");
        int plus = Integer.parseInt(scanner.nextLine());
        int hour = Integer.parseInt(array[0]);
        int minute = Integer.parseInt(array[1]);
        minute += plus;

        System.out.printf("%d %d", (hour + (minute / 60)) % 24, minute % 60);
    }
}