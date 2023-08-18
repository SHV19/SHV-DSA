package SortingAlgos.InsertionSort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int a[] = {5,4,3,2,1};

        Isort(a);
        System.out.println(Arrays.toString(a));
    }

    static void Isort(int a[]){

        for (int i = 0; i <= a.length-2; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(a[j]<a[j-1]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
                else {
                    //System.out.println("I visted Here");
                    break;
                }
            }
        }
    }
}
