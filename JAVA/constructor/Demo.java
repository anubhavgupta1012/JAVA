public class Test {
    int x, y;

    Test(int val) {
        System.out.println("obj created");
        x = val;
    }

    void show() {
        System.out.println("x is =" + x);
    }
}

public class Demo {
    public static void main(String[] s) {
        Test t1 = new Test(5);
        Test t2 = new Test(6);
        t1.show();
        t2.show();
    }
}