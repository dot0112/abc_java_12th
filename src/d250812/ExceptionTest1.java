package d250812;

import java.util.InputMismatchException;
import java.util.Scanner;


/*
런타임 오류 말고는 처리 되어야 함
런타임은 선택적
*/
public class ExceptionTest1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a, b, c;

        try {
            System.out.print("정수 입력: ");
            a = s.nextInt();
            System.out.print("정수 입력: ");
            b = s.nextInt();
            c = a / b;
            System.out.println(c);
        } catch (InputMismatchException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("always");
        }

        s.close();
    }
}
