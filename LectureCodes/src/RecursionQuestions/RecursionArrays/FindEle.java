package RecursionQuestions.RecursionArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class FindEle {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,3};

//        System.out.println(find(a,9,0));
//        System.out.println(findIndex(a,9,0));

        ArrayList<Integer> list = findAL(a,3,0,new ArrayList<>());
        System.out.println(list);
        //System.out.println(findAL(a,3,0,new ArrayList<>()));

    }

    static boolean find(int a[],int t, int i){

        if(i > a.length-1){ // or if(i == a.length)
            return false;
        }

        return a[i] == t || find(a,t,i+1);

    }

    static int findIndex(int a[],int t, int i){

        if(i > a.length-1){ // or if(i == a.length)
            return -1;
        }

        if (a[i] == t){
            return i;
        }
        else {
            return findIndex(a,t,i+1);
        }
    }

    //Using ArrayList
    static ArrayList findAL(int a[], int t, int i, ArrayList list){

        if(i > a.length-1){ // or if(i == a.length)
            return list;
        }

        if (a[i] == t){
            list.add(i);
        }

        return findAL(a,t,i+1,list);

    }
}
