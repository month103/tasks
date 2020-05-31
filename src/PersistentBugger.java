public class PersistentBugger {
    public static void main(String[] args) {
        long n = 39;
        int count = 0;
        while (n > 9){
            String g = "" + n;
            String[] m = g.split("") ;
            n = 1;
            for (int i = 0; i < m.length; i++) {

                n *= Integer.parseInt(m[i]);
            }
            count++;
        }
        System.out.println(count);
    }
}
