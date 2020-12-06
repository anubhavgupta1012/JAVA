package JAVA.Exception_handelling.custom_exception;

public class School {
    static Student st;

    public static void main(String s[]) {
        prepare();
        invoker();
    }

    static void prepare() {
        st = new Student(101);
    }

    static void invoker() {
        try {
            st.exam(120);
            st.report();
        } catch (InvalidMarksException e) {
            e.printStackTrace();
        }
    }
}