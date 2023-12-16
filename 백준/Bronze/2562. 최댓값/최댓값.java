import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] arr_ = new int[9];
        for (int i = 0; i < 9; i++)
        {
            arr_[i] = Integer.parseInt(scanner.nextLine());
        }
        int max_val = Arrays.stream(arr_).max().getAsInt();
        System.out.println(max_val);

        for (int i = 0; i < 9; i++)
        {
            if (arr_[i] == max_val){
                System.out.println(i + 1);
                break;
            }
        }
    }
}