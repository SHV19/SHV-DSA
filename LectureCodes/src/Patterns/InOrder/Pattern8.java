package Patterns.InOrder;

public class Pattern8 {
    public static void main(String[] args) {
        p8(5);
    }

    static void p8(int n){
        for (int row = 1; row <= n; row++) {

            for (int s = 1; s <= n - row; s++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= 2*row - 1; col++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
        
        
    }
}
