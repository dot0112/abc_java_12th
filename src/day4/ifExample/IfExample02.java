package day4.ifExample;

public class IfExample02 {

    /*
    if (조건식1) {
        조건식1이 참을 반환할 때 실행할 수행문;
    } else if(조건식2) {
        조건식2가 참을 반환할 때 실행할 수행문;
    } else {
        어느 조건식도 참이 아닐때 실행할 수행문;
    }
    */

    public static void main(String[] args) {
        int age = 7, charge;
        if (age < 8) {
            charge = 1000;
            System.out.println("미취학 아동입니다");
        } else if (age < 14) {
            charge = 2000;
            System.out.println("초등학생입니다");
        } else if (age < 20) {
            charge = 2500;
            System.out.println("중,고등학생입니다");
        } else {
            charge = 3000;
            System.out.println("성인입니다");
        }
        System.out.printf("입장료는 %d원 입니다\n", charge);


        int a = 9, b = 32, max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        max = (a > b) ? a : b;
    }
}
