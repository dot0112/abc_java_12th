package day9.encapsulation;

public class Customer {
    private String name;
    private double budget;

    public Customer(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    public void buyPhone(PhoneStore phoneStore) {
        phoneStore.sellPhone();
        // 고객이 휴대폰을 살 때 일어나는 일

        // 대리점이 휴대폰을 팔 수 있냐 없냐를 구분하는 분기

        // 구입했을 때 출력문

        // 구입하지 못했을 때 출력문
        System.out.println("고객: 핸드폰 구입이 완료되었습니다.");
    }
}
