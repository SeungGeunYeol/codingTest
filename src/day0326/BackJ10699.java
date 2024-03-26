package day0326;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class BackJ10699 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = today.format(dateTimeFormatter);

        System.out.println(formattedDate);

    }
}
