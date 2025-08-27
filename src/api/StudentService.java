package api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentService {
    Scanner s = new Scanner(System.in);

    StudentService() {
        init();
    }

    void init() {
        int idInitVal = 1;
        try {
            idInitVal = StudentFileReader.getHighestId() + 1;
        } catch (IOException e) {
            System.out.println("학생 정보 초기화에 오류가 발생했습니다.");
        }
        Student.setIdInitVal(idInitVal);
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
            if (StudentFileReader.write(new Student(name, scores))) {
                System.out.println("학생을 입력하였습니다.");
            }
        } catch (IOException e) {
            System.out.println("학생 입력에 실패하였습니다.");
        }
    }

    void updateStudent() {
        int studentId;
        Student t = null;

        System.out.print("\n=== 수정 ===\n수정할 학생의 학번을 입력하세요: ");
        studentId = s.nextInt();

        try {
            t = StudentFileReader.find(studentId);
        } catch (IOException e) {
            System.out.println("학생 정보 검색에 실패하였습니다.");
        }

        if (t != null) {
            s.nextLine();
            System.out.println(t);
            System.out.printf("변경할 학생의 이름을 입력하세요(기존: %s): ", t.getName());
            String name = s.nextLine();
            if (!name.isEmpty()) t.setName(name);

            for (int i = 0; i < Student.subjectNames.length; i++) {
                System.out.printf("변경할 학생의 %s 점수를 입력하세요(기존: %d): ", Student.subjectNames[i], t.getScore(i));
                String score = s.nextLine();
                if (!score.isEmpty()) {
                    try {
                        t.setScore(i, Integer.parseInt(score));
                    } catch (NumberFormatException e) {
                        System.out.println("변경할 점수는 정수로 입력해야합니다.");
                    }
                }
            }

            System.out.println("[변경 후]\n" + t);

            try {
                StudentFileReader.update(t);
            } catch (IOException e) {
                System.out.println("학생 정보 수정에 실패하였습니다.");
            }
        }
    }

    void searchStudent() {
        System.out.println("\n=== 검색 ===\n검색할 학생의 학번을 입력하세요: ");
        int studentId = 0;
        try {
            studentId = s.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("잘못된 학번 형식입니다.");
        }

        if (studentId > 0) {
            try {
                Student s = StudentFileReader.find(studentId);
                if (s != null) System.out.println(s);
                else System.out.println("해당 학생을 찾지 못했습니다.");
            } catch (IOException e) {
                System.out.println("학생 검색에 실패했습니다.");
            }
        }
    }

    void readAllStudent() {
        try {
            ArrayList<Student> studentList = StudentFileReader.findAll();
            Collections.sort(studentList);
            System.out.println("\n" + studentList);
        } catch (IOException e) {
            System.out.println("학생 전체 출력에 실패했습니다.");
        }
    }
}
