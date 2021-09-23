package uk.gov.hmcts.reform.pip.model;


import org.junit.jupiter.api.Test;
import uk.gov.hmcts.reform.pip.model.enums.Classification;
import uk.gov.hmcts.reform.pip.model.enums.PublicationType;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PublicationTest {

    @Test
    public void testPublicationId() {
        Publication publication = Publication.builder().publicationId(1L).build();
        assertEquals(1L, publication.getPublicationId());
    }

    @Test
    public void testCourtHouseType() {
        Publication publication = Publication.builder().courtHouseType("courtHouseType").build();
        assertEquals("courtHouseType", publication.getCourtHouseType());
    }

    @Test
    public void testCourtId() {
        Publication publication = Publication.builder().courtId(1234).build();
        assertEquals(1234, publication.getCourtId());
    }

    @Test
    public void testPublicationType() {
        Publication publication = Publication.builder().publicationType(PublicationType.LIST).build();
        assertEquals(PublicationType.LIST, publication.getPublicationType());
    }

    @Test
    public void testClassification() {
        Publication publication = Publication.builder().classification(Classification.PRIVATE).build();
        assertEquals(Classification.PRIVATE, publication.getClassification());
    }

    @Test
    public void testLocalDate() {
        LocalDate localDate = LocalDate.now();
        Publication publication = Publication.builder().date(LocalDate.now()).build();
        assertEquals(localDate, publication.getDate());
    }

    @Test
    public void testDisplayFrom() {
        GroupedDates groupedDates = GroupedDates.builder().groupedDatesId(1L).build();
        Publication publication = Publication.builder().displayFrom(groupedDates).build();
        assertEquals(groupedDates, publication.getDisplayFrom());
    }

    @Test
    public void testDisplayTo() {
        GroupedDates groupedDates = GroupedDates.builder().groupedDatesId(1L).build();
        Publication publication = Publication.builder().displayTo(groupedDates).build();
        assertEquals(groupedDates, publication.getDisplayTo());
    }

    @Test
    public void testRetentionTo() {
        GroupedDates groupedDates = GroupedDates.builder().groupedDatesId(1L).build();
        Publication publication = Publication.builder().retentionTo(groupedDates).build();
        assertEquals(groupedDates, publication.getRetentionTo());
    }

    @Test
    public void testCourtRooms() {
        List<CourtRoom> courtRoom = List.of(CourtRoom.builder().courtRoomId(1).build());
        Publication publication = Publication.builder().courtRooms(courtRoom).build();
        assertEquals(courtRoom, publication.getCourtRooms());
    }

}
