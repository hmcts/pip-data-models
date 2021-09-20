package uk.gov.hmcts.reform.pip.model;

import lombok.Data;
import uk.gov.hmcts.reform.pip.model.classified.fields.ClassifiedString;

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
public class CourtRoom {

    @Id
    private int courtRoomId;

    private String classification;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "courtRoomName")),
        @AttributeOverride(name = "classification", column = @Column(name = "courtRoomName_classification")),
    })
    private ClassifiedString courtRoomName;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "session")),
        @AttributeOverride(name = "classification", column = @Column(name = "session_classification")),
    })
    private ClassifiedString session;

    private Judiciary judiciary;

    @Embedded
    @AttributeOverrides({
        @AttributeOverride(name = "value", column = @Column(name = "sessionType")),
        @AttributeOverride(name = "classification", column = @Column(name = "sessionType_classification")),
    })
    private ClassifiedString sessionType;

    private List<Hearing> hearings;

}
