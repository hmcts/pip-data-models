package uk.gov.hmcts.reform.pip.model;

import java.time.LocalDate;
import java.util.List;

/**
 * This class displays details about the publication
 */
public class Publication {

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
