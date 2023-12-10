import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        int cnt = Integer.parseInt(tmp.split("\\s")[0]);
        int num = Integer.parseInt(tmp.split("\\s")[1]);
        
        tmp = scanner.nextLine();
        String[] arr_str = tmp.split("\\s");
        
        for (String num_2:arr_str)
        {
            if (Integer.parseInt(num_2) < num)
            {
                System.out.printf(num_2 + " ");
            }
        }
    }
}