package OOP1;

public class checkingFinalKW {

    public static void main(String[] args) {

       final a obj = new a();
        //when a non primitive is final, you cannot reassign it.
        ///obj = new a();


    }
}

class a{
    //final variable: always initilize while declaring
    final int VALUE = 10;


}
