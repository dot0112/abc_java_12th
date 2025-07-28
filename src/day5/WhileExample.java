package day5;

public class WhileExample {

    /*
    1. while 문
    while (조건식) {
        실행문;
    }
    조건은 boolean 값을 반환해야 하며 참을 반환하는 동안 실행문을 반복
    실행 내용은 중괄호 안에 들어있음
    */

    public static void main(String[] args) {
        int num = 1, sum = 0; // 누산 결과를 담을 변수를 따로 선언
        while (num <= 10) { // 조건부터 확인
            sum += num++;
        }
        System.out.println("1 부터 10 까지의 합은 " + sum + " 입니다");
    }
}
