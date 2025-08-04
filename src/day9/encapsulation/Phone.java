package day9.encapsulation;

public class Phone {
    private String model;
    private double price;

    Phone(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }
}
