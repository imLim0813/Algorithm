import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        for (int idx = 0; idx < 10; idx++)
        {
            arr[idx] = (Integer.parseInt(scanner.nextLine()) % 42);
        }

        int ans = 0;
        for (int i=0; i < 10; i++)
        {
            if (arr[i] != 42)
            {
                ans += 1;
                for (int j = i+1; j<10; j++)
                {
                    if(arr[i] == arr[j])
                    {
                        arr[j] = 42;
                    }
                }
            }
            else
            {
                continue;
            }
        }
        System.out.println(ans);
    }
}