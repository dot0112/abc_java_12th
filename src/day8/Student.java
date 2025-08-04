package day8;

public class Student {
    /*
    객체란? 현실세계의 사물이나 개념을 프로그래밍적으로 표현한 것 또는 그 표현을 코드로 구현해 생성된 실체(인스턴스)
    필드, 멤버변수: 객체의 상태 (객체가 아는 것)
    메서드: 객체의 동작, 기능
    */
    public String name;
    String phone;
    int math, eng, kor;

    void goSchool() {
        System.out.println("학교에 갑니다");
    }
}
