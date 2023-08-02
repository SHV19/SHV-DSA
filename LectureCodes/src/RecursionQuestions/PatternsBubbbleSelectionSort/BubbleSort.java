package RecursionQuestions.PatternsBubbbleSelectionSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a[] = {4,3,2,1};

        sort(a, a.length-1, 0);

        System.out.println(Arrays.toString(a));
    }

    static void sort(int a[], int r, int c){

        if(r < 0){
            return;
        }

        if(c < r){

            if(a[c+1] < a[c]){
                int temp = a[c+1];
                a[c+1] = a[c];
                a[c] = temp;
            }

            sort(a,r,c+1);
        }
        else {
            sort(a,r-1,0);
        }

    }
}
