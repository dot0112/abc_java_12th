package ps.bronze;

import java.util.Scanner;

public class p10869 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt(), b = s.nextInt();

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        s.close();
    }
}
