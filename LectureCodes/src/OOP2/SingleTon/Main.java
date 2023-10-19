package OOP2.SingleTon;

public class Main {
    public static void main(String[] args) {
        SingleTon a  = SingleTon.getInstance();
        SingleTon b  = SingleTon.getInstance();
        SingleTon c  = SingleTon.getInstance();

        //all 3 referencing variables are pointing to same object.(@7b23ec81)

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
