package d250825;

import d250819.Student;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class FileTest7 {
    public static void main(String[] args) throws Exception {
        // Serializable 한 객체만 저장 가능
        ObjectOutputStream oo = new ObjectOutputStream(new FileOutputStream("test.dat"));

        oo.writeObject(new Student("aaa", new int[]{1, 1, 1}));
        oo.writeObject(new Student("bbb", new int[]{2, 2, 2}));
        oo.writeObject(new Student("ccc", new int[]{3, 3, 3}));
        oo.close();
    }
}
