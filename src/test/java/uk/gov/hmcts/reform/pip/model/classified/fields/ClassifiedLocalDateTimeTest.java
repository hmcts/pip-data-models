package uk.gov.hmcts.reform.pip.model.classified.fields;

import org.junit.jupiter.api.Test;
import uk.gov.hmcts.reform.pip.model.enums.Classification;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassifiedLocalDateTimeTest {

    @Test
    public void testClassification() {
        ClassifiedLocalDateTime classifiedLocalDateTime = new ClassifiedLocalDateTime();
        classifiedLocalDateTime.setClassification(Classification.INTERNAL);

        assertEquals(Classification.INTERNAL, classifiedLocalDateTime.getClassification(),
                     "Classification should be set");
    }

    @Test
    public void testValue() {
        LocalDateTime localDateTime = LocalDateTime.now();

        ClassifiedLocalDateTime classifiedLocalDateTime = new ClassifiedLocalDateTime();
        classifiedLocalDateTime.setValue(localDateTime);

        assertEquals(localDateTime, classifiedLocalDateTime.getValue(), "Value should be set");
    }

}
