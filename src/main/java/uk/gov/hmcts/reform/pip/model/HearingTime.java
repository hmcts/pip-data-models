package uk.gov.hmcts.reform.pip.model;

import lombok.Data;
import uk.gov.hmcts.reform.pip.constants.Constants;
import uk.gov.hmcts.reform.pip.model.classified.fields.ClassifiedLocalDateTime;
import uk.gov.hmcts.reform.pip.model.classified.fields.ClassifiedString;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Id;

/**
 * This class displays details about the hearing time.
 */
@Data
public class HearingTime {

    @Id
    private Long hearingTimeId;

    private String classification;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = Constants.VALUE, column = @Column(name = "start")),
        @AttributeOverride(name = Constants.CLASSIFICATION, column = @Column(name = "start_classification")),
    })
    private ClassifiedLocalDateTime start;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = Constants.VALUE, column = @Column(name = "end")),
        @AttributeOverride(name = Constants.CLASSIFICATION, column = @Column(name = "end_classification")),
    })
    private ClassifiedLocalDateTime end;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = Constants.VALUE, column = @Column(name = "duration")),
        @AttributeOverride(name = Constants.CLASSIFICATION, column = @Column(name = "duration_classification")),
    })
    private ClassifiedString duration;

}
