package nyc.c4q.Amcbri15;

/**
 * Created by c4q-anthony-mcbride on 3/18/15.
 */
public class DivisorArt {
    public static void pattern(int N){
        String lPattern = "";


        for (int i = 0; i < N; i++) {

                System.out.println("@ ");

            for (int j = 0; j < N; j++) {

                if (j % N == 0 || N % j == 0) {
                    System.out.print("@ ");
                } else {
                    System.out.print("  ");
                }
            }
        }

    }
    public static void main(String[] args) {
        pattern(4);
    }
}
