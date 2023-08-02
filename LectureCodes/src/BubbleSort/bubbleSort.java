package BubbleSort;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {
        int arr[] = {1,2,3,5,4}; //3,1,5,4,2
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void bubble(int a[]){

        Boolean swapped;
        for (int i = 0; i <a.length ; i++) {//outro Loop is just like a counter
            swapped = false;
            //inner Loop
            for (int j = 1; j <a.length-i ; j++) {

                if(a[j]<a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;

                    swapped = true;
                }

            }

            if(swapped == false){
                break;
            }

        }

    }
}
