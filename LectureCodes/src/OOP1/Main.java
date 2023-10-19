package OOP1;

import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

       Student[] students = new Student[5];

       // Constructor runs automatically once object is created
       //  If you want to pass value in argument you have modify the constructor
       Student shv = new Student(1,"shv",12.4f);
       Student vik = new Student(2,"vik",25.6f);
       Student lol = new Student();

       shv.changeName("Karthik");
       shv.greetings();



//        System.out.println(Arrays.toString(students));
//        System.out.println(shv.rno);
//        System.out.println(shv.name);
//        System.out.println(shv.marks);


    }



}

class Student {

    int rno;
    String name;
    float marks;

    void greetings(){
        System.out.println("Hello i'm: " + this.name);
    }

    void changeName(String newName){
        name = newName;
    }
    // Modified Constructor
    Student(){
        this.rno = 123;
        this.name = "yea";
        this.marks = 63.4f;
    }

    // Modified Constructor
    //Student gg = new Student(12,"gg",53.6f);
    //here, "this" will be replace with gg
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

}
