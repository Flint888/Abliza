package lesson6.homework.advance.task1.tree;

import lesson6.homework.advance.task1.Smellable;

public class Fir extends Tree implements Smellable {

    @Override
    public void smell() {
        System.out.println("Ель пахнет");
    }
}
