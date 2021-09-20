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
 * This class displays details about the judiciary for a court room.
 */
@Data
@Builder
public class Judiciary {

    @Id
    private Long judiciaryId;

    private String classification;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = Constants.VALUE, column = @Column(name = "magistrate")),
        @AttributeOverride(name = Constants.CLASSIFICATION, column = @Column(name = "magistrate_classification")),
    })
    private ClassifiedString magistrate;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = Constants.VALUE, column = @Column(name = "clerk")),
        @AttributeOverride(name = Constants.CLASSIFICATION, column = @Column(name = "clerk_classification")),
    })
    private ClassifiedString clerk;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = Constants.VALUE, column = @Column(name = "judge")),
        @AttributeOverride(name = Constants.CLASSIFICATION, column = @Column(name = "judge_classification")),
    })
    private ClassifiedString judge;

}
