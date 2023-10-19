package OOP2.staticExample;

// Static Class/ Non Static Class and Static Method / Non Static Method are diiferen
public class InnerClass {
    static class Test {
        static String name;
        public Test(String name) {
            Test.name = name;
        }

        @Override
        public String toString() {
            return "I'm overrided";
        }
    }
    public static void main(String[] args) {

        Test a = new Test("sai");
        Test b = new Test("bai");
        System.out.println(a.name);
        System.out.println(b.name);

    }

}



