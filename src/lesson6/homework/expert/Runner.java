package lesson6.homework.expert;

public class Runner {
    public static void main(String[] args) {
        Human petr = Human.builder().age(18).name("Petr").weight(80).build();
        petr.getInfo();
    }
}
