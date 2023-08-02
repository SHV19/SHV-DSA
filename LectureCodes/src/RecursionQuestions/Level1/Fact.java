package RecursionQuestions.Level1;

public class Fact {
    public static void main(String[] args) {
        int ans = factNum(5);
        System.out.println(ans);
    }

    static int factNum(int n){
        if(n<=1){
            return 1;
        }
        return n * factNum(n-1);
    }
}
