package day9.encapsulation;

public class PhoneStore {
    private Phone[] phones;

    public PhoneStore(Phone[] phones) {
        this.phones = new Phone[phones.length];
        System.arraycopy(phones, 0, this.phones, 0, phones.length);
    }

    /**
     * 대리점이 휴대폰을 파는 동작/메서드 <br>
     * - 요금제를 등록하고  registerPayment <br>
     * - 할인을 적용한 뒤  discountPromotion <br>
     * - 휴대폰을 전달    return
     *
     * @param customer 휴대폰을 구입하려 하는 고객 객체
     * @return Phone 객체
     */

    public Phone sellPhone(Customer customer) {
        Phone phone = getPhone(customer.getPreferModel());
        String errMsg = checkValid(phone, customer.getBudget());
        if (errMsg == null) {
            registerPayment();
            discountPromotion();
            System.out.println("대리점 : 휴대폰 전달");
            return phone;
        } else {
            System.out.println(errMsg);
            return null;
        }
    }

    private Phone getPhone(String model) {
        for (Phone phone : phones) {
            if (phone.getModel().equals(model)) return phone;
        }
        return null;
    }

    private String checkValid(Phone phone, double budget) {
        String errMsg = null;
        if (phone == null) errMsg = "고객이 원하는 기종을 취급하지 않습니다.";
        else if (budget < phone.getPrice()) errMsg = "고객의 예산 범위를 초과합니다.";
        return errMsg;
    }

    private void registerPayment() {
        System.out.println("대리점 : 요금제를 등록합니다. 약정을 등록합니다.");
    }

    private void discountPromotion() {
        System.out.println("대리점 : 이벤트로 할인이 적용됩니다.");
    }

    public Phone[] getPhones() {
        return phones;
    }
}

