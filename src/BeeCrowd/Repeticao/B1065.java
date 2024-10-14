package BeeCrowd.Repeticao;
import java.util.Locale;
import java.util.Scanner;

public class B1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int pares = 0;
        int N;

        for (int i = 0; i < 5 ; i++) {
            N = sc.nextInt();
            if (N >= 0){
                pares += 1;
            }
        }
        System.out.println(pares + " valores pares");
    }
}
