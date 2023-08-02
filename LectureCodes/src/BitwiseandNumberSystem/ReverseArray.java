package BitwiseandNumberSystem;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        char a[] = {'a','b','c','d','e'};

        int last = a.length-1;

        System.out.println(Arrays.toString(a) + " Pre");


        for (int i = 0; i < (a.length+1)/2; i++) {


            char temp = a[i];
            a[i] = a[last];
            a[last] = temp;

            last--;
        }

        System.out.println(Arrays.toString(a) + " Post");

    }


}
