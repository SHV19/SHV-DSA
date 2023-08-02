package RecursionQuestions.PatternsBubbbleSelectionSort;

/*

****
***
**
*

*/
public class Pattern1 {

    public static void main(String[] args) {
        // System.out.println(p1(4,0));

        easyp1(4, 0);
    }

    static void p1(int r, int c) {

        if(c>r){
            System.out.println();

            if(r>0){
                p1(r-1,0);
            }
            return;
        }

        System.out.print("*");
        p1(r,c+1);

    }

    static void easyp1(int r,int c){
        if(r == 0){
            return;
        }

        if(c<r){
            System.out.print("*");
            easyp1(r,c+1);
        }
        else{
            System.out.println();
            easyp1(r-1,0);
        }
    }
}

/*
        if(r>0){
          return;
            }

            p1(r-1,0);

        System.out.print("*");
        p1(r,c+1);

This an example of how stack calls works

f1 is called
    - it will exe
    - next it will call f2

f2
    - it will exe
    - next it will call f3

f3
    - it will exe
    - and return

Now f3 will be out of stack

    f2
    - At line 45 f3 was called and it has returned
    - but post f3 return there are few lines to executed in f2
    - Line 47 & 48
    - After executing it will return to f1

Now f2 will be out of stack

    f1
    - At line 45 f2 was called and it has returned
    - but post f2 return there are few lines to executed in f1
    - Line 47 & 48
    - After executing it will return to where it was called first

This explaination show how post return remaining line is executed.

*/