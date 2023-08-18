package SortingAlgos.SelectionSort;

import java.util.Arrays;

public class SelectionSortWithoutFunc {
    public static void main(String[] args) {
        int a[] = {5,4,3,2,1};
        System.out.println("before Swap"+ Arrays.toString(a));

        for (int i = 0; i < a.length ; i++) {
            int last = a.length - i - 1;
            int max=0;
            for (int j = 0; j <= last; j++) {

                if(a[max]<a[j]){
                    max = j;
                }

            }
            int temp = a[last];
            a[last] = a[max];
            a[max] = temp;
        }

        System.out.println("After Swap"+Arrays.toString(a));

    }
}
