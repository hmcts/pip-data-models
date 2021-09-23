package uk.gov.hmcts.reform.pip.model.classified.fields;

import org.junit.jupiter.api.Test;
import uk.gov.hmcts.reform.pip.model.enums.Classification;
import uk.gov.hmcts.reform.pip.model.enums.EntityRole;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassifiedEntityRoleTest {

    @Test
    public void testClassification() {
        ClassifiedEntityRole classifiedEntityRole = new ClassifiedEntityRole();
        classifiedEntityRole.setClassification(Classification.INTERNAL);

        assertEquals(Classification.INTERNAL, classifiedEntityRole.getClassification(), "Classification should be set");
    }

    @Test
    public void testValue() {
        ClassifiedEntityRole classifiedEntityRole = new ClassifiedEntityRole();
        classifiedEntityRole.setValue(EntityRole.APPELLANT);

        assertEquals(EntityRole.APPELLANT, classifiedEntityRole.getValue(), "Value should be set");
    }

}
