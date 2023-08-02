package Patterns.InOrder;



public class Pattern6 {
    public static void main(String[] args) {
        p6(5);
    }

    static void p6(int n){

        for (int row = 1; row <= n; row++) {
            int space = n-row;
            for (int s = 0; s < space ; s++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
}
