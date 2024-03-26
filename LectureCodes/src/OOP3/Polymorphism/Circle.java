package OOP3.Polymorphism;

public class Circle extends Shapes{
    double b = 2.5 ;

    void area(){
        System.out.println("I'm Circle area");

    }

//    @Override
//    static void greetings(){
//        System.out.println("Greetings from circle");
//    }

    @Override
    void fancy(){
        System.out.println("i'm circle fancy");
    }
}
