package day5;

public class DoWhileExample {

    /*
    2. do-while 문
    do {
        실행문;
    } while(조건식);
    실행문을 실행한 뒤 조건을 확인
    최초 1회 실행을 상정함으로 while 뒤 세미콜론(;)이 필요
    */

    public static void main(String[] args) {
        int num = 1, sum = 0;
        do {
            sum += num++;
        } while (num <= 10);
        System.out.println("1 부터 10 까지의 합은 " + sum + " 입니다");
    }
}
