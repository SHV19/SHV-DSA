package RecursionQuestions.PatternsBubbbleSelectionSort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {98,44,6,1647,64,694,58};

        sortOptimized(a, a.length, 0,0);

        System.out.println(Arrays.toString(a));
    }


    //My Solution
    static void sort(int a[],int r,int c,int maxIndex){

        if(r>0){
            if(c<r){
                if(a[maxIndex]<a[c]){
                    maxIndex = c;
                }

                sort(a,r,c+1,maxIndex);
            }

            //When you reach this part, it means you have traversed the array entirely and found max element index
            else{
                int temp = a[r-1];
                a[r-1] = a[maxIndex];
                a[maxIndex] = temp;
                sort(a,r-1,0,0);
            }
        }



    }


    //Optmized Solution
    static void sortOptimized(int a[],int r,int c,int maxIndex){

        if(r == 0){
            return;
        }
            if(c<r){
                if(a[maxIndex]<a[c]){
                    sort(a,r,c+1,c);
                }
                else{
                    sort(a,r,c+1,maxIndex);

                }

            }
            else{
                int temp = a[r-1];
                a[r-1] = a[maxIndex];
                a[maxIndex] = temp;
                sort(a,r-1,0,0);
            }




    }


}
