package RecursionQuestions.PatternsBubbbleSelectionSort;

/*
*
**
***
****

*/
public class Pattern2 {
    public static void main(String[] args) {
        p2(4,0);
    }

    static void p2(int r,int c){
        if(r == 0){
            return;
        }

        if(c<r){
            p2(r,c+1);
            System.out.print("*");

        }
        else{
            p2(r-1,0);
            System.out.println();
        }
    }
}
