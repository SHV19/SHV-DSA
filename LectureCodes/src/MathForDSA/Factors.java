package MathForDSA;

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
        int n = 20;
        ArrayList<Integer> list = new ArrayList<>();

       /* for (int i = 1; i <= Math.sqrt(n); i++) {

            if(n%i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + " " + n/i + " ");
                }

            }
        }*/



        for (int i = 1; i <= Math.sqrt(n); i++) {

            if(n%i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + " ");
                    list.add(n/i);

                }



            }
        }
        for (int j = list.size()-1; j >= 0 ; j--) {
            System.out.print(list.get(j) + " ");
        }

    }
}
