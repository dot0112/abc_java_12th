package studentReport;

public class StudentBuilder {
    String studentName = "";
    int[] scores = new int[3];
    String address = "";

    StudentBuilder(String studentName) {
        this.studentName = studentName;
    }

    StudentBuilder scores(int[] grade) {
        System.arraycopy(grade, 0, this.scores, 0, scores.length);
        return this;
    }

    StudentBuilder address(String address) {
        this.address = address;
        return this;
    }

    Student buildStudent() {
        return new Student(this.studentName,
                this.scores,
                this.address);
    }
}
