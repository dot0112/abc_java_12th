package studentReport;

import java.util.Scanner;

public class StudentReportMainArray {
    static Scanner s = new Scanner(System.in);


    /**
     * 계산기 메인 메서드
     */
    public static void gradeCal2() {
        Student[] students = new Student[3];

        while (true) {
            try {
                printMenuGradeCal2();
                int f = s.nextInt();
                switch (f) {
                    case 1 -> getStudentInfo(students);
                    case 2 -> printSelectGrade(students);
                    case 3 -> printAllGrade(students);
                    case 4 -> editScore(students);
                    case 5 -> deleteStudent(students);
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
     *
     * @param students 학생 배열
     */
    static void getStudentInfo(Student[] students) {
        try {
            for (int i = 0; i < students.length; i++) {
                if (students[i] != null) continue;
                String name, address;

                System.out.printf("\n[ %d ]\n학생의 이름을 입력하세요: ", i);
                name = s.next();
                System.out.print("학생의 주소을 입력하세요: ");
                s.nextLine();
                address = s.nextLine().trim();

                students[i] = new StudentBuilder(name)
                        .address(address)
                        .scores(Student.inputScores(s))
                        .buildStudent();
            }
        } catch (NullPointerException e) {
            System.out.println("전체 학생 정보를 먼저 입력해야합니다. (메뉴: 0)");
        }
    }


    /**
     * 선택 학생 정보 출력 메서드
     *
     * @param students 학생 배열
     */
    static void printSelectGrade(Student[] students) {
        printStudentInfo(students);
        System.out.printf("\n점수를 확인할 학생을 선택하세요(0 ~ %d): ", students.length - 1);
        int num = s.nextInt();

        if (students[num] != null) {
            System.out.print("\n이름\t국어\t영어\t수학\n");
            students[num].printScores();
            students[num].printGrade();
        } else {
            System.out.println("학생 정보가 존재하지 않습니다.");
        }
    }

    /**
     * 모든 학색 정보 출력 메서드
     *
     * @param students 학생 배열
     */
    static void printAllGrade(Student[] students) {
        printStudentInfo(students);
        System.out.println();
        for (int i = 0; i < students.length; i++) {
            System.out.printf("[%d]: ", i);
            if (students[i] != null) {
                students[i].printGrade();
            } else {
                System.out.println("학생 정보가 존재하지 않습니다.");
            }
        }
        System.out.println();

    }

    /**
     * 선택 학생 정보 출력 메서드
     *
     * @param students 학생 배열
     */
    static void editScore(Student[] students) {
        printStudentInfo(students);
        System.out.printf("\n점수를 변경할 학생을 선택하세요(0 ~ %d): ", students.length - 1);
        int num = s.nextInt();
        if (students[num] != null) {
            students[num].setScores(Student.inputScores(s));

            System.out.print("\n=== 변경 내역 ===\n이름\t국어\t영어\t수학\n");
            students[num].printScores();
        } else {
            System.out.println("학생 정보가 존재하지 않습니다.");
        }

    }


    /**
     * 선택 학생 정보 삭제 메서드
     *
     * @param students 학생 배열
     */
    static void deleteStudent(Student[] students) {
        printStudentInfo(students);

        System.out.printf("\n정보를 삭제할 학생을 선택하세요(0 ~ %d): ", students.length - 1);
        int num = s.nextInt();

        students[num] = null;
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
     *
     * @param students 학생 배열
     */
    static void printStudentInfo(Student[] students) {
        System.out.print("\n이름\t국어\t영어\t수학\n");
        for (int i = 0; i < students.length; i++) {
            System.out.printf("[%d]: ", i);
            if (students[i] != null) {
                students[i].printScores();
            } else {
                System.out.println("학생 정보가 존재하지 않습니다.");
            }
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

