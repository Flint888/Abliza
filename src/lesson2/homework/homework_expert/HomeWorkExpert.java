package lesson2.homework.homework_expert;

public class HomeWorkExpert {
    private static final String OPEN_TAG = "<data>";
    private static final String CLOSE_TAG = "</data>";
    private static final String EMAIL_SYMBOL = "@";
    private static final String DELIMITER_SYMBOL = ";";
    private static final String MASKING_SYMBOL = "*";
    private static final String DOT_SYMBOL = ".";
    private static final String SPACE_SYMBOL = " ";

    public static void main(String[] args) {
        //Экспертный уровень
        //Задача №1
        //Создать метод маскирования персональных данных, который:
        //Телефон (до/после маскирования): 79991113344 / 7999***3344
        //Email (до/после маскирования): test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
        //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
        //
        //Входящие параметры: String text
        //Возвращаемый результат: String
        //
        //Примеры возможного текста:
        //<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client> -
        // "<client>(Какие то данные)<data>7999***3344;tes*@******.ru;И****в Иван И.</data></client>"
        //<client>(Какие то данные)<data></data></client> - вернет тоже (никаких ошибок)
        //<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client> - "<client>(Какие то данные)<data>И****в Иван И.;7999***3344</data></client>"

        //Используемые технологии: String.find, String.replaceAll, String.split, String.join, String.contains, String.substring
        //Регулярные выражения, класс StringBuilder
        String testData = "<client>(Какие то данные)<data>79991113344;test@yandex.ru;Иванов Иван Иванович</data></client>";
        String testData2 = "<client>(Какие то данные)<data></data></client>";
        String testData3 = "<client>(Какие то данные)<data>Иванов Иван Иванович;79991113344</data></client>";
        System.out.println(masking(testData));
        System.out.println(masking(testData2));
        System.out.println(masking(testData3));
    }

    public static String masking(String text) {
        int indexStartData = text.indexOf(OPEN_TAG) + OPEN_TAG.length();
        int indexEndData = text.indexOf(CLOSE_TAG, indexStartData);

        if ((indexEndData - indexStartData) > 0) {
            String clientData = text.substring(indexStartData, indexEndData);
            return new StringBuilder()
                    .append(text, 0, indexStartData)
                    .append(maskingHelper(clientData))
                    .append(text.substring(indexEndData))
                    .toString();
        }

        return text;
    }

    private static String maskingHelper(String clientData) {
        StringBuilder result = new StringBuilder();
        for (String field : clientData.split(DELIMITER_SYMBOL)) {
            if (field.contains(EMAIL_SYMBOL)) {
                maskingEmail(field, result);
            } else if (hasOnlyDigits(field)) {
                maskingNumber(field, result);
            } else {
                maskingFio(field, result);
            }
        }

        return result.substring(0, result.length() - 1);
    }

    //    test@yandex.ru / tes*@******.ru, my_mail@gmail.com / my_mai*@*****.com
    //field = test@yandex.ru
    private static void maskingEmail(String field, StringBuilder result) {
        int emailIndex = field.indexOf(EMAIL_SYMBOL);
        int dotIndex = field.indexOf(DOT_SYMBOL, emailIndex);

        result.append(new StringBuilder()
                .append(field, 0,  emailIndex - 1)
                .append(MASKING_SYMBOL)
                .append(EMAIL_SYMBOL)
                .append(MASKING_SYMBOL.repeat(dotIndex - emailIndex - 1))
                .append(field.substring(dotIndex))
                .append(DELIMITER_SYMBOL));
    }

    //Фио (до/после маскирования): Иванов Иван Иванович / И****в Иван И.
    private static void maskingFio(String field, StringBuilder result) {
        int indexFirstName = field.indexOf(" ");
        int indexSecondName = field.indexOf(" ", indexFirstName + 1);

        result.append(new StringBuilder()
                .append(field, 0, 1)
                .append(MASKING_SYMBOL.repeat(indexFirstName - 2))
                .append(field, indexFirstName - 1, indexFirstName)
                .append(SPACE_SYMBOL)
                .append(field, indexFirstName + 1, indexSecondName)
                .append(field, indexSecondName, indexSecondName + 2)
                .append(DOT_SYMBOL)
                .append(DELIMITER_SYMBOL));
    }

    //79991113344 / 7999***3344
    private static void maskingNumber(String field, StringBuilder result) {
        result.append(new StringBuilder()
                .append(field, 0, 4)
                .append(MASKING_SYMBOL.repeat(3))
                .append(field, 7, field.length())
                .append(DELIMITER_SYMBOL));
    }

    private static boolean hasOnlyDigits(String field) {
        String digits = "0123456789";
        for (String letter : field.split("")) {
            if (!digits.contains(letter)) {
                return false;
            }
        }
        return true;
    }
}
