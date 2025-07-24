package day4.ifExample;

import java.util.Scanner;

public class IfPractice02 {
    
    /*
    생년과 올해를 입력받으세요
    문제 1. 태어난 해가 잘못된 값일 경우 "태어난 해는 올해보다 이전이어야 합니다" 를 출력하는 조건문을 만드세요
    올바른 값일 경우 몇살 출력
    문제 2. 태어난 해와 올해가 홀수인지 짝수인지
    문제 3. "태어난 해가 3의 배수이고 올해는 5의 배수가 아니다" 를 출력하는 조건문을 만드세요
    */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int bYear, tYear;
        System.out.print("\n생년을 입력해주세요: ");
        bYear = s.nextInt();
        System.out.print("\n올해의 년도를 입력해주세요: ");
        tYear = s.nextInt();

        System.out.println("\n문제 1. 태어난 해가 잘못된 값일 경우 \"태어난 해는 올해보다 이전이어야 합니다\" 를 출력하는 조건문을 만드세요");
        if (bYear > tYear) {
            System.out.println("태어난 해는 올해보다 이전이어야 합니다");
        } else {
            System.out.printf("나이는 %d\n", tYear - bYear + 1);
        }

        System.out.println("\n문제 2. 태어난 해와 올해가 홀수인지 짝수인지");
        System.out.printf("태어난 해: %s\t올해: %s\n", (bYear % 2 == 1) ? "홀수" : "짝수", (tYear % 2 == 1) ? "홀수" : "짝수");

        System.out.println("\n문제 3. \"태어난 해가 3의 배수이고 올해는 5의 배수가 아니다\" 를 출력하는 조건문을 만드세요");
        if (bYear % 3 == 0 && tYear % 5 != 0) {
            System.out.println("태어난 해가 3의 배수이고 올해는 5의 배수가 아니다");
        } else {
            System.out.println("그렇지 않다.");
        }

        s.close();
    }
}
