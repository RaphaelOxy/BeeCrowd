package BeeCrowd.Repeticao;
import java.util.Scanner;

public class B1064 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = 0, media = 0, m = 0;
        int p = 0;

        for (int i = 1; i <= 6; i++) {
            N = sc.nextDouble();

            if(N >= 0) {
                p += 1;
                m += N;
            }
        }
        System.out.println(p + " valores positivos");
        media = (double) m / p;
        System.out.printf("%.1f\n", media);
    }
}
