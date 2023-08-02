package BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int T = sc.nextInt();

        for (int x = 0; x < T; x++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int a[] = new int[N];

            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();
            }

            // System.out.println(Arrays.toString(a));
            opFunc(a,N,M);
        }
    }

    static void bubble(int a[]){
        //outro Loop is just like a counter
        Boolean swapped;
        for (int i = 0; i <a.length ; i++) {
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

    static void opFunc(int[] a,int N, int M){
        int NM = N-M;
        int maxSum = 0;
        int minSum = 0;
        int count = 0;
        bubble(a);

        for (int i = a.length-1; i >= a.length-NM; i--) {

                maxSum += a[i];


        }
        for (int i = 0; i < NM; i++) {
            minSum += a[i];
        }
        System.out.println(maxSum-minSum);

    }
}
