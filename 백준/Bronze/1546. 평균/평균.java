//num = int(input())
//
//        tmp = list(map(int, input().split()))
//        tmp = [i / max(tmp) * 100 for i in tmp]
//
//        print(sum(tmp) / num)

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        String tmp = scanner.nextLine();
        String[] num_list = tmp.split("\\s");

        int max = 0;
        for (String temp: num_list)
        {
            if (Integer.parseInt(temp) > max)
            {
                max = Integer.parseInt(temp);
            }
        }

        double result = 0;
        for (int idx = 0; idx < num_list.length; idx++)
        {
            result += Double.parseDouble(num_list[idx]) / max * 100;
        }

        System.out.print(result / num);
    }
}