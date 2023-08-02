package BitwiseandNumberSystem;

public class BaseDigit {
    public static void main(String[] args) {
        int n = 4;
        int b =2;

      //int ans = (int)(Math.log(n)/Math.log(b))+1;
        int ans = 1<<(n-1); //Pascal Triangle - Sum of nth row

        System.out.println(ans);

    }

}
