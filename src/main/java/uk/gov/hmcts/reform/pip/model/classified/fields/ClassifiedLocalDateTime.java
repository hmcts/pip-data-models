package uk.gov.hmcts.reform.pip.model.classified.fields;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import javax.persistence.Embeddable;

/**
 * Model which represents a classified local date time.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Embeddable
public class ClassifiedLocalDateTime extends ClassifiedField {

    private LocalDateTime value;

}
