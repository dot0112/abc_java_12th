package studentReport;

import java.util.Scanner;

public class Student {
    // 필드: 객체의 상태

    private static int serialId = 1001;
    private int studentId;
    private int[] scores;
    private char grade;
    private double avg;
    private final String studentName, address;

    Student(String studentName, int[] scores, String address) {
        this.studentId = serialId++;
        this.studentName = studentName;
        this.scores = scores;
        this.address = address;
    }

    // 메서드: 객체가 할 수 있는 것, 동작

    public void calGrade() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        this.avg = (double) sum / scores.length;
        this.grade = setGrade((int) this.avg);
    }

    public static char setGrade(int score) {
        return switch (score / 10) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };
    }

    public static int[] inputScores(Scanner s) {
        int[] scores = new int[3];
        System.out.print("성적을 입력하세요 (국어, 영어, 수학): ");
        for (int j = 0; j < 3; j++) {
            scores[j] = s.nextInt();
        }
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public void printScores() {
        System.out.printf("%s\t%d\t%d\t%d\n",
                studentName,
                scores[0],
                scores[1],
                scores[2]);
    }

    public void printGrade() {
        calGrade();
        System.out.printf("학생 [%s, %d]의 평균은 [%.2f]이고 등급은 [%c]입니다.\n",
                studentName, studentId, avg, grade);
    }
}
