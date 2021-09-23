package uk.gov.hmcts.reform.pip.model.classified.fields;

import org.junit.jupiter.api.Test;
import uk.gov.hmcts.reform.pip.model.enums.Classification;
import uk.gov.hmcts.reform.pip.model.enums.Platform;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassifiedPlatformTest {

    @Test
    public void testClassification() {
        ClassifiedPlatform classifiedPlatform = new ClassifiedPlatform();
        classifiedPlatform.setClassification(Classification.INTERNAL);

        assertEquals(Classification.INTERNAL, classifiedPlatform.getClassification());
    }

    @Test
    public void testValue() {
        ClassifiedPlatform classifiedPlatform = new ClassifiedPlatform();
        classifiedPlatform.setValue(Platform.CFT);

        assertEquals(Platform.CFT, classifiedPlatform.getValue());
    }

}
