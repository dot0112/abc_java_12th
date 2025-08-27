package d250813;

import java.io.IOException;

public class IOTest1 {
    public static void main(String[] args) {
        try {
            int i = System.in.read();
            System.out.println((char) i);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
