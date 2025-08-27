package d250812;

import java.io.IOException;
import java.util.Scanner;

public class WhileTest1 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int n = -1, sum = 0;
//        while (n != 0) {
//            try {
//                System.out.print("정수 입력: ");
//                n = s.nextInt();
//                sum += n;
//            } catch (Exception e) {
//                System.out.println(e);
//                s.nextLine();
//            }
//        }

        do {
            try {
                System.out.print("정수 입력: ");
                n = s.nextInt();
                sum += n;
            } catch (Exception e) {
                System.out.println(e);
                s.nextLine();
            }
        } while (n != 0);

        System.out.println("합계: " + sum);

        s.close();
    }
}
