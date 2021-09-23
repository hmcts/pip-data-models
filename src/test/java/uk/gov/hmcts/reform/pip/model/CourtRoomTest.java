package uk.gov.hmcts.reform.pip.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.gov.hmcts.reform.pip.model.classified.fields.ClassifiedString;
import uk.gov.hmcts.reform.pip.model.enums.Classification;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CourtRoomTest {

    private ClassifiedString classifiedString;

    @BeforeEach
    public void setClassifiedFields() {
        classifiedString = new ClassifiedString();
        classifiedString.setClassification(Classification.INTERNAL);
        classifiedString.setValue("TestValue");
    }

    @Test
    public void testCourtRoomId() {
        CourtRoom courtRoom = CourtRoom.builder().courtRoomId(2).build();
        assertEquals(2, courtRoom.getCourtRoomId());
    }

    @Test
    public void testClassification() {
        CourtRoom courtRoom = CourtRoom.builder().classification(Classification.INTERNAL).build();
        assertEquals(Classification.INTERNAL, courtRoom.getClassification());
    }

    @Test
    public void testCourtRoomName() {
        CourtRoom courtRoom = CourtRoom.builder().courtRoomName(classifiedString).build();
        assertEquals(classifiedString, courtRoom.getCourtRoomName());
    }

    @Test
    public void testSession() {
        CourtRoom courtRoom = CourtRoom.builder().session(classifiedString).build();
        assertEquals(classifiedString, courtRoom.getSession());
    }

    @Test
    public void testJudiciary() {
        Judiciary judiciary = Judiciary.builder().judiciaryId(2L).build();

        CourtRoom courtRoom = CourtRoom.builder().judiciary(judiciary).build();
        assertEquals(judiciary, courtRoom.getJudiciary());
    }

    @Test
    public void testSessionType() {
        CourtRoom courtRoom = CourtRoom.builder().sessionType(classifiedString).build();
        assertEquals(classifiedString, courtRoom.getSessionType());
    }

    @Test
    public void testHearings() {
        List<Hearing> hearings = List.of(Hearing.builder().hearingId(2).build());

        CourtRoom courtRoom = CourtRoom.builder().hearings(hearings).build();
        assertEquals(hearings, courtRoom.getHearings());
    }

}
