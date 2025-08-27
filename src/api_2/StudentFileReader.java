package api_2;


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
        if (!f.exists()) {
            if (!f.createNewFile()) {
                System.out.println("Student 저장 파일 생성에 실패했습니다.");
            }
        }
        return new ObjectInputStream(new FileInputStream("student.dat"));
    }

    static void write(ArrayList<Student> list) throws IOException {
        ObjectOutputStream oo = getOutputStream();
        oo.writeObject(list);

        /*
        - Student 객체를 1개씩 저장하는 경우
        for (Student s : list) {
            oo.writeObject(s);
        }
         */
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

    @SuppressWarnings("unchecked")
    static ArrayList<Student> findAll() throws IOException {
        ArrayList<Student> studentList = null;
        ObjectInputStream oi = null;

        try {
            oi = getInputStream();
            studentList = (ArrayList<Student>) oi.readObject();
        } catch (IOException | ClassNotFoundException e) {
            studentList = new ArrayList<>();
        }

        /*
        - Student 객체를 1개씩 저장한 경우
        while (true) {
            try {
                studentList.add((Student) Objects.requireNonNull(oi).readObject());
            } catch (IOException | ClassNotFoundException e) {
                break;
            }
        }
         */

        Objects.requireNonNull(oi).close();
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
