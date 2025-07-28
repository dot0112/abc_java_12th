package day5;

public class ForExample {

    /*
    3. for 문
    for (초기화식;조건식;증감식) {
        수행문;
    }

    for문 괄호 안의 세 요소는 모두 생략 가능하다
        - 초기화식: 반복 전에 이미 초기화된 변수를 사용하는 경우 생략할 수 있다.
        - 조건식: 수행문 내에서 임의 조건으로 제어(break)하거나, 무한히 반복시킬 경우 조건식을 생략할 수 있다.
        - 증감식: 증감식이 필요하지 않은 조건문이거나, 수행문 내에서 처리할 경우 증감식을 생략할 수 있다.
    */

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 10; sum += i++) ;
        System.out.println("1 부터 10 까지의 합은 " + sum + " 입니다");
    }
}
