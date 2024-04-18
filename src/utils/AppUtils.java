package utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

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
    public static String generateCode() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        // Tạo các phần của mã theo định dạng yêu cầu
        for (int i = 0; i < 11; i++) {
            char c;
            if (i % 3 == 2 && i > 0) {
                // Nếu đến vị trí thứ 3, 6 hoặc 9, thêm dấu '-'
                sb.append("-");
            } else {
                if (random.nextBoolean()) {
                    // Tạo ký tự chữ cái thường
                    c = (char) ('a' + random.nextInt(26)); // Chữ cái từ a đến z
                } else {
                    // Tạo ký tự số
                    c = (char) ('0' + random.nextInt(10)); // Số từ 0 đến 9
                }
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
