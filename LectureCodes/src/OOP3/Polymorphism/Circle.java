package OOP3.Polymorphism;

public class Circle extends Shapes{
    double b = 2.5 ;
    @Override
    void area(){
        System.out.println("I'm Circle area");

    }

    @Override
    void fancy(){
        System.out.println("i'm circle fancy");
    }
}
