import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int cnt = Integer.parseInt(scanner.nextLine());
        String[] arr = scanner.nextLine().split("\\s");
        int find_num = Integer.parseInt(scanner.nextLine());
        int ans = 0;

        for (String num : arr){
            if (Integer.parseInt(num) == find_num){
                ans += 1;
            }
        }

        System.out.println(ans);
    }
}

//11
//1 4 1 2 4 2 4 2 3 4 4
//2