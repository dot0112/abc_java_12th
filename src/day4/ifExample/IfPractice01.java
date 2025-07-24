package day4.ifExample;

import java.util.Scanner;

public class IfPractice01 {

    /*
    문제 1. 시험점수를 정수로 입력받습니다 (0~100점)
    결과 예시:
    >
    합격입니다 | 불합격입니다 (80점 기준)
    90점이상 A
    80점이상 B
    70점이상 C
    60점이상 D
    60점미만 F

    범위를 벗어나는 입력치는 "입력오류"를 출력하세요
    */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("\n문제 1. 시험점수를 정수로 입력받습니다 (0~100점)\n시험점수를 입력해주세요: ");
        int score = s.nextInt();
        String result = "";

        if (score >= 0 && score <= 100) {
            result += (score < 80) ? "불합격입니다\n" : "합격입니다\n";

            int offset = 9 - (score / 10);
            if (offset < 0) offset = 0;
            else if (offset > 3) offset = 5;

            char grade = (char) ('A' + offset);
            result += grade;

        } else {
            result += "입력오류";
        }

        System.out.println(result);

        s.close();
    }
}
