package assignment.d0729.h;

public class Student {
    // 필드: 객체의 상태

    private static int serialId = 1001;
    private int studentId;
    private int[] scores;
    private char grade;
    private double avg;
    private String studentName, address;

    Student() {
    }

    Student(String studentName, int[] scores, String addreass) {
        setStudentId();
        this.studentId = serialId++;
        this.studentName = studentName;
        this.scores = scores;
        this.address = addreass;
        this.avg = 0;
    }

    // 메서드: 객체가 할 수 있는 것, 동작

    private void setStudentId() {
        this.studentId = serialId++;
    }

    public double calGrade() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        this.avg = (double) sum / scores.length;
        this.grade = whatGrade((int) this.avg);
        return this.avg;
    }

    public static char whatGrade(int score) {
        return switch (score / 10) {
            case 10, 9 -> 'A';
            case 8 -> 'B';
            case 7 -> 'C';
            case 6 -> 'D';
            default -> 'F';
        };
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public char getGrade() {
        return grade;
    }

    public String getAddress() {
        return address;
    }

    public static int getSerialId() {
        return serialId;
    }

    public int[] getScores() {
        return scores;
    }

    public double getAvg() {
        return avg;
    }
}
