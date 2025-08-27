package api;


import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class StudentFileReader {
    private StudentFileReader() {
    }

    static ObjectOutputStream getOutputStream() throws IOException {
        return new ObjectOutputStream(new FileOutputStream("student.dat"));
    }

    static ObjectInputStream getInputStream() throws IOException {
        File f = new File("student.dat");
        if (!f.exists() && !f.createNewFile()) {
            System.out.println("Student 저장 파일 생성에 실패했습니다.");
        }
        return new ObjectInputStream(new FileInputStream("student.dat"));
    }

    static boolean write(Student s) throws IOException {
        ArrayList<Student> studentList = findAll();
        studentList.add(s);
        ObjectOutputStream oo = getOutputStream();

        for (Student t : studentList) {
            oo.writeObject(t);
        }
        oo.close();

        return true;
    }

    static void update(Student s) throws IOException {
        ArrayList<Student> studentList = findAll();

        ObjectOutputStream oo = getOutputStream();
        for (Student student : studentList) {
            if (student.getStudentId() != s.getStudentId()) oo.writeObject(student);
            else oo.writeObject(s);
        }
        oo.close();
    }

    static Student find(int studentId) throws IOException {
        ArrayList<Student> studentList = findAll();

        for (Student s : studentList) {
            if (s.getStudentId() == studentId) {
                return s;
            }
        }

        return null;
    }

    static ArrayList<Student> findAll() throws IOException {
        ArrayList<Student> studentList = new ArrayList<>();
        ObjectInputStream oi;
        try {
            oi = getInputStream();
        } catch (EOFException e) {
            return studentList;
        }

        while (true) {
            try {
                studentList.add((Student) Objects.requireNonNull(oi).readObject());
            } catch (IOException | ClassNotFoundException e) {
                break;
            }
        }

        oi.close();
        return studentList;
    }

    static int getHighestId() throws IOException {
        ArrayList<Student> studentList = findAll();
        int highestId = 0;

        Collections.sort(studentList);

        if (!studentList.isEmpty()) {
            highestId = studentList.get(studentList.size() - 1).getStudentId();
        }

        return highestId;
    }
}
