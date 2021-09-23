package uk.gov.hmcts.reform.pip.model.classified.fields;

import org.junit.jupiter.api.Test;
import uk.gov.hmcts.reform.pip.model.enums.Classification;
import uk.gov.hmcts.reform.pip.model.enums.EntityRoleType;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassifiedEntityRoleTypeTest {

    @Test
    public void testClassification() {
        ClassifiedEntityRoleType classifiedEntityRoleType = new ClassifiedEntityRoleType();
        classifiedEntityRoleType.setClassification(Classification.INTERNAL);

        assertEquals(Classification.INTERNAL, classifiedEntityRoleType.getClassification());
    }

    @Test
    public void testValue() {
        ClassifiedEntityRoleType classifiedEntityRoleType = new ClassifiedEntityRoleType();
        classifiedEntityRoleType.setValue(EntityRoleType.APPELLANT);

        assertEquals(EntityRoleType.APPELLANT, classifiedEntityRoleType.getValue());
    }

}
