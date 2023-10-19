package OOP2.SingleTon;

public class SingleTon {
    //by private keyword we are making not allowing to call constructor

    private SingleTon(){

    }

    //instead we create a object mannually inside this call and returning it.
    private static SingleTon instance;

   public static SingleTon getInstance(){
        if(instance == null){
           instance = new SingleTon();
        }
        return instance;
    }
}
