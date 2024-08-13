package OOP6.ExceptionHandling.Cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human hari = new Human(22, "SHV");
//        Human twin = new Human(hari);


        Human twin = (Human)hari.clone();
        System.out.println(twin.age + " " + twin.name);
    }
}
