package uk.gov.hmcts.reform.pip.model;

import lombok.Builder;
import lombok.Data;
import uk.gov.hmcts.reform.pip.constants.Constants;
import uk.gov.hmcts.reform.pip.model.classified.fields.ClassifiedString;
import uk.gov.hmcts.reform.pip.model.enums.Classification;

import java.util.List;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Id;

/**
 * This class displays details about the court room.
 */
@Data
@Builder
public class CourtRoom {

    @Id
    private Long courtRoomId;

    private Classification classification;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = Constants.VALUE, column = @Column(name = "courtRoomName")),
        @AttributeOverride(name = Constants.CLASSIFICATION, column = @Column(name = "courtRoomName_classification")),
    })
    private ClassifiedString courtRoomName;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = Constants.VALUE, column = @Column(name = "session")),
        @AttributeOverride(name = Constants.CLASSIFICATION, column = @Column(name = "session_classification")),
    })
    private ClassifiedString session;

    private Judiciary judiciary;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = Constants.VALUE, column = @Column(name = "sessionType")),
        @AttributeOverride(name = Constants.CLASSIFICATION, column = @Column(name = "sessionType_classification")),
    })
    private ClassifiedString sessionType;

    private List<Hearing> hearings;

}
