import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        
        int sum = 0;
        for (int i=1; i < (num+1); i++)
        {
            sum += i;
        }
        System.out.println(sum);
    }
}