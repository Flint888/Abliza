package lesson6.homework.advance.task1.plant;

import lesson6.homework.advance.task1.Bloomable;

public class Fern extends Plant implements Bloomable {
    @Override
    public void bloom() {
        System.out.println("Папоротник цветет");
    }
}
