package day2;

public class TypeConversion {

    /*
        묵시적 형변환 (Implicit Conversion)
        + 바이트 크기가 작은 자료형에서 큰 자료형으로 자동(묵시적)으로 이루어진다.
        + 정밀하지 않은 자료형에서 더 정밀한 자료형으로 자동으로 이루어진다.

        명시적 형변환 (Explicit Conversion)
        + 형변환 시 데이터의 손실이 발생할 수 있다.
    */

    public static void main(String[] args) {
        // 묵시적 형변환
        byte bNum = 10;
        int iNum = bNum; // byte(1 byte)에서 int(4 byte)로 묵시적 형변환
        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;
        float fNum = iNum2; // int 에서 float 로 묵시적 형변환
        System.out.println(iNum2);
        System.out.println(fNum);

        double dNum;
        dNum = fNum + iNum; // int 에서 float로, float 에서 double 로 묵시적 형변환
        System.out.println(dNum);


        // 명시적 형변환
        int num1 = 1000;
        byte num2 = (byte) num1;    // 크기가 큰 자료형에서 표현 범위를 벗어나는 데이터를 작은 자료형으로 대입해서 데이터 손실이 발생함 (오버플로우)
        System.out.println(num2);

        int num3 = 10;
        byte num4 = (byte) num3;
        System.out.println(num4);

        double dNumPI = 3.14;
        int iNum1 = (int) dNumPI;   // 실수가 정수로 형변환 되면서 버림이 발생 - 데이터 손실
        System.out.println(iNum1);

        double dNum1 = 1.2;
        float fNum2 = 0.9f;
        int iNum3 = (int) dNum1 + (int) fNum2;  // 1 + 0 - 두 실수가 먼저 형변환되고, 결과를 합함
        int iNum4 = (int) (dNum1 + fNum2);      // 1.2 + 0.9 - 두 실수가 먼저 더해지고, 결과를 형변환함
        System.out.println(iNum3);
        System.out.println(iNum4);
        // 형변환과 계산의 순서에 의해 결과값이 다를 수 있다
    }
}
