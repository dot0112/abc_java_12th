package day1;

public class Variable {
    public static void main(String[] argv){
        // 변수란? 값을 담는 상자
        // 값이란? 메모리에 저장된 데이터 조각

        int num;        // 정수형 변수 num 선언
        num = 100;      // num 변수에 값 100을 대입, 할당
        System.out.println(num);    // num 상자에 들어있는 데이터를 출력

        int num2 = 200; // 변수 선언과 동시에 값을 대입함
        System.out.println(num2);

        // 변수를 준비해서 처음으로 값을 넣는 것 -> 변수 초기화

        num = 300;      // num 변수에 값 300을 대입, 할당
        System.out.println(num);    // num 상자에 들어있는 데이터를 출력

//        int $_varia%ble = 100;    // 불가능한 기호 '%'
//        int 345var = 345;         // 변수 이름은 숫자로 시작할 수 없음
//        int int = 1000;           // 예약어는 변수 이름으로 사용 불가 (int, void, char, static, public 등)

        int $_variable = 100;
        System.out.println($_variable);
        /*
        변수 이름 규칙
         1. 영문자나 숫자를 사용, 특수문자는 $와 _만 사용가능
         2. 숫자로 시작할 수 없다.
         3. 예약어를 사용할 수 없다.
         */
    }
}
