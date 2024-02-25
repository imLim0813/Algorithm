import java.util.Dictionary;
import java.util.HashMap;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toUpperCase();
        int[] count = new int[26];

        for(char val: text.toCharArray())
        {
            count[val-'A']++;
        }

        int tmp = 0;
        char ans = 'A';

        for(int idx=0; idx<count.length; idx++)
        {
            if(count[idx] > tmp)
            {
                tmp = count[idx];
                ans = (char) (idx + 'A');
            }
            else if (count[idx] == tmp)
            {
                ans = '?';
            }
        }

        System.out.println(ans);
    }
}
