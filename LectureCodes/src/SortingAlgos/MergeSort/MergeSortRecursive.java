package SortingAlgos.MergeSort;

import java.util.Arrays;

public class MergeSortRecursive {

    public static void main(String[] args) {
        int a[] = {4,5,8,1,2,3};
        int ans[] = mergeSort(a);
        System.out.println(Arrays.toString(ans));

    }

    static int[] mergeSort(int arr[]){

        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int left[] =  mergeSort(Arrays.copyOfRange(arr,0,mid));
        int right[] = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);

    }

    static int[] merge(int[] first, int[] second) {
        int mix[] = new int[first.length+second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        //If one array in not completely added

        while (i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;

    }

}

