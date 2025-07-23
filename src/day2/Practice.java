package day2;

public class Practice {
    public static void main(String[] args) {

        // 1. '희'라는 한글 글자의 유니코드 정수값을 찾아서 적절한 변수에 저장한 뒤 변수를 출력하여 확인하세요
        int iUniData = '희';
        System.out.println("\n1. '희'라는 한글 글자의 유니코드 정수값을 찾아서 적절한 변수에 저장한 뒤 변수를 출력하여 확인하세요");
        System.out.println("'희'의 Unicode 값: 0d" + iUniData);
        System.out.println("'희'의 Unicode 값: 0x" + Integer.toHexString(iUniData).toUpperCase());
        System.out.println("출력 결과: " + (char) iUniData);


        // 2. 본인 이름을 적잘한 자료형의 변수이름에 담아 출력해보세요
        String stName = "김형근";
        System.out.println("\n2. 본인 이름을 적잘한 자료형의 변수이름에 담아 출력해보세요");
        System.out.println("이름: " + stName);


        // 3. 출생연도를 저장하는 변수를 만들어 선언과 동시에 초기화하고 출력해보세요
        int iBirthYear = 2001;
        System.out.println("\n3. 출생연도를 저장하는 변수를 만들어 선언과 동시에 초기화하고 출력해보세요");
        System.out.println("출생연도: " + iBirthYear);


        // 4. byte 타입의 변수 두 개에 10 과 20 을 저장하고 byte 타입의 새 변수에 두 값을 합한 결과를 저장하고 출력해보세요
        byte bA = 10, bB = 20;
        byte bC = (byte) (bA + bB);
        System.out.println("\n4. byte 타입의 변수 두 개에 10 과 20 을 저장하고 byte 타입의 새 변수에 두 값을 합한 결과를 저장하고 출력해보세요");
        System.out.println("새로 저장한 변수의 값: " + bC);


        // 5. 태블릿 소지 여부를 변수에 저장하고 출력해보세요
        boolean hasTablet = false;
        System.out.println("\n5. 태블릿 소지 여부를 변수에 저장하고 출력해보세요");
        System.out.println("태블릿 소지 여부: " + hasTablet);
    }
}
