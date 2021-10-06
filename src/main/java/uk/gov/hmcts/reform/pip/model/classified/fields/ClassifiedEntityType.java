package uk.gov.hmcts.reform.pip.model.classified.fields;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uk.gov.hmcts.reform.pip.model.enums.EntityType;

import javax.persistence.Embeddable;

/**
 * Model which represents a classified entity type.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Embeddable
public class ClassifiedEntityType extends ClassifiedField {

    private EntityType value;

}
