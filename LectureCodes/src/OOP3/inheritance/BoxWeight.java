package OOP3.inheritance;

public class BoxWeight extends Box {
    double weight;

    BoxWeight(){

        this.weight = 34;


    }
    BoxWeight(BoxWeight ans){
        super(ans);
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }
}
