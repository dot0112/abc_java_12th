package d250820;

import java.io.FileReader;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) {
        try {
            FileReader in = new FileReader("./fileTest/test.txt");

            /*
            while ((ch = in.read()) != -1) {
                System.out.print((char) ch);
            }
            */

            while (in.ready()) {
                System.out.print((char) in.read());
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
