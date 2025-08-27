package d250821;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileTest5 {
    /*
    파일명 입력받기
    파일명으로 File 객체 생성
    이미 사용중인 이름인지 확인
    있으면 덮어쓸지 여부 확인
    N 입력하면 새로 파일명 입력받기

    입력받은 이름으로 파일 생성 (= 스트림 객체 생성)
    반복적으로 내용 입력받아 파일에 저장
    새로운 행에서 엔터 치면 종료

    스트림 닫기
    */
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        BufferedWriter bw = null;
        String filePath, content;

        while (true) {
            String c = "y";
            System.out.print("생성할 파일의 이름: ");
            filePath = s.nextLine();
            File f = new File(filePath + ".txt");

            if (f.exists()) {
                System.out.println("파일이 이미 존재합니다. 새로 생성하시겠습니까? (Y/N): ");
                c = s.nextLine();
            }
            if (c.equalsIgnoreCase("y")) break;
        }

        FileWriter fw = new FileWriter(filePath + ".txt");
        bw = new BufferedWriter(fw);    // 다른 스트림에 붙여서 사용
        System.out.println("파일이 생성되었습니다.\n-------------------------------------");
        while (true) {
            content = s.nextLine();
            if (content.isEmpty()) break;
            bw.append(content).append("\n");
            bw.flush();
            fw.flush();
        }

        bw.close();
        fw.close();
        s.close();
    }
}
