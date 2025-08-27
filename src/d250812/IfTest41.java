package d250812;

import java.io.IOException;
import java.util.Scanner;

public class IfTest41 {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        if (n == 0) System.out.println("0 입니다.");
        else if (n > 0) System.out.println("양수 입니다.");
        else System.out.println("음수 입니다.");

        s.close();
    }
}
