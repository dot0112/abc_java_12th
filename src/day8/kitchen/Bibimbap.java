package day8.kitchen;

public class Bibimbap {
    String[] namuls;
    boolean isCooked = false;

    Bibimbap(String[] namuls) {
        this.namuls = namuls;
    }

    void boilingWater() {
        System.out.println("물을 끓입니다");
    }

    void cookRice() {
        System.out.println("밥을 안칩니다");
    }

    void blanchNamuls() {
        for (String namul : namuls) {
            System.out.println(namul + "을 물에 데칩니다");
        }
    }

    void plating() {
        System.out.println("그룻에 배치합니다.");
    }

    void cook() {
        cookRice();
        boilingWater();
        blanchNamuls();
        plating();
        isCooked = true;
        System.out.println("비빔밥이 완성되었습니다!");
    }
}
