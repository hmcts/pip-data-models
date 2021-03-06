package uk.gov.hmcts.reform.pip.model;

import lombok.Builder;
import lombok.Data;
import uk.gov.hmcts.reform.pip.constants.Constants;
import uk.gov.hmcts.reform.pip.model.classified.fields.ClassifiedPlatform;
import uk.gov.hmcts.reform.pip.model.classified.fields.ClassifiedString;
import uk.gov.hmcts.reform.pip.model.enums.Classification;

import java.util.List;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Id;

/**
 * This class displays details about the hearing.
 */
@Data
@Builder
public class Hearing {

    @Id
    private Long hearingId;

    private Classification classification;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = Constants.VALUE, column = @Column(name = "caseName")),
        @AttributeOverride(name = Constants.CLASSIFICATION, column = @Column(name = "caseName_classification")),
    })
    private ClassifiedString caseName;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = Constants.VALUE, column = @Column(name = "caseId")),
        @AttributeOverride(name = Constants.CLASSIFICATION, column = @Column(name = "caseId_classification")),
    })
    private ClassifiedString caseId;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = Constants.VALUE, column = @Column(name = "offence")),
        @AttributeOverride(name = Constants.CLASSIFICATION, column = @Column(name = "offence_classification")),
    })
    private ClassifiedString offence;

    private List<Entity> entities;

    private HearingTime hearingTime;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = Constants.VALUE, column = @Column(name = "urn")),
        @AttributeOverride(name = Constants.CLASSIFICATION, column = @Column(name = "urn_classification")),
    })
    private ClassifiedString urn;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = Constants.VALUE, column = @Column(name = "platform")),
        @AttributeOverride(name = Constants.CLASSIFICATION, column = @Column(name = "judge_classification")),
    })
    private ClassifiedPlatform platform;

}
