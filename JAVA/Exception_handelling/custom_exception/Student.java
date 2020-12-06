package JAVA.Exception_handelling.custom_exception;

import p1.exp.InvalidMarksException;

public class Student {
    int rollno, marks;

    public Student(int rollno) {
        this.rollno = rollno;
    }

    public void exam(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException();
        }
        this.marks = marks;
    }

    public void report() {
        System.out.println("roll no:  " + rollno);
        System.out.println("marks:  " + marks);
    }
}