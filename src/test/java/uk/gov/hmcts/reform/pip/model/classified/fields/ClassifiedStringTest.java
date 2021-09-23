package uk.gov.hmcts.reform.pip.model.classified.fields;

import org.junit.jupiter.api.Test;
import uk.gov.hmcts.reform.pip.model.enums.Classification;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassifiedStringTest {

    @Test
    public void testClassification() {
        ClassifiedString classifiedString = new ClassifiedString();
        classifiedString.setClassification(Classification.INTERNAL);

        assertEquals(Classification.INTERNAL, classifiedString.getClassification(), "Classification should be set");
    }

    @Test
    public void testValue() {
        ClassifiedString classifiedString = new ClassifiedString();
        classifiedString.setValue("TestValue");

        assertEquals("TestValue", classifiedString.getValue(), "Value should be set");
    }

}
