package day7;

public class DataType {

    /*
    p.47 시작
    데이터를 저장하는 공간의 크기는 바이트 단위로 말한다
    변수를 선언할 때 데이터 타입을 정해야한다

    --- 기본 자료형 (원시 자료형, primitive type) --- (Scale:byte)
    + 정수형: byte(1), short(2), int(4), long(8)
    + 문자형: char(2)
    + 실수형: float(4), double(8)
    + 논리형: boolean(1)
    * 각 자료형은 담을 수 있는 데이터의 크기가 다르다. 데이터가 넘치면 오류가 난다.

    --- 참조 자료형 ---
    + 문자열을 저장하는 String > 참조 자료형에 속함
    / 값을 저장하는 방식과 그 값에 접근하는 방식에서 차이가 난다
    / 참조 자료형은 실제 데이터는 다른 곳에 있고, 그 위치가 어디인지를 변수에 저장하는 방식
    */

    public static void main(String[] args) {
        // 정수형
        byte bVal = 20;
        short sVal = 30;
        int iVal = 40;
        long lVal = 1234567890L;    // 정수 뒤에 문자 'L'을 붙여서 명시 표기 가능
        // byte overByteVal = 128; - 컴파일 오류: 자료형에 맞지 않는 데이터

        print(bVal + sVal + iVal);


        // 문자형
        // 문자를 정수형 변수에 대입하는 경우 ASCII 코드 값에 맞는 정수가 입력됨
        char ch1 = 'A';
        char ch2 = 66;
        int ch3 = 67;
        char ch4 = '한';
        char ch5 = '\uD55c';
        int ch6 = 54620;
        // char ch1 = "A"; - 컴파일 오류: 자료형에 맞지 않는 데이터
        // char ch6 = -65; - 컴파일 오류: 문자형에는 음수값이 대입되면 오류

        print(ch1);
        print(ch1);   // 강제 형변환
        print(ch2);
        print(ch3);
        print((char) ch3);
        print(ch4);
        print(ch4);
        print(ch5);
        print((char) ch6);

        // 논리형
        boolean isStudent = false;

        print(isStudent);
        // System.out.println((int)isStudent); - 컴파일 오류: 논리형을 정수형으로 형변환 할 수 없다.


        // 실수형
        double dNum = 3.14d;    // d, D를 추가하여 명시적으로 표기 가능하다.
        float fNum = 3.14f; // float 형은 f, F를 추가하여 명시적으로 표기해야한다.

        print(dNum);
        print(fNum);
        print(0.1 + 0.2);    // 0과 1로 소수점 아래의 숫자를 정확하게 표현할 수 없기 때문에 연산 결과에 오차가 생긴다
        print((0.1 + 0.15) == 0.25);
        print((0.1 + 0.2) == 0.3);
        // 컴퓨터의 2진수와 현실의 10진수 각 표현방식의 차이로 인해 표현 가능한 값에 차이가 생기기 때문


        // 참조자료형 맛보기
        String s1 = "Hello";

        print(s1);
    }

    public static void print(int a) {
        System.out.println("정수형 값을 출력합니다: " + a);
    }

    public static void print(boolean a) {
        System.out.println("논리형 값을 출력합니다: " + a);
    }

    public static void print(double a) {
        System.out.println("실수형 값을 출력합니다: " + a);
    }

    public static void print(String a) {
        System.out.println("문자열 값을 출력합니다: " + a);
    }

    public static void print(char a) {
        System.out.println("문자을 출력합니다: " + a);
    }

}
