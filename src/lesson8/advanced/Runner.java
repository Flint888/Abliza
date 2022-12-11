package lesson8.advanced;


//Продвинутая
//Задача №1
//2. Создать следующую структуру из классов и интерфейсов
// магазин (обладает работниками)
// работник (обладает часами - (часы одни))
// часы (умеют тикать, если сломаны выкидывают ошибку WatchBrokenError)
// Бренд (обладает массивом магазинов)
// Создать бренд, положить в него два магазина, в каждом магазине будет по работнику,
// у каждого работника по часам. У одного работника часы сломаны, у второго нет.
// После создания бренда, вытащить из него все часы и вызвать у всех часов метод тикать,
// обработать ошибку сломанных часов.
// Ожидание вывода на экран:
// Часы тикают
// Ошибка: Часы сломались.
public class Runner {
    public static void main(String[] args) {
        Watch watch = new Watch(false);
        Watch watchBroken = new Watch(true);

        Worker worker = new Worker(watch);
        Worker worker2 = new Worker(watchBroken);

        Shop shop = new Shop(new Worker[]{worker});
        Shop shop2 = new Shop(new Worker[]{worker2});

        Brand brand = new Brand(new Shop[]{shop, shop2});

        for (Shop brandShop : brand.getShops()) {
            for (Worker shopWorker : brandShop.getWorkers()) {
                try {
                    shopWorker.getWatch().tick();
                } catch (WatchBrokenError e) {
                    System.out.println(e.getMessage());
                }
            }
        }

    }
}
