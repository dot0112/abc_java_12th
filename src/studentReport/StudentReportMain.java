package studentReport;

import java.util.Scanner;
import java.util.Vector;

public class StudentReportMain {
    static Scanner s = new Scanner(System.in);
    static Vector<Student> students = new Vector<>();

    /**
     * 계산기 메인 메서드
     */
    public static void gradeCal2() {

        while (true) {
            try {
                printMenuGradeCal2();
                int f = s.nextInt();
                switch (f) {
                    case 1 -> getStudentInfo();
                    case 2 -> printSelectGrade();
                    case 3 -> printAllGrade();
                    case 4 -> editScore();
                    case 5 -> deleteStudent();
                    case 0 -> {
                        return;
                    }
                }
            } catch (Exception e) {
                System.out.println("오류 발생\n" + e);
                s.nextLine();
            }

        }

    }

    /**
     * 학생 정보 입력 메서드
     */
    static void getStudentInfo() {
        String name, address;

        System.out.print("학생의 이름을 입력하세요: ");
        name = s.next();
        System.out.print("학생의 주소을 입력하세요: ");
        s.nextLine();
        address = s.nextLine().trim();

        students.add(new StudentBuilder(name)
                .address(address)
                .scores(Student.inputScores(s))
                .buildStudent());
    }

    /**
     * 선택 학생 정보 출력 메서드
     */
    static void printSelectGrade() {
        if (!students.isEmpty()) {
            printStudentInfo();
            System.out.printf("\n점수를 확인할 학생을 선택하세요(0 ~ %d): ", students.size() - 1);
            int num = s.nextInt();

            System.out.print("\n이름\t국어\t영어\t수학\n");
            students.get(num).printScores();
            students.get(num).printGrade();
        } else {
            System.out.println("학새 정보가 없습니다.");
        }
    }

    /**
     * 모든 학색 정보 출력 메서드
     */
    static void printAllGrade() {
        printStudentInfo();
        System.out.println();
        for (int i = 0; i < students.size(); i++) {
            System.out.printf("[%d]: ", i);
            students.get(i).printGrade();
        }
        System.out.println();

    }

    /**
     * 선택 학생 정보 출력 메서드
     */
    static void editScore() {
        if (!students.isEmpty()) {
            printStudentInfo();
            System.out.printf("\n점수를 변경할 학생을 선택하세요(0 ~ %d): ", students.size() - 1);
            int num = s.nextInt();

            students.get(num).setScores(Student.inputScores(s));

            System.out.print("\n=== 변경 내역 ===\n이름\t국어\t영어\t수학\n");
            students.get(num).printScores();
        } else {
            System.out.println("학생 정보가 없습니다.");
        }

    }

    /**
     * 선택 학생 정보 삭제 메서드
     */
    static void deleteStudent() {
        if (!students.isEmpty()) {
            printStudentInfo();

            System.out.printf("\n정보를 삭제할 학생을 선택하세요(0 ~ %d): ", students.size() - 1);
            int num = s.nextInt();

            students.remove(num);
        } else {
            System.out.println("학새 정보가 없습니다.");
        }
    }

    /**
     * 메뉴 출력 메서드
     */
    static void printMenuGradeCal2() {
        System.out.print("""
                
                === 성적 계산기 2 ===
                [1] 학생 정보 입력
                [2] 선택 학생 정보 출력
                [3] 모든 학생 정보 출력
                [4] 선택 학생 정보 수정
                [5] 선택 학생 정보 삭제
                [0] 계산기 종료
                번호 선택:\s""");
    }

    /**
     * 학생 정보 출력 메서드
     */
    static void printStudentInfo() {
        System.out.print("\n이름\t국어\t영어\t수학\n");
        for (int i = 0; i < students.size(); i++) {
            System.out.printf("[%d]: ", i);
            students.get(i).printScores();
        }
    }

    /**
     * 프로세스 시작점
     */
    public static void main(String[] args) {
        gradeCal2();

        s.close();
    }
}