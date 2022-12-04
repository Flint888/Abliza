package lesson6.homework.base.task1;

public class Factory {
    public static void main(String[] args) {
        Computer computer = new Computer();
    }

    public static void doWork(Electronic electronic) {
        electronic.work();
    }
}
