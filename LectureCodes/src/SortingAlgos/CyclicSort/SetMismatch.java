package SortingAlgos.CyclicSort;

public class SetMismatch {

        public static void main(String[] args) {
            int a[] = {2,1,4,2,6,5};
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
                    System.out.print(a[j]+" ");
                    System.out.print(j+1);
                }
            }

        }



        static void swap (int a[], int first, int second){
            int temp = a[first];
            a[first] = a[second];
            a[second] = temp;
        }


}
