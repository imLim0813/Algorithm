import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String[] tmp = scanner.nextLine().split("\\s");

        int[] bag = new int[Integer.parseInt(tmp[0])];
        for (int idx = 0; idx < Integer.parseInt(tmp[0]); idx++)
        {
            bag[idx] = idx + 1;
        }

        for (int idx = 0; idx < Integer.parseInt(tmp[1]); idx++)
        {
            String[] tmp_ = scanner.nextLine().split("\\s");
            int idx_1 = Integer.parseInt(tmp_[0]) - 1;
            int idx_2 = Integer.parseInt(tmp_[1]) - 1;

            int val = bag[idx_1];
            bag[idx_1] = bag[idx_2];
            bag[idx_2] = val;
        }

        for (int idx = 0; idx < bag.length; idx++)
        {
            System.out.print(bag[idx] + " ");
        }
    }
}