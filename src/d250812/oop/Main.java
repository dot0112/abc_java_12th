package d250812.oop;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        Test t2 = new Test();
        t.num = 1;
        t.name = "김";
        t.output();
        t.setTitle("창 제목");
        t.setBounds(100, 100, 300, 300);
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JFrame a = new Test();
        ((Test) a).name = "a";
        ((Test) a).output();

    }
}
