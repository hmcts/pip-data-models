package uk.gov.hmcts.reform.pip.model.classified.fields;

import lombok.Getter;
import lombok.Setter;

/**
 * Model which represents a classified field.
 */
@Getter
@Setter
public abstract class ClassifiedField {

    protected String classification;

}
