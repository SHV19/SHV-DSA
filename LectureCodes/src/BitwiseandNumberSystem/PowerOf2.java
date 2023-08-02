package BitwiseandNumberSystem;

public class PowerOf2 {
    public static void main(String[] args) {
        int n = 18;
        int count = 0;
        while(n>0){

            if((n&1) == 1){
                count++;
            }
            n = n>>1;
        }

        if (count == 1){
            System.out.println("Power Of 2");
        }
        else {
            System.out.println("No");
        }
       /* int check = n & (n - 1);
        if (check == 0) {
            System.out.println("Power Of 2");
        } else {
            System.out.println("No");

        }*/


    }
}
