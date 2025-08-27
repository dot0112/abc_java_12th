package d250820;

import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
    /*
    byte:
    - 입력: inputStream
        + FileInputStream
        + BufferedInputStream
    - 출력: OutputStream
        + FileOutputStream
        + BufferedOutputStream

    문자: -- 자동으로 문자 인코딩도 진행
    - 입력: Reader
        + FileReader
        + BufferedReader
    - 출력: Writer
        + FileWriter
        + BufferedWriter
    */

    public static void main(String[] args) {
        try {
            FileWriter out = new FileWriter("./fileTest/test.txt");
            out.append('a');
            out.append('\n');
            out.append('가');
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
