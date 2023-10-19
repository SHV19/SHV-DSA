package OOP2.staticExample;

public class StaticBlock {

    static int a = 5;
    static int b;

    static {
        System.out.println(a);
        b = a * 5;
        System.out.println(b);
    }


    public static void main(String[] args) {
        //StaticBlock obj = new StaticBlock();
        System.out.println(b);

    }
}
