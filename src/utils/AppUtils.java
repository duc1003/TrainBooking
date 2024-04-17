package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class AppUtils {
    public static String convertDateFormat(String dateString) {
        try {
            SimpleDateFormat sdfInput = new SimpleDateFormat("dd-MM-yyyy");
            SimpleDateFormat sdfOutput = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdfInput.parse(dateString);
            return sdfOutput.format(date);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
