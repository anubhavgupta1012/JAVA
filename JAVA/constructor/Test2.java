package JAVA.constructor;

public class Test2 {
    int x;

    Test2() {
        System.out.println("obj.is created");
        x = 10;
    }

    void show() {
        System.out.println(+x);
    }
}