package BubbleSort;

public class TestReveseArrayTraverse {

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int X = 3;

        for (int i = 0; i < X; i++) {
            System.out.println(a[i]);
        }

        System.out.println("___________");

        for (int i = a.length-1; i >= a.length-X; i--) {
            System.out.println(a[i]);
        }

    }
}
