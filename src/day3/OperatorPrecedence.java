package day3;

public class OperatorPrecedence {

    /*
    연산자 우선순위 p.85
    () -> 단항 -> 이항(산술 -> 비교, 관계 -> 논리 -> 대입) -> 삼항
    */

    public static void main(String[] args) {
        // 1. 곱셈과 덧셈의 우선순위
        int result1 = 2 + 3 * 4;
        System.out.println("result1: " + result1);

        // 2. 괄호를 사용해 우선순위를 변경
        int result2 = (2 + 3) * 4;
        System.out.println("result2: " + result2);

        // 3. 대입 연산자와 산술 연산자의 우선순위
        int a = 10, b = 5;
        a = b + 2;
        System.out.println("a: " + a);

        // 4. 비교 연산자와 논리 연산자의 우선순위
        boolean result3 = 5 > 3 && 2 < 4;
        System.out.println("result3: " + result3);

        // 5. 전체 우선순위
        int result4 = 10 - 3 + 2 * 5 / (1 + 1); // (((2 * 5) / (1 + 1)) - 3) + 10) = 12
        System.out.println("result4: " + result4);
    }
}
