package assignment.d0725.t;

import java.util.Scanner;

public class Assignment1_t {

    /*
    입력받으세요 -> Scanner   @input
    등급에 따른 출력 구분 -> 조건문
    cm->m   @height @heightMeter
    kg      @weight

    출력할 때 "당신의 BMI는 %.2f이며, '%s'입니다" @bmi @result
    */
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int height, weight;
        double heightMeter, bmi = 0;
        String result = "";

        // 입력받기
        // bmi 식에 맞춰서 연산
        // 연산 결과에 따른 result값 구분()

        System.out.printf("당신의 BMI는 %.2f이며, '%s'입니다", bmi, result);

        input.close();
    }
}
