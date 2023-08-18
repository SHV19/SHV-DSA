package SortingAlgos.BubbleSort;

import java.util.Scanner;

public class FanMeet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, T;
        int FQ[] = new int[1000];
        String name[] = new String[1000];
       // System.out.println("Enter Number of Fans: ");
        N = sc.nextInt();
        //System.out.println("Enter How Many Fans You Can Meet: ");
        T = sc.nextInt();
        //System.out.println("Enter FQ & Name");
        for (int i = 0; i < N; i++) {
            name[i] = sc.next();
            FQ[i] = sc.nextInt();
        }
        bubbleSort(N,T,FQ,name);
    }

    static void bubbleSort(int N,int T,int FQ[], String name[]){
            for (int i = 0; i < N; i++) {
                for (int j = 1; j < N - i; j++) {
                    if(FQ[j]>FQ[j-1]){
                        int temp = FQ[j];
                        FQ[j]=FQ[j-1];
                        FQ[j-1] = temp;

                        String stemp = name[j];
                        name[j] = name[j-1];
                        name[j-1] = stemp;
                    }
                }
            }
        for(int i = 0; i < N-1;++i) {
            for (int j = i + 1; j < N; ++j) {
                if (name[i].compareTo(name[j]) > 0) {
                    String temp = name[i];
                    name[i] = name[j];
                    name[j] = temp;
                }
            }


        }
        //System.out.println(Arrays.toString(name));
            for (int i = 0; i < T; i++) {
                System.out.println(name[i]);
            }
    }
}
