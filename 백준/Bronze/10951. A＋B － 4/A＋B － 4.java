import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try{            
                String s = scanner.nextLine();
                int num1 = Integer.parseInt(s.split("\\s")[0]);
                int num2 = Integer.parseInt(s.split("\\s")[1]);
                System.out.println(num1 + num2);
            } catch (Exception e){
                break;
            }
        }
    }
}