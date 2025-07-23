package day3;

public class StrFormatting {

    /*
    문자열 포맷팅
    System.out.printf("서식", 데이터);
    --- 서식 지정자 ---
    %d          : 10진 정수
    %o          : 8진 정수
    %x / %X     : 16진 정수 (소문자/대문자)
    %f          : 실수
    %s          : 문자열
    %c          : 문자
    %n          : 줄바꿈
    */

    public static void main(String[] args) {
        double d = 123.45678;
        int n = 1000;
        String name = "홍길동";

        System.out.printf("%n이름은 %s입니다.%n", name);
        System.out.printf("이름은 %5s입니다.%n", name);   // 문장의 출력 크기를 최소 5칸으로 설정, 오른쪽 정렬
        System.out.printf("이름은 %-5s입니다.%n", name);  // 문장의 출력 크기를 최소 5칸으로 설정, 왼쪽 정렬

        System.out.printf("%n기본 %d%n", n);
        System.out.printf("오른쪽 정렬 출력\t|%10d|%n", n);    // 정수의 출력 크기를 최소 10칸으로 설정, 오른쪽 정렬
        System.out.printf("왼쪽 정렬 출력\t|%-10d|%n", n);    // 정수의 출력 크기를 최소 10칸으로 설정, 왼쪽 정렬
        System.out.printf("0 채움 출력\t\t|%010d|%n", n);     // 정수의 출력 크기를 최소 10칸으로 설정, 빈 공간을 0으로 출력 - 왼쪽 정렬은 불가능

        System.out.printf("%n기본 %f%n", d);
        System.out.printf("소수부 길이 조절 %.2f%n", d);   // 소수부의 둘째 짜리까지 출력으로 설정
        System.out.printf("출력 크기 조절\t|%10.2f|%n", d);   // 소수부의 둘째 짜리까지 출력으로 설정, 최소 10칸으로 설정
        System.out.printf("정렬 방향 조절\t|%-10.2f|%n", d);   // 소수부의 둘째 짜리까지 출력으로 설정, 최소 10칸으로 설정, 왼쪽 정렬
        System.out.printf("0 채움 출력\t\t|%010.2f|%n", d);   // 소수부의 둘째 짜리까지 출력으로 설정, 최소 10칸으로 설정, 빈 공간을 0으로 출력


        int age = 20;
        String myName = "서희연";
        System.out.printf("%n이름: %s, 나이: %d%n", myName, age);
    }
}
