import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("\\s");
        
        int ans = 0;
        for (String txt : text)
        {
            if (txt.equals(""))
            {
                continue;
            }
            else
            {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}