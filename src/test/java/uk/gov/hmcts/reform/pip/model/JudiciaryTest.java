package uk.gov.hmcts.reform.pip.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import uk.gov.hmcts.reform.pip.model.classified.fields.ClassifiedString;
import uk.gov.hmcts.reform.pip.model.enums.Classification;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JudiciaryTest {

    private ClassifiedString classifiedString;

    @BeforeEach
    public void classifiedStringCreater() {
        classifiedString = new ClassifiedString();
        classifiedString.setClassification(Classification.INTERNAL);
        classifiedString.setValue("TestValue");
    }

    @Test
    public void testJudiciaryId() {
        Judiciary judiciary = Judiciary.builder().judiciaryId(2L).build();
        assertEquals(2L, judiciary.getJudiciaryId(), "Judiciary ID should be set");
    }

    @Test
    public void testClassification() {
        Judiciary judiciary = Judiciary.builder().classification(Classification.INTERNAL).build();
        assertEquals(Classification.INTERNAL, judiciary.getClassification(), "Classification should be set");
    }

    @Test
    public void testMagistrate() {
        Judiciary judiciary = Judiciary.builder().magistrate(classifiedString).build();
        assertEquals(classifiedString, judiciary.getMagistrate(), "Magistrate should be set");
    }

    @Test
    public void testClerk() {
        Judiciary judiciary = Judiciary.builder().clerk(classifiedString).build();
        assertEquals(classifiedString, judiciary.getClerk(), "Clerk should be set");
    }

    @Test
    public void testJudge() {
        Judiciary judiciary = Judiciary.builder().judge(classifiedString).build();
        assertEquals(classifiedString, judiciary.getJudge(), "Judge should be set");
    }

}
