package SortingAlgos.CyclicSort;

public class MissingNumber {

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        int a[] = {4,0,1,2};
        missing(a);
        System.out.println(missing(a));


     }

    static int missing(int a[]){ //{4,0,1,2}
        int i = 0;
        while(i < a.length){
            int correctIndex = a[i];
            if(a[i] < a.length && a[i] != a[correctIndex]){
                swap(a, i, correctIndex);
            }
            else{
                i++;
            }
        }

        for (int j = 0; j < a.length; j++) {
            if(a[j] != j){
                return j; //In this we are returning index coz index = value -> [0,N] case
            }
        }

        return a.length; //In this we are returning index coz index = value -> [0,N] case

    }

    static void swap(int a[], int first, int second){
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
}
