package day3;

import java.util.Scanner;

public class Practice02 {

    /*
    문제 1. 초 단위의 숫자를 입력받아 시간, 분, 초 단위로 환산한다.
    결과 예시:
    >
    초 단위로 입력하세요 : 3606
    1시간 0분 6초
    */

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("\n문제 1. 초 단위의 숫자를 입력받아 시간, 분, 초 단위로 환산한다.");
        System.out.print("초 단위로 입력하세요 : ");
        int time = s.nextInt();
        System.out.printf("%d시간 %d분 %d초\n",
                time / (60 * 60),
                (time / 60) % 60,
                time % 60);

        s.close();
    }
}
