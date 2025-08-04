package day9;

public class Student {
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // 필드: 객체의 상태
    private int studentId;
    String studentName;
    int grade;
    String address;

    Student(int studentId, String studentName, int grade, String addreass) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
        this.address = addreass;
    }

    // 메서드: 객체가 할 수 있는 것, 동작
    void greet() {
        System.out.println(studentName + "님이 인사를 합니다: 안녕하세요");
    }
}
