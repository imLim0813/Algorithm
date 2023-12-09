import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0; i < N; i++)
        {
            String s = scanner.nextLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);
            
            System.out.println("Case #" + (i+1) + ": " + (a+b));
        }
    }
}