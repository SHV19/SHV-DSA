package OOP3.Polymorphism;

public class Numbers {

    int num;

    public Numbers(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {

        Numbers obj = new Numbers(25);
        System.out.println(obj);
    }
}

