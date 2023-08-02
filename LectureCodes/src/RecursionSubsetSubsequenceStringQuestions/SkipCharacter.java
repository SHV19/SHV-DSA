package RecursionSubsetSubsequenceStringQuestions;

public class SkipCharacter {

    public static void main(String[] args) {
        String txt = "baccad";
        //System.out.println(remove(txt,"",'a',0));
        System.out.println(ansW("baccah"));


    }

    //using substrings without returning

    static void ans(String p, String up){

        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            ans(p,up.substring(1));
        }
        else{

            ans(p+ch,up.substring(1));
        }

    }


    //using substrings with returning

    static String ansW(String up){

        if (up.isEmpty()){
            return up;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return ansW(up.substring(1));
        }
        else{

           return  ch+ansW(up.substring(1));
        }

    }




    //Using the string index
   /* static String remove(String txt,String ans, char r, int i){

        if(i == txt.length()){
            return ans;
        }

        if(txt.charAt(i) == r){

            return remove(txt,ans,r,++i);
        }

        ans = ans + txt.charAt(i);
        return remove(txt,ans,r,++i);


    }*/
}
