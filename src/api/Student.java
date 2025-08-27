package api;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Comparable<Student>, Serializable {
    static private int idInitVal = 1;
    private int studentId;
    private String name;
    private int[] subjectScores = new int[subjectNames.length];

    static final public String[] subjectNames = {"국어", "수학", "영어"};


    public enum Subject {
        korean, math, english
    }

    public Student() {
        this.studentId = idInitVal++;
    }

    public Student(String name, int k, int m, int e) {
        this();
        this.name = name;
        this.subjectScores[Subject.korean.ordinal()] = k;
        this.subjectScores[Subject.math.ordinal()] = m;
        this.subjectScores[Subject.english.ordinal()] = e;
    }

    public Student(String name, int[] scores) {
        this();
        this.name = name;
        this.subjectScores = scores;
    }

    static void setIdInitVal(int idInitVal) {
        Student.idInitVal = idInitVal;
    }

    @Override
    public int compareTo(Student o) {
        return this.getStudentId() - o.getStudentId();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("\n[학번]\t").append(studentId)
                .append("\n[이름]\t").append(name)
                .append("\n[과목]");
        for (String name : subjectNames) result.append("\t").append(name);
        result.append("\n[점수]");
        for (int score : subjectScores) result.append("\t").append(score);
        result.append("\n");
        return result.toString();
    }

    public String getName() {
        return name;
    }

    void setScore(int n, int score) {
        subjectScores[n] = score;
    }

    void setScore(int[] scores) {
        subjectScores = scores;
    }

    void setScore(int k, int m, int e) {
        subjectScores = new int[]{k, m, e};
    }

    void setName(String name) {
        this.name = name;
    }

    int getScore(int n) {
        return subjectScores[n];
    }

    int getTotal() {
        return Arrays.stream(subjectScores).sum();
    }

    int getStudentId() {
        return studentId;
    }
}

