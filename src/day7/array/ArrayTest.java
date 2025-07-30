package day7.array;

public class ArrayTest {

    /*
    배열? 같은 자료형을 가진 자료 여러 개를 묶어서 관리
    */

    public static void main(String[] args) {
        int[] nums = {1, 2, 3},
                numbers = {1, 2, 3, 4, 5, 6, 7, 8}, // 배열 선언과 초기화
                nums1 = new int[3]; // 배열 생성과 초기화

        int[] numsErr;
        // numsErr = {1,2,3}; - 불가능한 문법, 이 초기화 방식은 변수 생성과 같이 사용해야 함
        // numsErr[0] = 1; - 불가능한 문법, 배열의 크기를 설정하지 않은 상태에서 대입하려고 함

        int[] numsOK;
        numsOK = new int[3];
        numsOK[0] = 1;
        numsOK[1] = 2;
        numsOK[2] = 3;

        System.out.println(numsOK[0]);

        for (int i = 0; i < numsOK.length; i++) System.out.print(numsOK[i] + " ");
        System.out.println();

        for (int v : numsOK) System.out.print(v + " ");
        System.out.println();
    }
}
