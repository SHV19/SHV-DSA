package RecursionSubsetSubsequenceStringQuestions;

public class SkipString {
    public static void main(String[] args) {

        System.out.println(skipAppNotApple("basappeket"));

    }



    static String skipApple(String up){

        if (up.isEmpty()){
            return up;
        }



        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }
        else{

            return  up.charAt(0) + skipApple(up.substring(1));
        }

    }

    static String skipAppNotApple(String up){

        if (up.isEmpty()){
            return up;
        }



        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }
        else{

            return  up.charAt(0) + skipAppNotApple(up.substring(1));
        }

    }
}
