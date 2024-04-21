import java.util.*;

public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> score = new HashMap<>();
        score.put("A+", 4.5);
        score.put("A0", 4.0);
        score.put("B+", 3.5);
        score.put("B0", 3.0);
        score.put("C+", 2.5);
        score.put("C0", 2.0);
        score.put("D+", 1.5);
        score.put("D0", 1.0);
        score.put("F",  0.0);

        String[] tmp;
        double val1 = 0.0;
        double val2 = 0.0;

        for (int idx=0; idx<20; idx++){
            String text = scanner.nextLine();
            tmp = text.split(" ");

            if (tmp[2].equals("P")){
                continue;
            }
            val1 += Double.parseDouble(tmp[1]) * score.get(tmp[2]);
            val2 += Double.parseDouble(tmp[1]);
        }
        System.out.print(val1 / val2);
    }
}
