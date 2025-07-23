package day2;

public class Operator {

    /*
    연산자 (Operator)
    항 - 연산에 사용하는 값

    --- 연산자의 종류 ---
    + 대입 연산자: 오른쪽 항에 있는 값을 왼쪽 항에 대입 (=)
        - 복합 대입 연산자: (+=, -=, *=, /=, %=)
    + 산술 연산자: 사칙 연산과 나머지 연산 (+, -, *, /, %)
    + 증감 연산자: 단항 연산자, 값의 재할당 이후 반환 (++ : 증가 연산자, -- : 감소 연산자)
    + 관계 연산자: 논리 값을 반환하는 연산자(==, !=, >, >=, <=, <)
    + 논리 연산자: (&& : AND, || : OR, ! : NOT)
    + 비트 연산자: (~, ^, |, <<, >>)
    + 조건 연산자: 삼항 연산자 ( (조건) ? A : B)
    + 인스턴스 연산자:
    + 형변환 연산자: ( (자료형)변수 )
    */

    public static void main(String[] args) {
        System.out.println("\t--- 2025-07-22 ---");

        // 산술 연산자
        int mathScore = 50;
        int engScore = 61;
        int totalScore = mathScore + engScore;
        System.out.println(totalScore);

        double avgScore = totalScore / 2.0;
        System.out.println(avgScore);

        System.out.println(5 * 3);
        System.out.println(5 - 3);
        System.out.println(5 % 2);


        // 증감 연산자
        int gameScore = 150;
        int lastScore = ++gameScore;

        System.out.println(lastScore);
        System.out.println(gameScore);
        System.out.println(lastScore++);
        System.out.println(++lastScore);
        System.out.println(lastScore--);
        System.out.println(--lastScore);


        // 관계 연산자
        System.out.println(1 > 3);  // false
        System.out.println(1 < 3);  // true
        System.out.println(1 >= 3); // false
        System.out.println(1 <= 3); // true
        System.out.println(1 == 3); // false
        System.out.println(1 != 3); // true


        System.out.println("\t--- 2025-07-23 ---");

        // 논리 연산자
        // AND  연산자 (논리곱): 둘 다 참일때 참
        // OR   연산자 (논리합): 둘 중에 하나라도 참이면
        // NOT  연산자 (부정): 단항연산자, 논리형 값을 반대의 값으로 바꿈
        int num1 = 10, num2 = 20;
        boolean flag = (num1 > 0) && (num2 > 0);
        System.out.println(flag);
        flag = (num1 > 0) && (num2 < 0);
        System.out.println(flag);
        flag = (num1 > 0) || (num2 < 0);
        System.out.println(flag);
        flag = (num1 < 0) || (num2 < 0);
        System.out.println(flag);
        System.out.println(!flag);
        System.out.println(flag);

        // 단락 회로 평가 p.77
        int i = 2;
        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
        System.out.println(value);
        System.out.println(num1);   // 단락 회로 평가(논리곱)에 의해 (i = i + 2)가 실행되기 이전 코드가 종료
        System.out.println(i);

        value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
        System.out.println(value);
        System.out.println(num1);   // 단락 회로 평가(논리합)에 의해 (i = i + 2)가 실행되기 이전 코드가 종료
        System.out.println(i);


        // 삼항 연산자 (조건 연산자) : (조건문) ? 참일때 : 거짓일때
        System.out.println((5 > 3) ? 10 : 20);

        int fatherAge = 45;
        int motherAge = 47;
        String result;
        result = (fatherAge > motherAge) ? "아버지 나이가 어머니 나이보다 많습니다" : "어머니 나이가 아버지 나이보다 많습니다";
        System.out.println(result);


        // 복합 대입 연산자 : 연산자의 좌항에 우항의 값으로 산술 연산(+, -, *, /, %) 후 대입
        System.out.println(i);
        i = i + 2;
        i += 2;
        System.out.println(i);  // (i + 2) + 2
        num1 -= 1;
        num1 *= 2;
        num1 /= 10;
        num1 %= 2;
        System.out.println(num1);   // (((num1 - 1) * 2) / 10) % 2
    }
}
