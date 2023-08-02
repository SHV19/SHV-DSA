package Recursion;

import java.util.Arrays;

//https://www.geeksforgeeks.org/sum-triangle-from-array/

public class SumOfTriangle {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        sumOfTri(a);
    }

    static void sumOfTri(int arr[]){

        if(arr.length==1){
            System.out.println(arr[0]);
            return;
        }
        int b[] = new int[arr.length-1];
        for (int i = 0; i < arr.length - 1; i++) {
                b[i] = arr[i] + arr[i+1];
        }
        sumOfTri(b);
        //System.out.println(Arrays.toString(arr));
    }
}
