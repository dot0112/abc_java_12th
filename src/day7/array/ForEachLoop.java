package day7.array;

public class ForEachLoop {

    /*
    배열을 위한 향상된 forLoop

    for(자료형 변수명 : 배열) {
        수행문;
    }

    */

    public static void main(String[] args) {
        String[] subjects = {"Java", "DB", "FrontEnd"};

        for (int i = 0; i < subjects.length; i++) {
            System.out.print(subjects[i] + " ");
        }
        System.out.println();

        for (String subject : subjects) {
            System.out.print(subject + " ");
        }
        System.out.println();

        for (int i = 0; i < subjects.length; i++) {
            if (i == 1) System.out.print(subjects[i] + " ");
        }
        System.out.println();
    }
}
