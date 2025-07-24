package day4.ifExample;

public class IfExample01 {

    /*
    조건문
    if (조건식1) {
        조건식1이 참을 반환할 때 실행할 수행문;
    } else if(조건식2) {
        조건식2이 참을 반환할 때 실행할 수행문;
    } else {
        어느 조건식도 참이 아닐때 실행할 수행문;
    }
    # 조건식은 논리값을 반환하여야 한다.
    -> Java 에서 조건식은 반드시 논리형(boolean)의 데이터를 반환하는 식이어야 한다. (0, 1 등 사용 불가, 타입 평가에서 boolean만 가능)
    수행문은 중괄호로 묶어서 나타내며, 중괄호로 묶은 부분은 블록이라고 한다.
    */

    public static void main(String[] args) {
        String name = "철수";
        int age = 9;
        if (age >= 8) { // true 또는 false 가능, 1 또는 0 등 다른 데이터 타입은 불가
            System.out.println(name + "은(는) 학교에 다닙니다");
        } else {
            System.out.println(name + "은(는) 학교에 다니지 않습니다");
        }
    }
}
