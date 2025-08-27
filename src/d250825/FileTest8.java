package d250825;

import d250819.Student;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class FileTest8 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream oi = new ObjectInputStream(new FileInputStream("test.dat"));
        while (true) {
            Student s;
            try {
                s = (Student) oi.readObject();
            } catch (EOFException e) {
                break;
            }
            System.out.println(s);
        }
    }
}
