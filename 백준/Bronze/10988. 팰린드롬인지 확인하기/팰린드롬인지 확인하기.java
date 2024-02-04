import java.util.Scanner;

public class Main
{
    public static int palindrome(char[] text)
    {
        int LEN = text.length;
        for (int idx = 0; idx < LEN / 2; idx ++)
        {
            if (text[idx] != text[LEN-1-idx])
            {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        char[] text = scanner.nextLine().toCharArray();

        System.out.println(palindrome(text));
    }
}