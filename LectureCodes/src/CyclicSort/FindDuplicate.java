package CyclicSort;

public class FindDuplicate {
    public static void main(String[] args) {
        int a[] = {1,3,2,5,3};
        cSort(a);
    }

    static void cSort(int a[]){
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
            if(a[j] != j + 1){
                System.out.println(a[j]);
            }
        }
    }



    static void swap(int a[], int first, int second){
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}
