package uk.gov.hmcts.reform.pip.model;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Id;

/**
 * This class displays details about the publication.
 */
@Data
public class Publication {

    @Id
    private Long publicationId;

    private String courtHouseType;

    private int courtId;

    private String publicationType;

    private String classification;

    private LocalDate date;

    private GroupedDates displayFrom;

    private GroupedDates displayTo;

    private GroupedDates retentionTo;

    private List<CourtRoom> courtRooms;

}
