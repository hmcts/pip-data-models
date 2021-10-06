package uk.gov.hmcts.reform.pip.model;

import lombok.Builder;
import lombok.Data;
import uk.gov.hmcts.reform.pip.model.enums.Classification;
import uk.gov.hmcts.reform.pip.model.enums.PublicationType;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Id;

/**
 * This class displays details about the publication.
 */
@Data
@Builder
public class Publication {

    @Id
    private Long publicationId;

    private String courtHouseType;

    private int courtId;

    private PublicationType publicationType;

    private Classification classification;

    private LocalDate date;

    private GroupedDates displayFrom;

    private GroupedDates displayTo;

    private GroupedDates retentionTo;

    private List<CourtRoom> courtRooms;

}
