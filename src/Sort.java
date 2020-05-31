import java.util.*;
import java.util.stream.Stream;

public class Sort {
    public static void main(String[] args) {
        String a = "2312";

            int[] b = Arrays.stream(a.split("")).mapToInt(Integer::parseInt).toArray();
            Arrays.sort(b);
            StringBuilder z = new StringBuilder();
            for (int i = 0; i < a.length(); i++) {
                z.append(b[i]);
            }
            String c = "" + z.reverse();
            System.out.println(Integer.parseInt(c));
    }
}
