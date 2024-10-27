public class StringBild {

    private static final String OPEN_TAG = "StringBuilder в ";
    private static final String CLOSE_TAG = " строк";
    private static final String EMAIL_SYMBOL = "T";

    public static String masking(String text) {
        int indexStartData = text.indexOf(OPEN_TAG) + OPEN_TAG.length();
        int indexEndData = text.indexOf(CLOSE_TAG, indexStartData);
        if ((indexEndData - indexStartData) > 0) {
            String clientData = text.substring(indexStartData, indexEndData);
            System.out.println("clientData");
            System.out.println(clientData);
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
        maskingEmail(clientData, result);

        return result.substring(0);
    }

    private static void maskingEmail(String field, StringBuilder result) {
        String bbb = "ТЮМЕНЬ";

        result.append(new StringBuilder()
                .append(field)
                .append(" " + bbb)
                .append(" ТАК МОЖНО")
        );
    }
}
