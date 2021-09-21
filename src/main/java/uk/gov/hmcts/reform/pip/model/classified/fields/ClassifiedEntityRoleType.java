package uk.gov.hmcts.reform.pip.model.classified.fields;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uk.gov.hmcts.reform.pip.model.enums.EntityRoleType;

import javax.persistence.Embeddable;

/**
 * Model which represents a classified entity role type.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Embeddable
public class ClassifiedEntityRoleType extends ClassifiedField {

    private EntityRoleType value;

}
