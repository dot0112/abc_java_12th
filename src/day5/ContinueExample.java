package day5;

public class ContinueExample {
    public static void main(String[] args) {
        int sum, i;
        for (i = 0, sum = 0; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.printf("건너뛰었을 때 i값: %d\n", i);
                continue;
            }
            System.out.printf("누산한 i값: %d\n", i);
            sum += i;
        }
        System.out.printf("반복문을 나온 시점에 i의 값은 %d 이고 sum은 %d 입니다.", i, sum);
    }
}