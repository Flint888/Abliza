package lesson4.homework;

import lesson4.homework.base.Cat;
import lesson4.homework.base.Dog;
import lesson4.homework.expert.GeneratorExpertHomework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.regex.Pattern;

public class Homework {
    public static void main(String[] args) {
        //Базовый
        //Задача №1
        //Дано (их менять нельзя)
        String hi = "                Hello ";
        String world = " WoRld!";
        char newLine = '\n';
        //Создать из трех переменных единую строку,
        //Привести к правильному виду (Ниже), убрать лишние пробелы,
        //затроить (Можно вызвать тольку одну команду System.out.print())
        String phrase = hi.trim() + world.toLowerCase() + newLine;
        System.out.println(phrase.repeat(3));

        //Результат вывода на экран:
        //Hello world!
        //Hello world!
        //Hello world!

        // Задание №2 - Написать цикл, который выводит через пробел 100 чисел с приставкой "a".
        // Ожидаемый результат: 1а 2а 3а .. 100а
        for (int i = 1; i < 101; i++) {
            System.out.print(i + "a ");
        }
        System.out.println();

        // Задание №3
        // Создать два класса, которые описывают виды животных (имеют два атрибута).
        // Написать к ним конструктор, сеттеры, геттеры.
        // Например: класс Кот, класс Собака
        Cat cat = new Cat("Barsik", "Black");
        Dog dog = new Dog(false, 4);


        //Продвинутый
        // Задание №1: Написать цикл, который будет прибавлять число к result до тех пор,
        // пока не получиться больше 1_000_000.
        // Дано:
        double increment = 0.01123;
        double result = 0;
        long count = 0;
        // Вывести на экран, количество итераций, которое потребовалось, чтобы дойти до миллиона.
        // Если число отрицательное, то сразу заканчиваем цикл, ничего не выводя.
        // Внимание: число может измениться, и не должно приводить к изменению вашего кода.
        while (result < 1_000_000) {
            count++;
            result += increment;
        }
        System.out.println(count);

        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый
        // нечетный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".
        int[] array = {1, 1, 1, 1, 1};
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));

        //Задача №3
        //Создать два массив чисел:
        // 1,2,5,7,10
        // 2,3,2,17,15
        // Создать массив чисел, в котором будут: все числа из этих двух массивов,
        // и результат умножения чисел с одинаковым порядковым номером
        //
        //Ожидаемый результат:
        //1,2,5,7,10,2,3,2,17,15,2,6,10,119,150
        //(первый массив - 1,2,5,7,10), (второй массив - 2,3,2,17,15),
        //(результат перемножения - (1*2), (2*3), (5*2), (7*17), (10*15)
        int[] numbers1 = {1, 2, 5, 7, 10};
        int[] numbers2 = {2, 3, 2, 17, 15};
        int[] numbers3 = new int[numbers1.length * 3];
        for (int i = 0; i < numbers1.length; i++) {
            numbers3[i] = numbers1[i];
            numbers3[i + 5] = numbers2[i];
            numbers3[i + 10] = numbers1[i] * numbers2[i];
        }
        //1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
        System.out.println(Arrays.toString(numbers3));

        //Задача №4
        //В строке "Hello world!" заменить l на r, сделать все буквы заглавными, выбрать первые 8 символов
        String hello = "Hello world";
        String resultHello = hello.replaceAll("l", "r").toUpperCase().substring(0, 8);
        System.out.println(resultHello);

        // Экспертный уровень:
        // Предыстория: Мы находимся в статистическом институте. Хочется понять уровень миграции между регионами за месяц.
        // Для этого было решено произвести анализ передвижения автомобилей: на границе каждого региона стоят камеры,
        // фиксирующие въезд и выезд автомобилей. Формат автомобильного номера: (буква)(3 цифры)(2 буквы)(2-3 цифры)
        // К474СЕ178 - где 178 регион

        // Задача №1: узнать сколько всего машин со спец номерами(вывести на экран): начинаются на M
        // и заканчиваются на АВ (русские буквы).
        // Не повторяющиеся
        //Для генерации данных воспользоваться GeneratorExpertHomework.getData()

        //Входящие данные
        // Map<Integer, Map<String, String[]>> - где ключ первого уровня - номер региона,
        // out, input - ключи второго уровня (выезд, въезд), и String[] - массивы номеров.
        // { 1 : {
        //      "out" : ["К474СЕ178"],
        //      "input": ["А222РТ178"]
        //    },
        //   2 : {
        //        "out" : ["К722АВ12", "А222РТ178"],
        //        "input" : ["М001АВ01", "А023РВ73"],
        //   }
        // ..
        //  }
        Map<Integer, Map<String, String[]>> data = GeneratorExpertHomework.getData();
        getSpecialNumbers(data);

        //Список технологий:
        // Set (HashSet) - узнать что это, set.contains(), set.put()
        // Map (HashMap) - узнать что это, map.get(), map.put(), map.entrySet() - для итерации, entry.getValue(), entry.getKey()
        // <Integer> - обозначает тип который хранится в этой структуре данных (Generics)
        // Регулярные выражения - вытащить регион авто
    }

    public static void getSpecialNumbers(Map<Integer, Map<String, String[]>> data) {
        Pattern pattern = Pattern.compile("М\\d{3}АВ");
        HashSet<String> specialNumbers = new HashSet<>();
        for (Map.Entry<Integer, Map<String, String[]>> region : data.entrySet()) {
            for (Map.Entry<String, String[]> regionData : region.getValue().entrySet()) {
                for (String carNumber : regionData.getValue()) {
                    if (pattern.matcher(carNumber).find()) {
                        specialNumbers.add(carNumber);
                    }
                }
            }
        }
        System.out.println(specialNumbers.size());
    }
}
