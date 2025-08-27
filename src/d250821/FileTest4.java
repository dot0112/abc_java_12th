package d250821;

import java.io.File;
import java.io.IOException;

public class FileTest4 {
    public static void main(String[] args) throws IOException {
        String parent = "c:\\java-busan-12th\\java-basic\\";
        File a = new File(parent, "a.txt");
        File b = new File(parent);
        File c = new File(".");
        File d = new File(parent, ".\\a");
        File e = new File(parent, ".\\fileTest\\test.txt");

        System.out.println(a.exists());
        System.out.println(a.isFile());
        System.out.println(a.isDirectory());
        System.out.println(c.getAbsolutePath());
        System.out.println(c.getCanonicalPath());
        System.out.println(e.getName());
        System.out.println(e.length());
        System.out.println(d.isDirectory());

        if (!d.isDirectory()) {
            d.mkdir();
        }

        System.out.println(d.isDirectory());
    }
}
