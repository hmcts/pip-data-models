package uk.gov.hmcts.reform.pip.model.report;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public interface MiDataInterface {

    DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss",
                                                                        Locale.ENGLISH);

    /**
     * Used to format the date time for the MI output.
     * @param dateTime The date time to format.
     * @return The formatted date time. Will return empty if the date time is null.
     */
    static String formatDateTime(LocalDateTime dateTime) {
        if (dateTime != null) {
            try {
                return dateTime.format(DATE_TIME_FORMATTER);
            } catch (DateTimeException e) {
                return dateTime.toString();
            }
        }

        return "";
    }

    /**
     * Gets the values for the MI Data.
     * @return Returns the values for the MI data in an array.
     */
    String[] generateReportData();

}
