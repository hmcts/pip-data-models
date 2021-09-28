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
        CourtRoom courtRoom = CourtRoom.builder().courtRoomId(2L).build();
        assertEquals(2, courtRoom.getCourtRoomId(), "Court room ID should be set");
    }

    @Test
    public void testClassification() {
        CourtRoom courtRoom = CourtRoom.builder().classification(Classification.INTERNAL).build();
        assertEquals(Classification.INTERNAL, courtRoom.getClassification(), "Classification should be set");
    }

    @Test
    public void testCourtRoomName() {
        CourtRoom courtRoom = CourtRoom.builder().courtRoomName(classifiedString).build();
        assertEquals(classifiedString, courtRoom.getCourtRoomName(), "Court room name should be set");
    }

    @Test
    public void testSession() {
        CourtRoom courtRoom = CourtRoom.builder().session(classifiedString).build();
        assertEquals(classifiedString, courtRoom.getSession(), "Session should be set");
    }

    @Test
    public void testJudiciary() {
        Judiciary judiciary = Judiciary.builder().judiciaryId(2L).build();

        CourtRoom courtRoom = CourtRoom.builder().judiciary(judiciary).build();
        assertEquals(judiciary, courtRoom.getJudiciary(), "Judiciary should be set");
    }

    @Test
    public void testSessionType() {
        CourtRoom courtRoom = CourtRoom.builder().sessionType(classifiedString).build();
        assertEquals(classifiedString, courtRoom.getSessionType(), "Session type should be set");
    }

    @Test
    public void testHearings() {
        List<Hearing> hearings = List.of(Hearing.builder().hearingId(2L).build());

        CourtRoom courtRoom = CourtRoom.builder().hearings(hearings).build();
        assertEquals(hearings, courtRoom.getHearings(), "Hearings list should be set");
    }

}
