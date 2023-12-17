import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        List<String> arr = new ArrayList<>();
        for (int i = 0; i < 30; i++)
        {
            arr.add(String.valueOf(i+1));
        }

        for (int i = 0; i < 28; i++)
        {
            arr.remove(scanner.nextLine());
        }

        System.out.println(arr.get(0));
        System.out.println(arr.get(1));
    }
}