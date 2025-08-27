package d250811;

public class TypeTest1 {
    public static void main(String[] args) {
        char ch = '\u0041';
        String s = "abc\ndef\tghi";
        byte b = 127;
        b++;
        int i = 0xff;
        long lo = 10000000000L; // 상수도 int로 처리하기 때문에 범위를 넘어갔기에 오류가 발생, 명시 표기 필요

        System.out.println(ch);
        System.out.println(s);
        System.out.println(b);
        System.out.println(i);
        System.out.println(lo);
    }
}
