package day6;

public class LoopPractice {

    /*
    [출력 1]
    1 2 3 4 5 6 7 8 9 10
    [출력 2]
    0 2 4 6 8 10
    [출력 3]
    1 3 5 7 9
    [출력 4]
    10 9 8 7 6 5 4 3 2 1
    [출력 5]
    10 20 30 40 50
    [출력 6]
    2 4 8 16 32
    [출력 7]
    1 10 10 1000 10000
    */

    public static void main(String[] args) {
        int i, res;

        System.out.println();
        System.out.println("[출력 1]");
        for (i = 1; i <= 10; i++) System.out.printf("%d ", i);
        System.out.println();

        System.out.println("[출력 2]");
        for (i = 0; i <= 10; i++) if (i % 2 == 0) System.out.printf("%d ", i);
        System.out.println();

        System.out.println("[출력 3]");
        for (i = 0; i <= 10; i++) if (i % 2 == 1) System.out.printf("%d ", i);
        System.out.println();

        System.out.println("[출력 4]");
        for (i = 10; i >= 1; i--) System.out.printf("%d ", i);
        System.out.println();

        System.out.println("[출력 5]");
        for (i = 1; i <= 5; i += 1) System.out.printf("%d ", i * 10);
        System.out.println();

        System.out.println("[출력 6]");
        for (i = 0, res = 2; i < 5; i += 1, res *= 2) System.out.printf("%d ", res);
        System.out.println();

        System.out.println("[출력 7]");
        for (i = 0, res = 1; i < 5; i += 1, res *= 10) System.out.printf("%d ", res);
        System.out.println();
    }
}
