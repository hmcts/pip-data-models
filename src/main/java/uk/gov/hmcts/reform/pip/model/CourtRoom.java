package uk.gov.hmcts.reform.pip.model;

import uk.gov.hmcts.reform.pip.model.classified.fields.ClassifiedString;

import java.util.List;

/**
 * This class displays details about the court room.
 */
public class CourtRoom {

    private int courtRoomId;

    private ClassifiedString courtRoomName;

    private ClassifiedString session;

    private Judiciary judiciary;

    private ClassifiedString sessionType;

    private List<Hearing> hearings;

}
