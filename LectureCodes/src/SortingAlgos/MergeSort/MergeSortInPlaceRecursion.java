package SortingAlgos.MergeSort;

// Merge sorting without creating an extra array, making change in the object itself

import java.util.Arrays;

public class MergeSortInPlaceRecursion {
    public static void main(String[] args) {
        int a[] = {4,5,8,1,2,3};
        mergeSortInplace(a,0,a.length);
        System.out.println(Arrays.toString(a));

    }

    static void mergeSortInplace(int arr[],int s, int e){

        if(e-s == 1){
            return;
        }

        int mid = (s+e)/2;

        mergeSortInplace(arr,s,mid);
        mergeSortInplace(arr,mid,e);

        mergeInplace(arr,s,mid,e);

    }

    static void mergeInplace(int arr[], int s, int m, int e) {
        int mix[] = new int[e-s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        //If one array in not completely added

        while (i < m){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e){
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }

    }


}
