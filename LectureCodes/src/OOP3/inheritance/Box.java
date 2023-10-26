package OOP3.inheritance;

public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.l = -25;
        this.h = -1;
        this.w = -1;
    }

    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
        System.out.println("caught you");
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
        System.out.println("I'm here");

    }

    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
        System.out.println("Nope i'm here");
    }
}
