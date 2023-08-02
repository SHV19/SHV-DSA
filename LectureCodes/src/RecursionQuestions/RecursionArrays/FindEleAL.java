package RecursionQuestions.RecursionArrays;

import java.util.ArrayList;

public class FindEleAL {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,3};
        System.out.println(findAllELe(a,3,0));
    }

    static ArrayList<Integer> findAllELe(int a[], int t, int i){
        ArrayList<Integer> list = new ArrayList<>();
        if(i == a.length){
            return list;
        }

        if(a[i]==t){
            list.add(i);
        }

        ArrayList<Integer> ansFromBelowCalls =  findAllELe(a,t,i+1);

       list.addAll(ansFromBelowCalls);
       return list;



    }
}
