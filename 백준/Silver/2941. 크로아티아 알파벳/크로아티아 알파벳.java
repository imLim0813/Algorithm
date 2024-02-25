import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] tmp = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String val: tmp)
        {
            text = text.replace(val, "0");
        }

        System.out.println(text.length());
    }
}
