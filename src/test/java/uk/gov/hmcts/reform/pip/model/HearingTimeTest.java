package uk.gov.hmcts.reform.pip.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.gov.hmcts.reform.pip.model.classified.fields.ClassifiedLocalDateTime;
import uk.gov.hmcts.reform.pip.model.classified.fields.ClassifiedString;
import uk.gov.hmcts.reform.pip.model.enums.Classification;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HearingTimeTest {

    private ClassifiedLocalDateTime classifiedLocalDateTime;
    private ClassifiedString classifiedString;

    @BeforeEach
    public void setClassifiedFields() {
        classifiedLocalDateTime = new ClassifiedLocalDateTime();
        classifiedLocalDateTime.setClassification(Classification.INTERNAL);
        classifiedLocalDateTime.setValue(LocalDateTime.now());

        classifiedString = new ClassifiedString();
        classifiedString.setClassification(Classification.INTERNAL);
        classifiedString.setValue("TestValue");
    }

    @Test
    public void testHearingTimeId() {
        HearingTime hearingTime = HearingTime.builder().hearingTimeId(2L).build();
        assertEquals(2L, hearingTime.getHearingTimeId());
    }

    @Test
    public void testClassification() {
        HearingTime hearingTime = HearingTime.builder().classification(Classification.INTERNAL).build();
        assertEquals(Classification.INTERNAL, hearingTime.getClassification());
    }

    @Test
    public void testStart() {
        HearingTime hearingTime = HearingTime.builder().start(classifiedLocalDateTime).build();
        assertEquals(classifiedLocalDateTime, hearingTime.getStart());
    }

    @Test
    public void testDuration() {
        HearingTime hearingTime = HearingTime.builder().duration(classifiedString).build();
        assertEquals(classifiedString, hearingTime.getDuration());
    }

}
