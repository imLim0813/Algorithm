import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int cnt = Integer.parseInt(scanner.nextLine());
        String[] arr = scanner.nextLine().split("\\s");

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (String num: arr){
            if (Integer.parseInt(num) > max){
                max = Integer.parseInt(num);
            }

            if (Integer.parseInt(num) < min){
                min = Integer.parseInt(num);
            }
        }

        System.out.println(min + " " + max);
    }
}