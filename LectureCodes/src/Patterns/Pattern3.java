package Patterns;
//5.      *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *
public class Pattern3 {
    public static void main(String[] args) {
        p3(3);

        //In this there is a repeation of code. DRY
        /*for (int i = 1; i <= 5; i++) {
            if(i == 5){
                for (int k = i-1; k >= 0; k--) {
                    for (int l = k; l >= 0; l--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
            else{
                for (int j = 1; j <= i ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }*/



    }

    static void p3(int n){

        //In this there is a repeation of code. DRY
/*        for (int row = 1; row <= 2*n + 1 ; row++) {

            if(row>n){

                for (int col = (n - (row - n )); col > 0 ; col--) {
                    System.out.print("*");
                }
                System.out.println();

            }
            else{
                for (int col = 1; col <= row ; col++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }*/

        //Optimized code

        for (int row = 1; row <= 2*n + 1 ; row++) {

            int noOfCol = row > n ? 2*n - row : row;

            for (int col = 1; col <= noOfCol; col++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
