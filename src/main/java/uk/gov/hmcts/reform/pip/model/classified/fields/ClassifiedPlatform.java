package uk.gov.hmcts.reform.pip.model.classified.fields;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uk.gov.hmcts.reform.pip.model.enums.Platform;

import javax.persistence.Embeddable;

/**
 * Model which represents a classified platform.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Embeddable
public class ClassifiedPlatform extends ClassifiedField {

    private Platform value;

}
