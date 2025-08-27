package lessonCode.memberAccessOperator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 입력 값이 "abcd"인 경우
        // Q1-1
        System.out.println(s.next().length());
        // Q1-2
        System.out.println((char) (s.next().toLowerCase().toUpperCase().charAt(1) + 1));


        Test object = new Test(10);
        Test object2 = object.getThis().getNew().setIntVar(20);

        // Q2-1
        System.out.println(object2.getThis().getIntVarString());
        // Q2-2
        System.out.println(object.setIntVar(100).getNew().getIntVar());
        // Q2-3
        object2 = object.getNew();
        System.out.println(object2 == object);
        // Q2-4
        System.out.println(object2.getIntVar());

    }
}
