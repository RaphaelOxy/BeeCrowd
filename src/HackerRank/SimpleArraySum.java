package HackerRank;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;


public class SimpleArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       List<Integer> ar = new ArrayList<>();
       int soma = 0;

        for (int i = 0; i < 6; i++) {
            int numero = sc.nextInt();
            ar.add(numero);
        }


        for (int i = 0; i < ar.size(); i++) {
            System.out.println(ar.get(i));
            soma += ar.get(i);
        }
        System.out.println(soma);
    }
}
