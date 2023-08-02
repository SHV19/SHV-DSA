package CyclicSort;

public class FindDuplicate2 {

    public static void main(String[] args) {
        int a[] = {1,4,2,4,3};
        System.out.println(findDuplicate(a));
    }
    public static int findDuplicate(int[] a) {

        int i = 0;
        while(i < a.length){

            if(a[i] != i+1){
                int correctIndex = a[i] - 1;
                if(a[i] != a[correctIndex]){
                    swap(a, i, correctIndex);
                }
                else{
                    return a[i];
                }
            }
            else{
                i++;
            }

        }

//        for (int j = 0; j < a.length; j++) {
//            if(a[j] != j + 1){
//                return a[j];
//            }
//        }
       return -1;
  }



    static void swap(int a[], int first, int second){
        int temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }

}

