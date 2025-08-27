package api;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManagement {
    /*
        [학생 성적 관리 시스템]
        1. 입력
        2. 수정
        3. 검색
        4. 전체 출력
        0. 종료
        >

        번호 오류. 다시 입력하세요.
        1번 입력메뉴 선택했습니다.
    */

    Scanner s = new Scanner(System.in);
    StudentService stuSer = new StudentService();

    public static void main(String[] args) {
        StudentManagement stuMan = new StudentManagement();
        while (true) {
            printMenu();
            int c = stuMan.getSelect();
            if (c == 0) break;
            stuMan.runMethod(c);
        }
        exit();
    }

    static void exit() {
        System.out.println("\n프로그램을 종료합니다.");
        System.exit(0);
    }

    static void printMenu() {
        System.out.print("\n[학생 성적 관리 시스템]\n1. 입력\n2. 수정\n3. 검색\n4. 전체 출력\n0. 종료\n> ");
    }

    int getSelect() {
        while (true) {
            try {
                return s.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("번호 오류. 다시 입력하세요.");
                s.nextLine();
            }
        }
    }

    void runMethod(int c) {
        switch (c) {
            case 1 -> stuSer.addStudent();
            case 2 -> stuSer.updateStudent();
            case 3 -> stuSer.searchStudent();
            case 4 -> stuSer.readAllStudent();
            default -> {
                System.out.println("번호 오류. 다시 입력하세요.");
            }
        }
    }
}
