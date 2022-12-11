package lesson8.base;

public class Runner {
    public static void main(String[] args) {
        Duck duck = new Duck(false);
        Duck duckInjured = new Duck(true);

        Airplane airplane = new Airplane(10);
        Airplane airplaneWithNoPassengers = new Airplane(-1);
        Flyable[] flyables = {duck, duckInjured, airplane, airplaneWithNoPassengers};

        for (Flyable flyable : flyables) {
            try {
                flyable.fly();
            } catch (FlyException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
