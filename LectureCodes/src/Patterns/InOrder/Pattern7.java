package Patterns.InOrder;

public class Pattern7 {
    public static void main(String[] args) {
        p7(5);
    }

    static void p7(int n){

        for (int row = 0; row < n; row++) {
            for (int s = 0; s < row ; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < n-row ; col++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}
