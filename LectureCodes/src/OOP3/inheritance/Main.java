package OOP3.inheritance;

public class Main {

    public static void main(String[] args) {
        Box box1 = new Box();
        //Box box2 = new Box(box1);
//        BoxWeight bw1 = new BoxWeight();
//
//        System.out.println(bw1.l + " " + bw1.h + " " + bw1.w + " " +bw1.weight);
//        System.out.println(box1.l + " " + box1.h + " " + box1.w);

        //Reference type is Box(Parent) but object created is BoxWeight(Child)
        //On call child constructor it will obviously extend parent class

        //Type of the reference variable determines what members can be accessed
        //Not the type of object
//        Box bm = new BoxWeight(8,8,2,9);
//        System.out.println(bm.l + " " + bm.h + " " + bm.w);

        //Reference type is BoxWeight(Child) but object created is Box(Parent)
        //On call parent does not extend the child class
//        BoxWeight bm1 = new Box();
//        System.out.println(bm1.weight);
        BoxPrice bp = new BoxPrice();
        System.out.println(bp.l);
        BoxPrice bp2 = new BoxPrice(bp);
        System.out.println(bp2.l);



    }



}
