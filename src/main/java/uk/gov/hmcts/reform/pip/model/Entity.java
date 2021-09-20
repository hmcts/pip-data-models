package uk.gov.hmcts.reform.pip.model;

import lombok.Builder;
import lombok.Data;
import uk.gov.hmcts.reform.pip.constants.Constants;
import uk.gov.hmcts.reform.pip.model.classified.fields.ClassifiedString;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Id;

/**
 * This class displays details about an entity in the hearing.
 */
@Data
@Builder
public class Entity {

    @Id
    private Integer entityId;

    private String classification;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = Constants.VALUE, column = @Column(name = "name")),
        @AttributeOverride(name = Constants.CLASSIFICATION, column = @Column(name = "name_classification")),
    })
    private ClassifiedString name;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = Constants.VALUE, column = @Column(name = "type")),
        @AttributeOverride(name = Constants.CLASSIFICATION, column = @Column(name = "type_classification")),
    })
    private ClassifiedString type;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = Constants.VALUE, column = @Column(name = "roleType")),
        @AttributeOverride(name = Constants.CLASSIFICATION, column = @Column(name = "roleType_classification")),
    })
    private ClassifiedString roleType;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = Constants.VALUE, column = @Column(name = "role")),
        @AttributeOverride(name = Constants.CLASSIFICATION, column = @Column(name = "role_classification")),
    })
    private ClassifiedString role;
}
