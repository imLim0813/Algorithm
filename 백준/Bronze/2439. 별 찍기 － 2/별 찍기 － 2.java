import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < N; i++){

            for (int j = 0; j < N-(i+1); j++){
                System.out.printf(" ");
            }

            for (int j = 0; j <= i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}