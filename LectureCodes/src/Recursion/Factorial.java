package Recursion;

public class Factorial {
    public static void main(String[] args) {

        int op = fact(3);
        System.out.println(op);
    }

    static int fact(int n){

        //Base Condition
        if(n>0){
            return n*fact(n-1);
        }
        return 1;

    }

}
