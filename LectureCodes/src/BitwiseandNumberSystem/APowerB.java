package BitwiseandNumberSystem;

public class APowerB {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int ans = 1;
        int base = 3;
        while (b>0){

            if((b&1) == 1){
                ans = ans * base;
            }
            base = base * base;
            b = b>>1;
        }

        System.out.println(ans);
    }
}
