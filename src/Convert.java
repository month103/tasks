import java.util.stream.Stream;

public class Convert {
    public static void main(String[] args) {

        String word = "recEde";
        String[] m = word.toLowerCase().split("");
        int count = 0;
        StringBuilder b = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < word.length() ; j++) {
                if (m[i].equals(m[j])){
                    count++;
                }
            }
            b.append(count > 1 ? ")" : "(");
            count = 0;
        }

        System.out.println(b);
    }
}
