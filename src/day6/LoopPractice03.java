package day6;

import java.util.Scanner;

public class LoopPractice03 {

    /*
    정수를 입력받아 합계를 구한다
    입력받은 정수가 0이면 무조건 종료한다
    for while do-while 세가지 버전으로 만드세요
    [출력 예시]
    정수1 입력: 5
    정수2 입력: 6
    정수3 입력: 7
    정수4 입력: 0
    합계: 18
    */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum, i, n = -1;


        System.out.println("\n[for 반복문]");
        for (sum = 0, i = 1; n != 0; ) {
            System.out.printf("정수%d 입력: ", i++);
            n = s.nextInt();
            sum += n;
        }
        System.out.printf("합계: %d\n", sum);


        i = 0;
        sum = 0;
        n = -1;
        System.out.println("\n[while 반복문]");
        while (n != 0) {
            System.out.printf("정수%d 입력: ", ++i);
            n = s.nextInt();
            sum += n;
        }
        System.out.printf("합계: %d\n", sum);


        i = 0;
        sum = 0;
        System.out.println("\n[do-while 반복문]");
        do {
            System.out.printf("정수%d 입력: ", ++i);
            n = s.nextInt();
            sum += n;
        } while (n != 0);
        System.out.printf("합계: %d\n", sum);


        s.close();
    }
}
