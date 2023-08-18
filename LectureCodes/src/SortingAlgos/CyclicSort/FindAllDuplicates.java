package SortingAlgos.CyclicSort;

public class FindAllDuplicates {
    public static void main(String[] args) {
        int a[] = {4,6,5,7,8,5,6,1};
        //System.out.println(findDuplicate(a));
        findAllDuplicate(a);
    }
    public static void findAllDuplicate(int[] a) {

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

        /*for (int j = a.length - 1; j >= 0; j--) {
            if(a[j] != j + 1){
                System.out.println(a[j]);
            }
        }*/

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
