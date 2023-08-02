package InsertionSort;
//https://www.hackerearth.com/practice/algorithms/sorting/insertion-sort/practice-problems/algorithm/monk-and-nice-strings-3/
import java.util.Scanner;

public class MonkStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String a[] = new String[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.next();
        }

        monkFunc(a,n);
    }

    static void monkFunc(String a[], int n){
        int c[] = new int[n];

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i-1; j > -1; j--) {
                if(a[i].compareTo(a[j])>0){
                    count++;
                }

            }
            c[i] = count;
        }

        for (int cc: c) {
            System.out.println(cc);
        }
    }

//    public static void main(String[] args) {
//
//        String a[] = {"a","c","d","b"};
//
//        monkFunc(a);
//    }
//
//    static void monkFunc(String a[]){
//        int c[] = new int[a.length];
//
//        for (int i = 0; i < a.length; i++) {
//            int count = 0;
//            for (int j = i-1; j > -1; j--) {
//                if(a[i].compareTo(a[j])>0){
//                    count++;
//                }
//
//            }
//            c[i] = count;
//        }
//
//        for (int cc: c) {
//            System.out.println(cc);
//        }
//    }
}
