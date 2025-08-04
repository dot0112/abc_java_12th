package day9.encapsulation;

public class PhoneStore {
    private Phone phone;

    public PhoneStore(Phone phone) {
        this.phone = phone;
    }

    // 대리점이 휴대폰을 파는 동작/메서드
    public Phone sellPhone() {
        registerPayment();
        discountPromotion();
        // 대리점이 휴대폰을 판매할 때 일어나는 일
        System.out.println("대리점 : 휴대폰 전달");
        return phone;
    }

    private void registerPayment() {
        System.out.println("대리점 : 요금제를 등록합니다. 약정을 등록합니다.");
    }

    private void discountPromotion() {
        System.out.println("대리점 : 이벤트로 할인이 적용됩니다.");
    }

    public Phone getPhone() {
        return phone;
    }
}

