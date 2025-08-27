package d250820;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
현재 폴더
java.lang (기본 import)
import 한 패키지

import 방식
import ~.*
import ~.클래스

명시한 클래스가 *로 가져온 클래스들 보다 우선을 가짐

*/

public class FileTest3 {
    /*
    [실행 1]
    파일명 입력: c:\java-busan-12th\java-basic\src\d250820\FileTest3.java

    package d250820;

    import java.io.FileNotFoundException;
    ......

    ------------
    [실행 2]
    파일명 입력: c:\aaa\bbb
    파일이 없습니다.
    */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String filePath;

        System.out.print("파일명 입력: ");
        filePath = s.nextLine();

        try {
            FileReader in = new FileReader(filePath);

            while (in.ready()) {
                System.out.print((char) in.read());
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일이 없습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        s.close();
    }
}
