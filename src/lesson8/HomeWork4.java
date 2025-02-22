package lesson8;

public class HomeWork4 {
    public static void main(String[] args) {
        //Базовый уровень
        //Задача №1
        //1. Создать два класса, которые умеют летать: самолет и утка. Атрибут утки: isInjured (ранен),
        // атрибут самолета: countPassengers.
        //2. Создать интерфейс, который объединяет эти два класса.
        //3. Имплементировать его в двух классах
        //4. Реализовать метод летать:
        // Для утки:
        // Метод летать будет выкидывать ошибку FlyException (создать такой класс), если утка подстрелена,
        // иначе печатать на экран "утка летит"
        // Для самолета:
        // Метод летать будет выкидывать ошибку FlyException, если количество пассажиров меньше нуля.
        // Иначе печать "самолет летит"
        //5. Создать 1 утку не раненую, 1 утку раненую, 1 самолет с 10 пассажирами, 1 самолет с -1 пассажиром.
        //6. Положить их всех в массив
        //7. Перебрать массив и вызвать у каждого элемента метод летать
        // Перехватить исключения: вывести на экран message ошибки
        // Ожидание:
        // утка летит
        // Ошибка: утка ранена
        // самолет летит
        // Ошибка: пассажиров в самолете меньше 0

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

        //Задача №1
        // Реализовать паттерн Decorator для класса Car (атрибут - стоимость, метод - вывести на экран стоимость).
        // Метод вывести на экран стоимость - выкидывает ошибку, если стоимость меньше 0
        // Для этого шаблона характерно:
        // 1. Класс основа (Car), и класс декоратор (CarShop), который принимает в себя экземпляр класса основы
        // 2. Вызов всех методов происходит у декоратора
        // Необходимо вызвать у декоратора метод продать машину, который выведет на экран для машины со стоимостью 5000
        // Здравствуй клиент, цена этого авто (Вызвано из объекта CarShop):
        // 5000 - (вызванно из объекта Car)
        // Хочешь купить авто? (Вызвано из объекта CarShop)

        // Если стоимость машины меньше нуля:
        // Здравствуй клиент, цена этого авто (Вызвано из объекта CarShop):
        // Неизвестна мне - (выдано из объекта CarShop)
        // Давайте посмотрим другое авто? (Вызвано из объекта CarShop)
    }
}
