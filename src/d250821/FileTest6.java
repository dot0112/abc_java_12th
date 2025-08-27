package d250821;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileTest6 {
    /*
    1. String 이어 붙이고 한번에 저장
    2. StringBuffer를 이용
    3. ArrayList를 이용
    4. 임시 파일 만들고 저장
    */

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            while (true) {
                System.out.print("\n===================\n 1: String\n 2: StringBuilder\n 3: ArrayList\n 4: Tmp File\n: ");
                int c = s.nextInt();
                s.nextLine();
                switch (c) {
                    case 1 -> writeNo1();
                    case 2 -> writeNo2();
                    case 3 -> writeNo3();
                    case 4 -> writeNo4();
                    default -> {
                        return;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void writeNo1() throws IOException {
        BufferedWriter bw = null;
        String filePath;
        String content = "";

        System.out.println("\n-------------------------------------");
        while (true) {
            String tmp = s.nextLine();
            if (tmp.isEmpty()) break;
            content += tmp + "\n";
        }

        filePath = getFilePath();

        FileWriter fw = new FileWriter(filePath);
        bw = new BufferedWriter(fw);    // 다른 스트림에 붙여서 사용
        bw.append(content);
        System.out.println("파일이 생성되었습니다.");

        bw.close();
        fw.close();
    }

    static void writeNo2() throws IOException {
        BufferedWriter bw = null;
        String filePath;
        StringBuilder content = new StringBuilder();

        System.out.println("\n-------------------------------------");
        while (true) {
            String tmp = s.nextLine();
            if (tmp.isEmpty()) break;
            content.append(tmp).append("\n");
        }

        filePath = getFilePath();

        FileWriter fw = new FileWriter(filePath);
        bw = new BufferedWriter(fw);    // 다른 스트림에 붙여서 사용
        bw.append(content.toString());
        System.out.println("파일이 생성되었습니다.");

        bw.close();
        fw.close();
    }

    static void writeNo3() throws IOException {
        BufferedWriter bw = null;
        String filePath;
        ArrayList<String> content = new ArrayList<>();

        System.out.println("\n-------------------------------------");
        while (true) {
            String tmp = s.nextLine();
            if (tmp.isEmpty()) break;
            content.add(tmp);
        }

        filePath = getFilePath();

        FileWriter fw = new FileWriter(filePath);
        bw = new BufferedWriter(fw);    // 다른 스트림에 붙여서 사용
        for (String line : content) {
            bw.append(line).append("\n");
        }
        System.out.println("파일이 생성되었습니다.");

        bw.close();
        fw.close();
    }

    static void writeNo4() throws IOException {
        FileWriter fw = new FileWriter("tmp" + ".tmp");
        BufferedWriter bw = new BufferedWriter(fw);
        String filePath, content;

        System.out.println("\n-------------------------------------");
        while (true) {
            content = s.nextLine();
            if (content.isEmpty()) break;
            bw.append(content).append("\n");
            bw.flush();
            fw.flush();
        }

        bw.close();
        fw.close();

        File tmp = new File("tmp.tmp");
        if (!tmp.exists()) {
            System.out.println("파일 저장에 실패했습니다.");
            return;
        }

        filePath = getFilePath();
        File f = new File(filePath);
        if (f.exists() && !f.delete()) {
            System.out.println("기존 파일 삭제에 실패했습니다.");
            return;
        }

        if (!tmp.renameTo(f)) {
            System.out.println("파일 생성에 실패했습니다.");
            return;
        }
        ;

        System.out.println("파일이 생성되었습니다.");
    }

    static String getFilePath() {
        while (true) {
            String c = "y";
            System.out.print("저장할 파일의 이름: ");
            String filePath = s.nextLine();
            File f = new File(filePath + ".txt");
            if (f.exists()) {
                System.out.println("파일이 이미 존재합니다. 새로 생성하시겠습니까? (Y/N): ");
                c = s.nextLine();
            }
            if (c.equalsIgnoreCase("y")) return filePath + ".txt";
        }
    }
}
