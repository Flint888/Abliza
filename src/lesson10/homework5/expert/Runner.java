package lesson10.homework5.expert;

import java.io.*;
import java.math.BigDecimal;
import java.util.HashMap;

public class Runner {
    private static final String DELIMITER = ";";

    public static void main(String[] args) throws IOException {
        //Сгенерировать отчеты нужно через DataGenerator
        //В path указать путь до папки, где сгенерятся отчеты
        String path = "E:\\tutorial\\java_core_5\\data";
        DataGenerator.createReports(path);

        //Экспертный уровень
        // Дано: папка, внутри которой находятся файлы, следующего именования - report_01_2012.txt, где 01 - месяц,
        // 2012 - год
        // Внутри файла следующий формат:
        // pyterochka;122300.20;100312.10;20/01/2012
        // pyterochka;299922.00;323333.02;21/01/2012
        // perekrestok;9920.20;28200.01;21/01/2012
        // Где pyterochka - название магазина; 122300.20 - доход; 100312.10 - расход, 20/01/2012 - дата операции

        // Задача №1
        // Необходимо составить отчет о итоговой прибыли за каждый месяц по магазину pyterochka
        // Формат ожидаемого результат:
        // Прибыль по магазину pyterochka по месяцам
        // 01.2012: 20000.00
        // 02.2012: -100332.00
        // и тд
        printProfitReportByShop("pyterochka", path);
    }

    public static void printProfitReportByShop(String shopName, String dataFolder) throws IOException {
        String[] list = new File(dataFolder).list();
        HashMap<String, BigDecimal[]> result = new HashMap<>();
        for (String file : list) {
            getResultsByShop(file, true, result, shopName);
        }

    }

    public static void getResultsByShop(String filename,
                                        boolean skipFirstRow,
                                        HashMap<String, BigDecimal[]> result,
                                        String shopName) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {
            while (bufferedReader.ready()) {
                if (skipFirstRow) {
                    bufferedReader.readLine();
                    skipFirstRow=false;
                    continue;
                }
                String[] fields = bufferedReader.readLine().split(DELIMITER);
                if (fields.length == 1 || fields[0].equals(shopName)) {
                    continue;
                }
                BigDecimal income = new BigDecimal(fields[1]);
                BigDecimal outcome = new BigDecimal(fields[2]);
                String[] textDate = fields[3].split("\\\\");
                String monthAndYear = textDate[1] + textDate[2];
                if (result.containsKey(monthAndYear)) {
                    BigDecimal[] incomesAndOutcomes = result.get(monthAndYear);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
