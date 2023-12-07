import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        int num = divide_by_four(tmp);
        
        tmp = "";
        for (int i = 0; i < num; i++){
            tmp += "long ";
        }
        tmp += "int";
        System.out.println(tmp);
    }
    
    static int divide_by_four(String num)
    {
        int num2;
        num2 = Integer.parseInt(num);
        if ((num2 % 4) == 0) {
            return (num2 / 4);
        } else{
            return (num2 / 4) + 1;
        }
    }
}