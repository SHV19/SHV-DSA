package OOP6.ExceptionHandling;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hey There!");

        int a =5;
        int b = 0;
        try {
//            int c = a / b;

//            divide(a,b);
            throw new Exception("Lol man!");
        } catch(ArithmeticException e) {

            System.out.println("math error");

        }
        catch(Exception e) {

            System.out.println("normal exception");

        }

    }

    static int divide (int a, int b) throws ArithmeticException {
        if(b == 0){
           throw new ArithmeticException("Not null boy");
        }
        return a / b;
    }
}

/*
throw - used to throw an exception.

throws - used to declare exception (it may throw exception).
* */
