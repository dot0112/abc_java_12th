package d250819;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListTest3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Student> studentsList = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String name;
            int[] scores = new int[3];
            System.out.print("학생의 이름을 입력하세요: ");
            name = s.next();
            System.out.println("학생의 성적을 입력하세요: ");
            for (int j = 0; j < Student.subjectNames.length; j++) {
                System.out.printf("[%s]: ", Student.subjectNames[j]);
                scores[j] = s.nextInt();
            }
            studentsList.add(new Student(name, scores));
        }

        Collections.sort(studentsList);

        System.out.println("\n" + studentsList);

        s.close();
    }
}