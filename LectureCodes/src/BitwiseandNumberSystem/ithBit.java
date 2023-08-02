package BitwiseandNumberSystem;

public class ithBit {
    public static void main(String[] args) {
        int a = 1001101001;
        int n = 5;
        System.out.println(bitAns(a,n));
    }

    private static int bitAns(int a,int n) {


        return (1<<(n-1)) & a;
    }
}
