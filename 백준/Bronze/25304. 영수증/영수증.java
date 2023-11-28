import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int tmp = Integer.parseInt(scanner.nextLine());
        int num = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i=0; i<num; i++)
        {
            String[] array = scanner.nextLine().split("\\s");
            sum += (Integer.parseInt(array[0]) * Integer.parseInt(array[1]));
        }
        
        if (tmp == sum)
        {
            System.out.println("Yes");    
        }
        else
        {
            System.out.println("No");
        }
    }
}