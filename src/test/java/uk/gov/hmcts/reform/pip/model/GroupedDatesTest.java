package uk.gov.hmcts.reform.pip.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupedDatesTest {

    @Test
    public void testGroupedDatesId() {
        GroupedDates groupedDates = GroupedDates.builder().groupedDatesId(2L).build();
        assertEquals(2L, groupedDates.getGroupedDatesId(), "Grouped Dates ID should be set");
    }

    @Test
    public void testPublicDate() {
        LocalDate localDate = LocalDate.now();

        GroupedDates groupedDates = GroupedDates.builder().publicDate(localDate).build();
        assertEquals(localDate, groupedDates.getPublicDate(), "Public date should be set");
    }

    @Test
    public void testMedia() {
        LocalDate localDate = LocalDate.now();

        GroupedDates groupedDates = GroupedDates.builder().media(localDate).build();
        assertEquals(localDate, groupedDates.getMedia(), "Media date should be set");
    }

    @Test
    public void testLegalProfessional() {
        LocalDate localDate = LocalDate.now();

        GroupedDates groupedDates = GroupedDates.builder().legalProfessional(localDate).build();
        assertEquals(localDate, groupedDates.getLegalProfessional(), "Legal Professional should be set");
    }

}
