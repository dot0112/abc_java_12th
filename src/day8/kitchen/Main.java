package day8.kitchen;

public class Main {

    /*
    라면이라는 추상적 개념 -> 클래스
    인스턴스는 그 실체인 라면봉지

    클래스를 통해 생성된 실체를 인스턴스라고 부름
    인스턴스가 생성되면
    변수에 인스턴스를 담는다치고 변수 이름은 스택에 저장됨
    그 실체(객체, 인스턴스)는 힙 메모리에 저장이 됨
    변수에 담긴 값은 리모컨, 리모컨이 객체(인스턴스)를 가리켜 정보나 행동을 가져옴
    */

    public static void main(String[] args) {
        // 인스턴스 = 실제 요리
        Ramen spicyRamen = new Ramen("매운라면", "가루스프");

        Ramen mildRamen = new Ramen("안매운라면", "액상스프");

        spicyRamen = mildRamen;

        // 조리 시작
        spicyRamen.cook();
        System.out.println(spicyRamen.getClass());
        System.out.println(spicyRamen);

        System.out.println();

        Bibimbap bibimbap = new Bibimbap(new String[]{"당근", "표고", "콩나물", "고사리"});
        bibimbap.cook();
        System.out.println(bibimbap.isCooked);
        System.out.println(bibimbap);

    }
}
