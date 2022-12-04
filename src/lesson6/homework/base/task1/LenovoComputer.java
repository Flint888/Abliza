package lesson6.homework.base.task1;

// 3. LenovoComputer (имеет метод loadSystem - выводит в консоль сообщение "загрузка Lenovo").
public class LenovoComputer extends Computer {

    @Override
    public void loadSystem() {
        System.out.println("загрузка Lenovo");
    }
}
