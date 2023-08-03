package RecursionSubsetSubsequenceStringQuestions;

/*
Time Complexity

O(N * 2^N)

Space Complexity


O (2^N * N)
2^N - Number of subsets
N - Each subset space
*/


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSeqIterative {

    public static void main(String[] args) {
        int arr[] = {2,1,2};
        List<List<Integer>> ans = subSetDuplicate(arr);
        for (List<Integer> list: ans) {
            System.out.println(list);
        }
    }

    static List<List<Integer>> subSet(int arr[]){

        //Creating a List of List as outer list
        List<List<Integer>> outer = new ArrayList<>();

        //We add a empty list insdie the above created outer list
        outer.add(new ArrayList<>());

        //We run a for each loop for the input array, in this case its {1,2,3}
        for (int num: arr ) {

            //We intialize n with size of the outer loop
            int n = outer.size();

            //This loop run for the current size of the outer loop
            //Coz we will adding new lists same size of the outer loop
            // if 2 in outer means 2 new list, 3 means 3 new so on..
            for (int i = 0; i < n; i++) {

                // New internal list is created with the copy of outer existing lists
                List<Integer> internal = new ArrayList<>(outer.get(i));

                //Current number is added to the copy that of outer existing lists
                internal.add(num);

                //Now the list which was created and added with the number is added to the main list
                outer.add(internal);
            }
        }

        return outer;



    }

    //For arrays containing duplicate elements
    static List<List<Integer>> subSetDuplicate(int arr[]){
        Arrays.sort(arr);

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start =0;
        int end = 0;
        for (int j= 0; j < arr.length;j++) {
            start = 0;


            if(j>0 && arr[j] == arr[j-1]){
                start = end+1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for (int i = start; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(arr[j]);
                outer.add(internal);
            }
        }

        return outer;
    }
}



