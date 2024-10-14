package BeeCrowd.Repeticao;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class B1074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int numEntradas = sc.nextInt();
        List<Integer> n = new ArrayList<>();
        String saida;

        for (int i = 0; i < numEntradas; i++) {
            n.add(sc.nextInt());
        }

        for (int i = 0; i < n.size(); i++) {
            if (n.get(i) < 0) {
                if(n.get(i) % 2 == 0){
                    System.out.println("EVEN NEGATIVE");
                }else{
                    System.out.println("ODD NEGATIVE");
                }
            }
            if (n.get(i) > 0){
                if (n.get(i) % 2 == 0){
                    System.out.println("EVEN POSITIVE");
                }else {
                    System.out.println("ODD NEGATIVE");
                }
            }else if (n.get(i) == 0){
                System.out.println("NULL");
            }
        }
        
    }
}
