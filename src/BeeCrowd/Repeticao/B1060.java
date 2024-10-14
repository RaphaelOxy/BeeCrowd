package BeeCrowd.Repeticao;

import java.util.Locale;
import java.util.Scanner;

public class B1060 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int contador = 0;

        for (int i = 1; i <= 6; i++) {
            double N = sc.nextDouble();

            if (N >= 0) {
                contador++;
            }
        }
        System.out.println(contador + " valores positivos");

        
    }
}
