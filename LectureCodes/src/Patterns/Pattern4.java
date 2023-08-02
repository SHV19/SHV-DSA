package Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        p4(5);

    }

    static void p4(int n){
        for (int row = 1; row <= n; row++) {
            int spaces = n - row;
            for (int i = 1; i <= spaces; i++) {
                System.out.print(" ");
            }

            for (int col = 0; col < row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
