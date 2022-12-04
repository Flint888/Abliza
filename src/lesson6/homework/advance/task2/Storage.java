package lesson6.homework.advance.task2;

public class Storage {
    private int countVodka = 0;

    public Storage() {
    }

    public Storage(int countVodka) {
        this.countVodka = countVodka;
    }

    public int getCountVodka() {
        return countVodka;
    }

    public void setCountVodka(int countVodka) {
        this.countVodka = countVodka;
    }

    public void takeProduct() {
        this.countVodka--;
    }
}
