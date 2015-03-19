package nyc.c4q.Amcbri15;

/**
 * Created by c4q-anthony-mcbride on 3/18/15.
 */
public class DivisorArt {

    public static void divArt(int n) {

        for (int i = 1; i <= n; i++) {
            String pattern = "";

            for (int j = 1; j <= n; j++) {
                if (i % j == 0) {
                    pattern += "@ ";
                }
                else if (j % i == 0) {
                    pattern += "@ ";
                }
                else{
                    pattern += "  ";
                }
            }
            System.out.println(pattern);
        }
    }

    public static void main(String[] args) {
            divArt(12);
    }
}
