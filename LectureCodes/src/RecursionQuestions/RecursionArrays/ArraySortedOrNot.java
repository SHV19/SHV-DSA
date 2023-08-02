package RecursionQuestions.RecursionArrays;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int a[] = {1,2,8,4};

        System.out.println(check(a));
    }

    static boolean check(int a[]){

        return helper(a,0);
    }

    static boolean helper(int a[], int i){
        if(i == a.length-1){
            return true;
        }

        return a[i] < a[i+1] && helper(a,i+1);
    }
}
