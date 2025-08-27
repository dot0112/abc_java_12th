package api_2;

import java.io.IOException;
import java.util.ArrayList;

public class StudentService {
    ArrayList<Student> studentList;

    StudentService() {
        int idInitVal = 1;
        try {
            idInitVal = StudentFileReader.getHighestId() + 1;
        } catch (IOException e) {
            System.out.println("학생 정보 초기화에 오류가 발생했습니다.");
        }
        Student.setIdInitVal(idInitVal);

        try {
            studentList = StudentFileReader.findAll();
        } catch (IOException e) {
            studentList = new ArrayList<>();
        }
    }

    void add(String name, int[] scores) throws IOException {
        studentList.add(new Student(name, scores));
        StudentFileReader.write(studentList);
    }

    void delete(int studentId) throws IOException {
        for (Student s : studentList) {
            if (s.getStudentId() == studentId) {
                studentList.remove(s);
                break;
            }
        }
        StudentFileReader.write(studentList);
    }

    void update(int studentId, String name, int[] scores) throws IOException {
        for (Student s : studentList) {
            if (s.getStudentId() == studentId) {
                s.setName(name);
                s.setScore(scores);
                break;
            }
        }
        StudentFileReader.write(studentList);
    }

    Student search(int studentId) throws IOException {
        return StudentFileReader.find(studentId);
    }

    ArrayList<Student> readAll() throws IOException {
        return StudentFileReader.findAll();
    }
}
