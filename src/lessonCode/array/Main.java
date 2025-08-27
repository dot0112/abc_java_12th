package lessonCode.array;

public class Main {
    public static void main(String[] args) {
        // 단일 객체 생성
        Test singleVar1 = new Test();
        Test singleVar2 = new Test(10);
        Test singleVar3;

        // Q1-1
        System.out.println(singleVar1.getIntVal());

        // Q1-2
        System.out.println(singleVar2);

        singleVar3 = singleVar1;
        singleVar3.setIntVal(100);

        // Q1-3
        System.out.println(singleVar3.toString());


        // 클래스 배열 생성
        Test[] arrayVar1 = new Test[3]; // 길이가 3인 array.Test 객체의 배열을 생성
        Test[] arrayVar2 = {new Test(), new Test(2), new Test(3)}; // 배열 선언과 함께 초기화


        // Q2-1
        for (Test object : arrayVar1) {
            System.out.print((object == null ? "0" : "1") + " ");
        }
        System.out.println();

        // Q2-2
        for (Test object : arrayVar2) {
            System.out.print((object == null ? "0" : "1") + " ");
        }
        System.out.println();

        // Q2-3
        try {
            System.out.println(arrayVar1[0].getIntVal());
        } catch (NullPointerException npe) {
            System.out.println("오류 발생: " + npe);
        }

        int[] intAry1 = new int[3];
        int[] intAry2 = {1, 2, 3};

        System.out.println(intAry1);
        System.out.println(intAry2);

        for (int i = 0; i < 3; i++) {
            arrayVar1[i] = new Test(intAry1[i]);
            arrayVar2[i] = new Test(intAry2[i]);
        }

        // Q3-1
        for (Test object : arrayVar1) {
            System.out.print(object + " ");
        }
        System.out.println();

        // Q3-2
        for (Test object : arrayVar2) {
            System.out.print(object + " ");
        }
        System.out.println();

        // arrayVar1 = {new Test(), new Test(), new Test()} -- 불가능
        arrayVar1 = new Test[]{new Test(), new Test(), new Test()}; // -- 가능


        int[] arr1 = new int[1];
        double[] arr2 = new double[1];
        boolean[] arr3 = new boolean[1];
        char[] arr4 = new char[1];

        System.out.println("arr1: " + arr1[0]);
        System.out.println("arr2: " + arr2[0]);
        System.out.println("arr3: " + arr3[0]);
        System.out.println("arr4: " + arr4[0]);
    }
}