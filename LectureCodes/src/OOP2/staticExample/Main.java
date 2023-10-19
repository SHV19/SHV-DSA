package OOP2.staticExample;

public class Main {
    public static void main(String[] args) {

        Human sai = new Human("sai",22,10000);
        Human hari = new Human("hari",23,25000);
        Human vik = new Human("vik",23,25000);



        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

        Main obj = new Main();
        obj.fun();



    }

    static void greetings(){
//        Main obj = new Main();
//        obj.fun();
    }

    void fun() {

    }


    void fun2() {

        fun();
    }
}
