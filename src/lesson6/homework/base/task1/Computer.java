package lesson6.homework.base.task1;

public class Computer extends Electronic {

    public void loadSystem() {
        System.out.println("загрузка системы");
    }

    @Override
    public void work() {
        System.out.println("выполняет вычисления");
    }
}
