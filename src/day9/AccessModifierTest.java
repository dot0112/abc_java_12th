package day9;

import day8.kitchen.Ramen;

public class AccessModifierTest {
    /*
    접근 제어자
    + public
        - 외부 클래스 어디에서나 접근 가능
    + protected
        - 같은 패키지 내부와 상속 관계인 클래스에서만 접근 가능
    + default(공란) :
        - 접근제어자를 명시하지 않은 상태도 해당
        - 같은 패키지 내부에서만 접근 가능
    + private
        - 같은 클래스 내부에서만 접근할 수 있다.
    */

    public static void main(String[] args) {
        Ramen ramen = new Ramen("너구리", "가루스프");
        ramen.cook();
        printStatus(ramen);
    }

    public static void printStatus(Ramen ramen) {
        boolean flag = ramen.isCooked();
        System.out.print("새로 생성된 라면 인스턴스 " + ramen.getNoodleType() + "는 조리");
        if (flag) {
            System.out.println("된 상태입니다.");
        } else {
            System.out.println("되지 않았습니다.");
        }
    }
}
