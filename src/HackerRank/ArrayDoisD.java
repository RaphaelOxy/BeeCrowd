package HackerRank;

public class ArrayDoisD {
    public static void main(String[] args) {
        int n = 3;

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    System.out.print("O");
                }else if (j + i == n-1){
                    System.out.print(" O");
                }else {
                    System.out.print(" X");
                }

            }
            System.out.println();

        }
    }
}
