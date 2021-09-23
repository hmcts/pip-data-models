package uk.gov.hmcts.reform.pip.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.gov.hmcts.reform.pip.model.classified.fields.ClassifiedPlatform;
import uk.gov.hmcts.reform.pip.model.classified.fields.ClassifiedString;
import uk.gov.hmcts.reform.pip.model.enums.Classification;
import uk.gov.hmcts.reform.pip.model.enums.Platform;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HearingTest {

    private ClassifiedString classifiedString;
    private ClassifiedPlatform classifiedPlatform;

    @BeforeEach
    public void setClassifiedFields() {
        classifiedString = new ClassifiedString();
        classifiedString.setClassification(Classification.INTERNAL);
        classifiedString.setValue("TestValue");

        classifiedPlatform = new ClassifiedPlatform();
        classifiedPlatform.setClassification(Classification.INTERNAL);
        classifiedPlatform.setValue(Platform.CFT);
    }

    @Test
    public void testHearingId() {
        Hearing hearing = Hearing.builder().hearingId(2).build();
        assertEquals(2, hearing.getHearingId(), "Hearing ID should be set");
    }

    @Test
    public void testClassification() {
        Hearing hearing = Hearing.builder().classification(Classification.INTERNAL).build();
        assertEquals(Classification.INTERNAL, hearing.getClassification(), "Classification should be set");
    }

    @Test
    public void testCaseName() {
        Hearing hearing = Hearing.builder().caseName(classifiedString).build();
        assertEquals(classifiedString, hearing.getCaseName(), "Case name should be set");
    }

    @Test
    public void testCaseId() {
        Hearing hearing = Hearing.builder().caseId(classifiedString).build();
        assertEquals(classifiedString, hearing.getCaseId(), "Case ID should be set");
    }

    @Test
    public void testOffence() {
        Hearing hearing = Hearing.builder().offence(classifiedString).build();
        assertEquals(classifiedString, hearing.getOffence(), "Offence should be set");
    }

    @Test
    public void testEntities() {
        List<Entity> entities = List.of(Entity.builder().entityId(2).build());

        Hearing hearing = Hearing.builder().entities(entities).build();
        assertEquals(entities, hearing.getEntities(), "Entities should be set");
    }

    @Test
    public void testHearingTime() {
        HearingTime hearingTime = HearingTime.builder().hearingTimeId(2L).build();

        Hearing hearing = Hearing.builder().hearingTime(hearingTime).build();
        assertEquals(hearingTime, hearing.getHearingTime(), "Hearing time should be set");
    }

    @Test
    public void testUrn() {
        Hearing hearing = Hearing.builder().urn(classifiedString).build();
        assertEquals(classifiedString, hearing.getUrn(), "URN should be set");
    }

    @Test
    public void testPlatform() {
        Hearing hearing = Hearing.builder().platform(classifiedPlatform).build();
        assertEquals(classifiedPlatform, hearing.getPlatform(), "Platform should be set");
    }
}
