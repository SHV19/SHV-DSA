package SortingAlgos.CyclicSort;

public class FirstMissingPositive {

    public static void main(String[] args) {
        int a[] = {-2,-1,2,3};
        System.out.println(missing(a));

    }

    static int missing(int a[]){ //{4,0,1,2}
        int i = 0;
        while(i < a.length){
            int correctIndex = a[i]-1;
            if(a[i] > 0 && a[i] < a.length && a[i] != a[correctIndex]){
                swap(a, i, correctIndex);
            }
            else{
                i++;
            }
        }

        for (int j = 0; j < a.length; j++) {
            if(a[j] -1 != j){
                return j+1;
            }
        }

        return a.length+1;

    }

    static void swap(int a[], int first, int second){
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }

}
