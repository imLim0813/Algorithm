import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int cnt = Integer.parseInt(scanner.nextLine());
        int N = cnt;

        for (int tmp=0; tmp < cnt; tmp++)
        {
            char[] text = scanner.nextLine().toCharArray();
            for (int idx=0; idx < text.length - 1; idx++)
            {
                boolean trig = false;
                if (text[idx] != text[idx+1]) {
                    for (int idx_1=idx+1; idx_1<text.length; idx_1++)
                    {
                        if (text[idx] == text[idx_1])
                        {
                            N -= 1;
                            trig = true;
                            break;
                        }
                    }
                }
                if (trig)
                {
                    break;
                }
            }
        }
        System.out.println(N);
    }
}