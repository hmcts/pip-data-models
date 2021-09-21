package uk.gov.hmcts.reform.pip.model.classified.fields;

import lombok.Getter;
import lombok.Setter;
import uk.gov.hmcts.reform.pip.model.enums.Classification;

/**
 * Model which represents a classified field.
 */
@Getter
@Setter
public abstract class ClassifiedField {

    protected Classification classification;

}
