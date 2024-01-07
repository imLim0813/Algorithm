import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int cnt = Integer.parseInt(scanner.nextLine());
        char[] text = scanner.nextLine().toCharArray();
        int ans = 0;

        for (int idx = 0; idx < cnt; idx++)
        {
            ans += Integer.parseInt(String.valueOf(text[idx]));
        }
        System.out.println(ans);
    }
}