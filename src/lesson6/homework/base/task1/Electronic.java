package lesson6.homework.base.task1;

// 1. Electronic (имеет метод on и off - включает/выключает электрический прибор,
// подумать, какой нужен атрибут для этого метода, имеет метод без реализации - work)
public abstract class Electronic {
    private boolean isOn = false;

    public void on() {
        this.isOn = true;
    }

    public void off() {
        this.isOn = false;
    }

    abstract void work();
}
