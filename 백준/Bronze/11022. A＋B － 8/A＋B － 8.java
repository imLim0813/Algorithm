// Case#1 : 1 + 1 = 2
import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0; i < N; i++)
        {
            String s = scanner.nextLine();
            int num1 = Integer.parseInt(s.split("\\s")[0]);
            int num2 = Integer.parseInt(s.split("\\s")[1]);
            
            System.out.println("Case #" + (i+1) + ": " + num1 + " + " + num2 + " = " + (num1+num2));
        }
    }
}