package d250812;

import java.util.Scanner;

public class ForTest1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("정수 입력: ");
        n = s.nextInt();

        // 1 ~ n까지 출력
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        s.close();
    }
}
