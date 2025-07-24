package day4.ifExample;

import java.util.Scanner;

public class IfPractice03 {

    /*
    태어난 해가 윤년인지 확인하여 결과를 출력하세요
    4년마다 윤년, 100년마다 평년, 400년마다는 윤년
    2001, 1900년 -> 평년, 2004, 2000 -> 윤년
    */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("\n태어난 해가 윤년인지 확인하여 결과를 출력하세요\n태어난 해를 입력해주세요: ");
        int year = s.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) System.out.println("윤년입니다");
        else System.out.println("평년입니다");

        s.close();
    }
}
