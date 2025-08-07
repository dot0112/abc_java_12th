package day11;

public class Student {
    private static int serialNum = 1000;
    int studentId, grade;
    String name;

    public Student(int grade, String name) {
        this.studentId = ++serialNum;
        this.grade = grade;
        this.name = name;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", grade=" + grade +
                ", name='" + name + '\'' +
                '}';
    }
}
