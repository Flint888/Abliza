package lesson6.homework.advance.task2;

public class Runner {
    public static void main(String[] args) {
        Storage storage = new Storage(10);
        Worker worker1 = new Worker();
        Worker worker2 = new Worker();
        Worker worker3 = new Worker();

        worker1.takeVodka(storage);
        worker1.takeVodka(storage);
        worker2.takeVodka(storage);
        worker2.takeVodka(storage);
        worker2.takeVodka(storage);
        worker3.takeVodka(storage);
        System.out.println("__________________");

        worker1.printJournal();
        worker2.printJournal();
        worker3.printJournal();
    }
}
