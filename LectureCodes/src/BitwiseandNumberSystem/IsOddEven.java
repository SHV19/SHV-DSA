package BitwiseandNumberSystem;

public class IsOddEven {
    public static void main(String[] args) {
        int n = 18;
        System.out.println(oddEven(n));
    }

    static boolean oddEven(int n){
        return (n&1) == 1;
    }
}
