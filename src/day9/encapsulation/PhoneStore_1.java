package day9.encapsulation;

public class PhoneStore_1 {
    private Phone phone;

    public PhoneStore_1(Phone phone) {
        this.phone = phone;
    }

    /**
     * 대리점이 휴대폰을 파는 동작/메서드
     * - 요금제를 등록하고  registerPayment
     * - 할인을 적용한 뒤  discountPromotion
     * - 휴대폰을 전달    return
     * TODO: 모델명과 예산을 파라미터로 받아서 구입가능여부를 확인 후 반환값을 전달
     *
     * @param model
     * @param budget
     * @return Phone 객체
     */
    public Phone sellPhone(String model, double budget) {
        boolean f = true;
        if (!model.equals(phone.getModel())) {
            System.out.println("고객이 원하는 기종과 취급하는 기종이 다릅니다.");
            f = false;
        }
        if (budget < phone.getPrice()) {
            System.out.println("고객의 예산 범위를 초과합니다.");
            f = false;
        }
        if (f) {
            registerPayment();
            discountPromotion();
            System.out.println("대리점 : 휴대폰 전달");
        }
        return f ? phone : null;
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

