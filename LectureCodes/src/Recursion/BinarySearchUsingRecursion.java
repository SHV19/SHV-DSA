package Recursion;

public class BinarySearchUsingRecursion {
    public static void main(String[] args) {

        int a[] = {1,2,3,4,5};
        int tar  = 3;
        int op = search(a,tar);
        System.out.println(op);

    }

    static int search(int[] nums, int target) {

        return bs(nums, target,0,nums.length-1);

    }
    static int bs(int a[], int t, int s, int e){

            int m = (s+e)/2;

            if(a[m] == t){
                return m;
            }

            if(t < a[m]){
                return bs(a,t,s,m-1);
            }

            return bs(a,t,m+1,e);
    }
}
