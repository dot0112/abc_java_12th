package d250819;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Comparable<Student>, Serializable {
    String name;
    int[] subjectScores = new int[subjectNames.length];

    static final public String[] subjectNames = {"국어", "수학", "영어"};


    public enum Subject {
        korean, math, english
    }

    public Student() {
    }

    public Student(String name, int k, int m, int e) {
        this.name = name;
        this.subjectScores[Subject.korean.ordinal()] = k;
        this.subjectScores[Subject.math.ordinal()] = m;
        this.subjectScores[Subject.english.ordinal()] = e;
    }

    public Student(String name, int[] scores) {
        this.name = name;
        this.subjectScores = scores;
    }

    @Override
    public int compareTo(Student o) {
        return o.getTotal() - this.getTotal();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("\n[이름]\t").append(name).append("\n[과목]");
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

    int getScore(int n) {
        return subjectScores[n];
    }

    int getTotal() {
        return Arrays.stream(subjectScores).sum();
    }
}

