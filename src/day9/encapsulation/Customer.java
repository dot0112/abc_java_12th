package day9.encapsulation;

public class Customer {
    private String name;
    private double budget;


    private String preferModel;

    public Customer(String name, double budget, String preferModel) {
        this.name = name;
        this.budget = budget;
        this.preferModel = preferModel;
    }

    public String getName() {
        return name;
    }

    public double getBudget() {
        return budget;
    }

    public String getPreferModel() {
        return preferModel;
    }

    /**
     * 고객이 휴대폰을 사는 동작 </br>
     * 대리점 객체가 휴대폰을 파는 메서드를 호출 </br>
     *
     * @param phoneStore 대리점
     */
    public void buyPhone(PhoneStore phoneStore) {
        Phone phone = phoneStore.sellPhone(this);

        if (phone != null)
            System.out.println("고객: 핸드폰 " + phone.getModel() + " 구입이 완료되었습니다.");
        else
            System.out.println("고객: 핸드폰 " + preferModel + "을 구입하지 못했습니다.");
    }


}

