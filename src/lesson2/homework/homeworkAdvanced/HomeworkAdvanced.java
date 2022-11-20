package lesson2.homework.homeworkAdvanced;

public class HomeworkAdvanced {
    public static void main(String[] args) {
        //Продвинутая
        //Продвинутый уровень
        //Задача №1
        //Произвести преобразование "234" в число типа int и прибавить к этому числу длину строки "some_text"
        String numberText =  "234";
        int number = Integer.parseInt(numberText);
        String someText = "some_text";
        System.out.println(number + someText.length());

        //Задача №2
        //Посчитать (a+b)^2 = ?, при a=3, b=5
        int a = 3;
        int b = 5;
        int result = (a + b) * (a + b);
        System.out.println(result);

        // Задание №3:
        // Дано:
        boolean hasFuel = true;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = true;
        boolean hasAnyProblem = hasElectricsProblem && hasMotorProblem && hasTransmissionProblem && hasWheelsProblem;

        if (!hasFuel && !hasAnyProblem) {
            System.out.println("Нет бензина, с вас 1000 рублей");
        }
        double price = 0;
        double discont = 1;
        int countProblems = 0;
        if (hasMotorProblem) {
            price += 10_000;
            countProblems++;
        }
        if (hasElectricsProblem) {
            price += 5000;
            countProblems++;
        }
        if (hasTransmissionProblem) {
            price += 4000;
            countProblems++;
        }
        if (hasWheelsProblem) {
            price += 2000;
            countProblems++;
        }
        if (countProblems == 2) {
            discont -= 0.1;
        }
        if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)) {
            discont -= 0.2;
        }
        price = price * discont;
        System.out.println("Итоговая сумма: " + price);
        // В автосервис приехала сломанная машина. Механики находят неисправность следующим способом:
        // Если у машины нет бензина и ничего не сломано, то отдают машину владельцу и берут 1000 рублей за консультацию.
        // Если у машины проблема с двигателем, то чинят и берут 10 000.
        // Если у машины проблема с электрикой, то чинят и берут 5000.
        // Если у машины проблема с коробкой передач, то чинят и берут 4000.
        // Если у машины проблема с колесами, то чинят и берут 2000.
        // Если две детали сломаны, то на общий счет идет скидка 10%.
        // Если сломана коробка передач, и электрика или двигатель, то на общий счет скидка 20%.
        // Если нет бензина и что-то сломано, то за консультацию денег не берут.
        // Ситуации, что бензин есть и ничего не сломано - быть не может.
        // Ожидаемый результат: выведен на экран счет клиенту.
    }
}
