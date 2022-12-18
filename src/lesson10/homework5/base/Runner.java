package lesson10.homework5.base;

import java.io.*;

public class Runner {
    public static void main(String[] args) {
        //task1();
        task2();
    }

    //Задача №2
    //Необходимо:
    // 1. Создать класс FinancialRecord, с двумя атрибутами: incomes, outcomes (доходы, расходы)
    // 2. Создать в этом классе геттеры, сеттеры и конструктор на все атрибуты
    // 3. Создать объект этого класса прямо здесь (class Homework5, метод main), с доходами 500, расходами 300
    // 4. Записать в файл "report.txt" данные из объекта класса.
    // Ожидаемый результат: в файле report.txt - одна строка: доходы = 500, расходы = 300
    public static void task2() {
        FinancialRecord financialRecord = new FinancialRecord(500, 300);
        String filename = "E:\\tutorial\\java_core_5\\report.txt";
        String result = String.format("доходы = %s, расходы = %s", financialRecord.getIncome(),
                financialRecord.getOutcome());
        try (FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.write(result);
        } catch (IOException e) {
            System.out.println("Какая то проблема с файлом");
            System.out.println(e.getMessage());
        }
    }

    public static void task1() {
        //Задача №1
        String filename = "E:\\tutorial\\java_core_5\\homework5_base_input.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));) {
            String firstLine = bufferedReader.readLine();
            String secondLine = bufferedReader.readLine();
            System.out.println(firstLine + " " + secondLine);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Иные проблемы с файлом");
        }
    }
}
