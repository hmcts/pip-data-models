package uk.gov.hmcts.reform.pip.model.classified.fields;

import org.junit.jupiter.api.Test;
import uk.gov.hmcts.reform.pip.model.enums.Classification;
import uk.gov.hmcts.reform.pip.model.enums.EntityType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassifiedEntityTypeTest {

    @Test
    public void testClassification() {
        ClassifiedEntityType classifiedEntityType = new ClassifiedEntityType();
        classifiedEntityType.setClassification(Classification.INTERNAL);

        assertEquals(Classification.INTERNAL, classifiedEntityType.getClassification(), "Classification should be set");
    }

    @Test
    public void testValue() {
        ClassifiedEntityType classifiedEntityType = new ClassifiedEntityType();
        classifiedEntityType.setValue(EntityType.INDIVIDUAL);

        assertEquals(EntityType.INDIVIDUAL, classifiedEntityType.getValue(), "Value should be set");
    }

}
