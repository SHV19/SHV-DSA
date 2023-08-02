package SelectionSort;

import java.util.Arrays;

public class DescSelectionSort {

    public static void main(String[] args) {
        int arr[] = {125,0,-69,-96,38};
        Descselection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void Descselection(int a[]){
        int last = a.length -1;

        for (int i = 0; i < a.length ; i++) {
            int start = i;
            int maxIndex = getMaxIndex(a, start, last);
            swap(a,start,maxIndex );
        }

    }

    static void swap(int a[], int start, int minIndex){

        int temp = a[start];
        a[start] = a[minIndex];
        a[minIndex] = temp;

    }

    static int getMaxIndex(int a[], int start, int last){
        int max=start;
        for (int i = start; i <= last; i++) {

            if(a[max]<a[i]){
                max = i;
            }

        }
        return max;
    }
}
