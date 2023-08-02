package Recursion;

public class MinMax {
    public static void main(String[] args) {
        int a[] = {1,-2,3};
        int l = a.length;
//        int op = mins(a,l);
//        System.out.println(op);
        System.out.println("Min: " + mins(a,l));
        System.out.println("Max: " + maxs(a,l));
    }

    static int mins(int[] arr, int n){
        if(n==1){
            return arr[0];
        }
        return Math.min(arr[n-1],mins(arr,n-1));
    }

    static int maxs(int[] arr, int n){
        //Base Condition
        if(n==1){
            return arr[0];
        }

        return Math.max(arr[n-1],maxs(arr,n-1));

    }
}
