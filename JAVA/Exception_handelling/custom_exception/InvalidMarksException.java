// invalidMarksException.java;
package JAVA.Exception_handelling.custom_exception;

public class InvalidMarksException extends Exception {
    String msg;

    public void InvalidMarksException() {
        msg = "";
    }

    public void InvalidmarksException(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return ("InvalidmarksException" + msg);
    }
}