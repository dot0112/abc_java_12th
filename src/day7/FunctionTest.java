package day7;

public class FunctionTest {

    /*
    method : function
    함수? 하나의 기능을 수행하는 코드 덩어리
    한 작업을 여러 번 반복한다면 함수로 만들어두고 필요할 때마다 호출해서 쓸 수 있다

    전달할 때 전달 받을 때는 메서드 선언할 때 지정된 대로 타입, 순서를 맞추어야 한다

    * 함수의 오버로딩
    같은 이름의 메서드를 여러 개 정의하되,
    매개변수의 갯수나 타입을 다르게 정의하여 사용하는 기능
    - 메서드 이름은 같아야 한다
    - 매개변수의 개수 또는 타입이 달라야 한다
    - 반환 타입은 오버로딩에 영향을 주지 않는다 (반환 타입만으로는 함수 구분 불가능)

    [함수 분리의 장점]
    - 기능 별 분리를 통한 가독성 향상
    - 재사용성 증가, 중복코드 제거
    - 유지보수 용이성
    - 테스트 용이성
    - 의도 명확화
    */

    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        System.out.println(addNum(num1, num2));
    }


    /**
     * 정수형 매개변수 두 개를 더한 결과를 반환하는 메서드입니다.
     *
     * @param a 첫 번째 매개변수
     * @param b 두 번째 매개변수
     * @return 두 매개변수를 더한 값
     */
    public static int addNum(int a, int b) {
        return a + b;
    }
}
