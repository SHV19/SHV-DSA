package RecursionQuestions.Level1;

public class CountOfZeros {

    public static void main(String[] args) {
        int n = 120069504;
        int ans = count(n);
        System.out.println(ans);
    }

    static int count(int n){

       return helper(n,0);
    }

    static int helper(int n, int c){
        if(n == 0){
            return c;
        }

        if(n%10 == 0){
            return helper(n/10, c+1);
        }

        return helper(n/10,c);
    }
}
