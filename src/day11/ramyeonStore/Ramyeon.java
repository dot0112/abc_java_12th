package day11.ramyeonStore;

public class Ramyeon {
    static int num;
    int price, orderNum;
    String menuName;

    public Ramyeon(int price, String menuName) {
        orderNum = num;
        this.price = price;
        this.menuName = menuName;
    }

    void cook() {
        
    }

    void boil() {
        System.out.println("물을 끓입니다");
    }

    void addSoup() {
        System.out.println("스프를 넣습니다");
    }

    void addMyeon() {
        System.out.println("면을 넣습니다.");
    }
}
