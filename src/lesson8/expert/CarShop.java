package lesson8.expert;

public class CarShop implements Sell {
    private Car car;

    public CarShop(Car car) {
        this.car = car;
    }

    public void getPrice() {
        System.out.println("Здравствуй клиент, цена этого авто");
        try {
            car.getPrice();
            System.out.println("Хочешь купить авто?");
        } catch (PriceException e) {
            System.out.println("Неизвестна мне\n" +
                    "Давайте посмотрим другое авто?");
        }
    }
}
