package lesson10;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String s = "20\\01\\2020";
        System.out.println(s.replaceAll("\\\\", "o"));
    }
}
