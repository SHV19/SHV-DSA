// Selection Sort in ascending order

// Find the max ele in array swap it with the respective position

package SortingAlgos.SelectionSort;
import java.util.Arrays;

public class SelectionSorting {

    public static void main(String[] args) {
        int arr[] = {125,0,-69,-96,38};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int a[]){

        for (int i = 0; i < a.length ; i++) {
            int last = a.length - i - 1;
            int maxIndex = getMaxIndex(a, 0, last);
            swap(a,last, maxIndex);
        }

    }

    static void swap(int a[], int last, int maxIndex){

        int temp = a[last];
        a[last] = a[maxIndex];
        a[maxIndex] = temp;

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
