package day2;

public class Constant {

    /*
    상수 (Constant) - final
    변하지 않는 값을 저장하기 위함
    값의 재대입이 불가능함
    */

    public static void main(String[] args) {
        final int MAX_NUM = 100;    // 정수형 상수 MAX_NUM 을 선언 후 100 으로 초기화
        final int MIN_NUM;  // 정수형 상수 MIN_HUM 을 선언 - 초기화 필수 아님

        MIN_NUM = 0;    // 초기화되지 않은 상수의 값을 초기화
        // MIN_NUM = -99; - 컴파일 오류: 초기화된 상수는 값의 변경이 불가

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);
    }
}
