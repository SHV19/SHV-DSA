package BitwiseandNumberSystem;

public class NoOfSetBit {
    public static void main(String[] args) {
        /*int a = 2;
        int count=0;
        while(a>0){
            if((a&1) == 1){
                count++;
            }

            a = a>>1;
        }
        System.out.println(count);*/

        int n = 45;
        int count = 0;

        while(n>0){
            count++;
            n = n - (n&(-n));

        }
        System.out.println(count);
    }
}
