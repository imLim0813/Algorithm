import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Main
{
    public static void main(String[] args)
    {
        // bag 리스트 생성
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        String[] arr = num.split("\\s");

        int[] bag = new int[Integer.parseInt(arr[0])];

        for (int i=0; i < Integer.parseInt(arr[0]); i++)
        {
            bag[i] = (i + 1);
        }

        //

        for (int i=0; i<Integer.parseInt(arr[1]);i++) {
            num = scanner.nextLine();
            String[] arr_2 = num.split("\\s");
            int idx_1 = Integer.parseInt(arr_2[0]);
            int idx_2 = Integer.parseInt(arr_2[1]);

            while (idx_1 < idx_2) {
                int temp = bag[idx_1 - 1];
                bag[idx_1 - 1] = bag[idx_2 - 1];
                bag[idx_2 - 1] = temp;
                idx_1++;
                idx_2--;
            }
        }

        for (int tmp: bag)
        {
            System.out.printf(tmp + " ");
        }
    }
}