package RecursionQuestions.Level1;

public class PrintNum {
    public static void main(String[] args) {
        int n = 5;

       //printNums(n);

        printNumsRev(n);
    }

    static void printNumsRev(int n){

        if(n== 0){
            return;
        }

        System.out.println(n);
            printNumsRev(n-1);
            //printNumsRev(--n); //This will also work

        // n--(Pass the value then subtract(will subtract once the function is over, but in recursion it call itself so its infinite)) v/s --n(Subtract then pass the value)

    }
    static void printNums(int n){

        if(n== 0){
            return;
        }

        printNums(n-1);
        System.out.println(n);

    }
}
