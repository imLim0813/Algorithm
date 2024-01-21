import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
            try
            {
                System.out.println(scanner.nextLine());
            }
            catch (Exception e)
            {
                break;
            }
        }
    }
}