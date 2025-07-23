package day3;

// 1. Scanner 를 사용하기 위해서 java.util.Scanner를 import 한다

import java.util.Scanner;

public class ScannerSample {
    public static void main(String[] args) {
        // 2. Scanner 객체를 생성한다
        Scanner s = new Scanner(System.in); // 표준 입력(System.in)을 사용하는 Scanner 객체를 생성

        // 3. Scanner 객체를 사용하여 사용자의 입력을 받는다
        System.out.print("\n이름을 입력해주세요: ");
        String name = s.next();
        System.out.println("입력된 이름: " + name);

        System.out.print("\n숫자를 입력해주세요 (a): ");
        int a = s.nextInt();

        System.out.println("입력한 숫자 (a): " + a);

        System.out.print("\n공백으로 나눠진 숫자를 2개 입력해주세요 (b c): ");
        int b = s.nextInt(), c = s.nextInt(), result = a + b + c;
        System.out.println("입력받은 값의 합계 (a + b + c): " + result);

        System.out.print("\n변경하실 이름을 입력해주세요: ");
        s.nextLine();   // 버퍼에 남아있는 개행 문자(\n)를 제거하기 위함
        String newName = s.nextLine();  // 버퍼에서 다음 개행 문자(\n)까지의 문자를 읽음
        System.out.println("변경된 이름: " + newName);

        s.close();  // 리소스 해제
    }
}
