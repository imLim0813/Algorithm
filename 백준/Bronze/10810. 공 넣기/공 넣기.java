import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] tmp = scanner.nextLine().split("\\s");
        int cnt = Integer.parseInt(tmp[1]);
        int bag_num = Integer.parseInt(tmp[0]);
        int[] bag = new int[bag_num];

        for (int idx = 0; idx < cnt; idx++)
        {
            String[] num_lst = scanner.nextLine().split("\\s");
            for (int idx_ = Integer.parseInt(num_lst[0]) - 1; idx_ < Integer.parseInt(num_lst[1]); idx_++)
            {
                bag[idx_] = Integer.parseInt(num_lst[2]);
            }
        }

        for (int num : bag)
        {
            System.out.print(num + " ");
        }
    }
}