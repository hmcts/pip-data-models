package uk.gov.hmcts.reform.pip.model.report;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiDataInterfaceTest {

    @Test
    void testCorrectFormattingOfDateTime() {
        String localDateTimeInput = "2025-01-30T05:05:05";
        LocalDateTime localDateTime = LocalDateTime.parse(localDateTimeInput);
        String localDateTimeOutput = MiDataInterface.formatDateTime(localDateTime);

        assertEquals("2025-01-30 05:05:05", localDateTimeOutput, "Local date time values do not match");
    }


    @Test
    void testCorrectFormattingOfDateTimeWhenDateTimeIsNull() {
        String localDateTimeOutput = MiDataInterface.formatDateTime(null);

        assertEquals("", localDateTimeOutput, "Local date time values do not match");
    }
}
