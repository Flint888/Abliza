package lesson8.expert;

public class Car implements Sell {
    private double price;

    public Car(double price) {
        this.price = price;
    }

    public void getPrice() throws PriceException {
        if (price < 0) {
            throw new PriceException("Цена меньше нуля");
        }
        System.out.println(price);
    }
}
