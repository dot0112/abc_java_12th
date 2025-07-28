package day5;

public class ForPractice {
    
    /*
    1~@까지의 합이 100 이상일때 @와 100 이상이 된 누산값을 출력하세요
    */

    public static void main(String[] args) {
        int i, sum;
        for (i = 0, sum = 0; sum < 100; sum += ++i) ;
        System.out.printf("@: %d\n누산합: %d", i, sum);
    }
}