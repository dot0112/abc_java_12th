package lessonCode.array;

public class Main2 {
    public static void main(String[] args) {
        Test[] arrayVar1 = new Test[3]; // 길이가 3인 array.Test 객체의 배열을 생성
        Test[] arrayVar2 = {new Test(), new Test(2), new Test(3)}; // 배열 선언과 함께 초기화

        System.out.println(arrayVar1);
        System.out.println(arrayVar2);

    }
}
