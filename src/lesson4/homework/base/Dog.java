package lesson4.homework.base;

public class Dog {
    private boolean isAngry;
    private int countLegs;

    public Dog(boolean isAngry, int countLegs) {
        this.isAngry = isAngry;
        this.countLegs = countLegs;
    }

    public boolean isAngry() {
        return isAngry;
    }

    public void setAngry(boolean angry) {
        isAngry = angry;
    }

    public int getCountLegs() {
        return countLegs;
    }

    public void setCountLegs(int countLegs) {
        this.countLegs = countLegs;
    }
}
