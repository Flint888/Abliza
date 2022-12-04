package lesson6.homework.advance.task1;

import lesson6.homework.advance.task1.plant.Fern;
import lesson6.homework.advance.task1.plant.Rose;
import lesson6.homework.advance.task1.tree.Fir;
import lesson6.homework.advance.task1.tree.Pine;

public class Runner {
    public static void main(String[] args) {
        Fir fir = new Fir();
        Pine pine = new Pine();
        Rose rose = new Rose();
        Fern fern = new Fern();
        Smellable[] smellables = {fir, pine, rose};
        Bloomable[] bloomables = {rose, fern};
        for (Smellable smellable : smellables) {
            smellable.smell();
        }

        for (Bloomable bloomable : bloomables) {
            bloomable.bloom();
        }


    }
}
