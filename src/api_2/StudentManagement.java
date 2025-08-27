package api_2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManagement {
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
        System.out.print("\n[학생 성적 관리 시스템]\n1. 입력\n2. 수정\n3. 삭제\n4. 전체 출력\n5. 검색\n0. 종료\n> ");
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
            case 1 -> addStudent();
            case 2 -> updateStudent();
            case 3 -> removeStudent();
            case 4 -> readAllStudent();
            case 5 -> searchStudent();
            default -> System.out.println("번호 오류. 다시 입력하세요.");
        }
    }

    void addStudent() {
        String name;
        int[] scores = new int[3];

        System.out.print("\n=== 입력 ===\n학생의 이름을 입력하세요: ");

        name = s.next();
        System.out.println("학생의 성적을 입력하세요: ");
        for (int j = 0; j < Student.subjectNames.length; j++) {
            System.out.printf("[%s]: ", Student.subjectNames[j]);
            try {
                scores[j] = s.nextInt();
                if (scores[j] < 0 || scores[j] > 100) throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println("올바른 숫자를 입력해주세요. (0 ~ 100)");
                s.nextLine();
                j -= 1;
            }
        }

        try {
            stuSer.add(name, scores);
            System.out.println("학생을 추가하였습니다.");
        } catch (IOException e) {
            System.out.println("학생 추가에 실패하였습니다.");
        }
    }

    void updateStudent() {
        int studentId;
        Student t = null;


        System.out.print("\n=== 수정 ===");
        while (true) {
            System.out.print("\n수정할 학생의 학번을 입력하세요: ");
            try {
                studentId = s.nextInt();
                if (studentId < 1) throw new InputMismatchException();
                break;
            } catch (InputMismatchException e) {
                System.out.println("잘못된 학번 형식입니다.");
                s.nextLine();
            }
        }

        try {
            t = stuSer.search(studentId);
        } catch (IOException e) {
            System.out.println("학생 정보 검색에 실패하였습니다.");
        }

        if (t != null) {
            String name = t.getName();
            int[] scores = new int[3];

            s.nextLine();
            System.out.println(t);
            System.out.printf("변경할 학생의 이름을 입력하세요(기존: %s): ", t.getName());
            String tName = s.nextLine();
            if (!tName.isEmpty()) name = tName;

            for (int i = 0; i < Student.subjectNames.length; i++) {
                System.out.printf("변경할 학생의 %s 점수를 입력하세요(기존: %d): ", Student.subjectNames[i], t.getScore(i));
                String score = s.nextLine();
                if (!score.isEmpty()) {
                    try {
                        scores[i] = Integer.parseInt(score);
                    } catch (NumberFormatException e) {
                        System.out.println("변경할 점수는 정수로 입력해야합니다.");
                    }
                } else {
                    scores[i] = t.getScore(i);
                }
            }

            try {
                stuSer.update(studentId, name, scores);
                System.out.println("[변경 후]\n" + stuSer.search(studentId));
            } catch (IOException e) {
                System.out.println("학생 정보 수정에 실패하였습니다.");
            }
        } else {
            System.out.println("해당 학생이 존재하지 않습니다.");
        }
    }

    void searchStudent() {
        System.out.print("\n=== 검색 ===");
        int studentId;
        while (true) {
            System.out.print("\n검색할 학생의 학번을 입력하세요: ");
            try {
                studentId = s.nextInt();
                if (studentId < 1) throw new InputMismatchException();
                break;
            } catch (InputMismatchException e) {
                System.out.println("잘못된 학번 형식입니다.");
                s.nextLine();
            }
        }

        try {
            Student s = stuSer.search(studentId);
            if (s != null) System.out.println(s);
            else System.out.println("해당 학생을 찾지 못했습니다.");
        } catch (IOException e) {
            System.out.println("학생 검색에 실패했습니다.");
        }
    }

    void readAllStudent() {
        try {
            ArrayList<Student> studentList = stuSer.readAll();
            Collections.sort(studentList);
            System.out.println("\n" + studentList);
        } catch (IOException e) {
            System.out.println("학생 전체 출력에 실패했습니다.");
        }
    }

    void removeStudent() {
        System.out.print("\n=== 삭제 ===\n삭제할 학생의 학번을 입력하세요: ");
        int studentId;

        while (true) {
            try {
                studentId = s.nextInt();
                if (studentId < 1) throw new InputMismatchException();
                break;
            } catch (InputMismatchException e) {
                System.out.println("잘못된 학번 형식입니다.");
                s.nextLine();
            }
        }

        try {
            Student t = stuSer.search(studentId);
            if (t != null) {
                System.out.println("\n{ 삭제할 학생 정보 }" + t);
                System.out.print("선택한 학생을 삭제하시겠습니까(Y/[N]): ");

                s.nextLine();
                String c = s.nextLine();
                if (c.equalsIgnoreCase("Y")) {
                    stuSer.delete(studentId);
                    System.out.println("선택한 학생을 삭제하였습니다.");
                } else {
                    System.out.println("삭제를 취소합니다.");
                }
            } else System.out.println("해당 학생을 찾지 못했습니다.");
        } catch (IOException e) {
            System.out.println("학생 삭제에 실패했습니다.");
        }
    }
}