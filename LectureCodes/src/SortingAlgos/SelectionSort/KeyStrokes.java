package SortingAlgos.SelectionSort;

import java.util.Scanner;

//https://www.hackerearth.com/practice/algorithms/sorting/selection-sort/practice-problems/algorithm/old-keypad-in-a-foreign-land-24/
public class KeyStrokes {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int factor =0;
        int maxKeys = 0;
        int N = sc.nextInt();
        int frq[] = new int[N];
        for (int i = 0; i < N; i++) {
            frq[i] = sc.nextInt();
        }

        int K =sc.nextInt();
        int keySize[] = new int[K];
        for (int i = 0; i < K; i++) {
            keySize[i] = sc.nextInt();
            maxKeys += keySize[i];

        }

        selSort(frq);


//        System.out.println(Arrays.toString(frq));

        if(maxKeys < N){
            System.out.println("-1");
        }
        else {
            for (int i = N-1; i >= 0;) {
                factor++; // factor is time button pressed to print tht element
                int temp=0;
                for (int j = 0; j < K; j++) { // this loop runs for the button - 1st buton, 2nd
                    if(keySize[j]>=factor){
                        temp += frq[i];
                        i--;
                    }
                    if(i<0)
                        break;
                }

                sum += factor*temp;
            }

            System.out.println(sum);
        }




    }

    static void selSort(int[] a){
        for (int i = 0; i < a.length; i++) {
            int last = a.length - 1 - i;
            int max = 0;
            for (int j = 0; j <= last; j++) {
                if(a[j]>a[max]){
                    max  = j;
                }
            }
            int temp = a[last];
            a[last] = a[max];
            a[max] = temp;

        }
    }


}

//Online Solution
//class KeyStroke {
//    public static void main(String args[] ) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        int sum =0;
//        int factor =0;
//        int temp;
//        int f = sc.nextInt();
//        int[] freq = new int[f];
//        for(int i =0;i<f;i++)
//            freq[i] = sc.nextInt();
//        int n = sc.nextInt();
//        long maxKeys = 0;
//        int[] keys = new int[n];
//        for(int i=0;i<n;i++){
//            keys[i] = sc.nextInt();
//            maxKeys+=keys[i];
//        }
//        Arrays.sort(freq);
//        if(maxKeys < f)
//            System.out.println(-1);
//        else{
//            for(int i =f-1;i>=0;){
//                factor++;
//                temp=0;
//                for(int j=0;j<n;j++){
//                    if(keys[j]>=factor){
//                        temp+=freq[i];
//                        i--;
//                    }
//                    if(i<0)
//                        break;
//                }
//                sum+=factor*temp;
//            }
//            System.out.print(sum);
//        }
//    }
//}