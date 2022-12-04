package lesson6.homework.advance.task1.plant;

import lesson6.homework.advance.task1.Bloomable;
import lesson6.homework.advance.task1.Smellable;

public class Rose extends Plant implements Smellable, Bloomable {
    @Override
    public void bloom() {
        System.out.println("Роза цветет");
    }

    @Override
    public void smell() {
        System.out.println("Роза пахнет");
    }
}
