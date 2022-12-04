package lesson6.homework.advance.task2;

public class Worker {
    private int countBrokenVodka = 0;

    public Worker() {
    }

    public Worker(int countBrokenVodka) {
        this.countBrokenVodka = countBrokenVodka;
    }

    public int getCountBrokenVodka() {
        return countBrokenVodka;
    }

    public void setCountBrokenVodka(int countBrokenVodka) {
        this.countBrokenVodka = countBrokenVodka;
    }

    public void takeVodka(Storage storage) {
        storage.takeProduct();
        System.out.println("Ура я испортил водку!");
        countBrokenVodka++;
    }

    public void printJournal() {
        System.out.println(countBrokenVodka);
    }
}
