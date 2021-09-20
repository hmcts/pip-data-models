package uk.gov.hmcts.reform.pip.model.classified.fields;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Embeddable;

/**
 * Model which represents a classified string.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Embeddable
public class ClassifiedString extends ClassifiedField {

    private String value;

}
