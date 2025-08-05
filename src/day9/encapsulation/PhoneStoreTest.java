package day9.encapsulation;

public class PhoneStoreTest {
    public static void main(String[] args) {
        Phone[] phones = {
                new Phone("아이폰", 1000000),
                new Phone("갤폴드7", 2370000),
                new Phone("갤S25", 1100000)
        };

        PhoneStore phoneStore = new PhoneStore(phones);

        Customer customer = new Customer("김형근", 1100000, "갤S25");

        customer.buyPhone(phoneStore);
    }
}
