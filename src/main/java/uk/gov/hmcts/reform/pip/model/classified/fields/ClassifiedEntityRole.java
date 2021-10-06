package uk.gov.hmcts.reform.pip.model.classified.fields;

import lombok.Data;
import lombok.EqualsAndHashCode;
import uk.gov.hmcts.reform.pip.model.enums.EntityRole;

import javax.persistence.Embeddable;

/**
 * Model which represents a classified entity role.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Embeddable
public class ClassifiedEntityRole extends ClassifiedField {

    private EntityRole value;

}
