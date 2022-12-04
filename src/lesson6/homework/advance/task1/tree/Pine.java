package lesson6.homework.advance.task1.tree;

import lesson6.homework.advance.task1.Smellable;

public class Pine extends Tree implements Smellable {
    @Override
    public void smell() {
        System.out.println("Сосна пахнет");
    }
}
