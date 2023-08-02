package BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class SavePatient {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int strengthOfVaccine[] = new int[N];
        int midichloriansCount[] = new int[N];

        for (int i = 0; i < N; i++) {
            strengthOfVaccine[i] = sc.nextInt();
        }

        for (int i = 0; i < N; i++) {
            midichloriansCount[i] = sc.nextInt();
        }

        bsort(strengthOfVaccine);
        bsort(midichloriansCount);

        compare(strengthOfVaccine, midichloriansCount,N);



    }

    static void bsort(int[] a){

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length-i; j++) {
                if(a[j]<a[j-1]){
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
            }
        }

    }

    static void compare(int[] sov, int[] mc, int n){
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(sov[i]>mc[i]){
                count++;
            }
        }

        if(count == n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
