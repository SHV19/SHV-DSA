package SortingAlgos.CyclicSort;

import java.util.*;


//In cyclic sort duplicate elements will be at end of the array. So same algorithm for duplicated array as well.
public class CyclicSorting {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,2};
        cSort(a);
        System.out.println(Arrays.toString(a));


    }

    static void cSort(int a[]){

        //It give correct output but it again uses 2 loop(for & while) statements, we need to use only loop statements
        /* for (int i = 0; i < a.length;i++) {
            while(i != a[i]-1){
                int temp = a[i];
                a[i] = a[a[i]-1];
                a[temp-1] = temp;

            }
        }*/

        int i = 0;
        while(i < a.length){
            int correctIndex = a[i] - 1;
            if(a[i] != a[correctIndex]){
                swap(a, i, correctIndex);
            }
            else{
                i++;
            }
        }


    }

    static void swap(int a[], int first, int second){
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }


}
