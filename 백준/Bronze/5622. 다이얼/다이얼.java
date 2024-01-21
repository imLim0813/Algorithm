import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        char[] text = scanner.nextLine().toCharArray();

        String[] alphabet = {"ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

        int ans = 0;
        for (char txt: text)
        {
            for (int idx=0; idx < alphabet.length; idx++)
            {
                for (char tmp: alphabet[idx].toCharArray())
                {
                    if (txt == tmp)
                    {
                        ans += idx + 3;
                    }
                    else
                    {
                        continue;
                    }
                }
            }
        }
        System.out.println(ans);
    }
}