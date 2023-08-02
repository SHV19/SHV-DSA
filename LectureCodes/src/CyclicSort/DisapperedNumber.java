package CyclicSort;

public class DisapperedNumber {
    public static void main(String[] args) {
        int a[] = {4,3,2,7,8,2,3,1};
        cSort(a);
    }

    static void cSort(int a[]){
        int temp[];
        int i = 0;
        while(i < a.length){
            int correctIndex = a[i] - 1;
            if(a[i] != a[correctIndex]){
                swap(a, i, correctIndex);
            }
            else{
                i++;
            }
        }


        for (int j = 0; j < a.length; j++) {
            if(a[j] != j+1){
                System.out.println(j+1); // j+1 because we are priting the missing element not the index
            }
        }


    }

    static void swap(int a[], int first, int second){
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}
