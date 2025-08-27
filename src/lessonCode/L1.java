package lessonCode;

public class L1 {
    public static void main(String[] args) {
        System.out.println(testIntFunction());
        System.out.println(testIntFunction() == 1);
        

    }

    public static int testIntFunction() {
        System.out.println("testIntFunction() 실행");
        return 1;
    }

    public static TestClass testTestClassFunction() {
        System.out.println("testTestClassFunction() 실행");
        return new TestClass();
    }
}
