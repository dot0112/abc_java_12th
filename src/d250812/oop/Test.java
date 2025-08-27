package d250812.oop;

import javax.swing.*;

public class Test extends JFrame {
    int num;
    String name;

    /*
     * final 키워드
     * 변수: 값 변경 금지
     * 메서드: 오버라이딩 금지
     * 클래스: 상속 금지
     * */

    public void output() {
        System.out.println(
                "num: " + num + ", name: " + name
        );
    }
}
