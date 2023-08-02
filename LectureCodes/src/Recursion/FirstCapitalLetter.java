package Recursion;

public class FirstCapitalLetter {

    public static void main(String[] args) {
        String name = "haRi";
        char res = fc(name,0);
        System.out.println(res);
    }

    static char fc(String name, int n) {

        //Base Condition
        if(n > name.length()-1){
            return '0';
        }

        if(Character.isUpperCase(name.charAt(n))){
            return name.charAt(n);
        }
        return fc(name,n+1);
    }

}
