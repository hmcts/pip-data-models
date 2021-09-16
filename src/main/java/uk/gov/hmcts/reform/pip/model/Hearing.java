package uk.gov.hmcts.reform.pip.model;

import uk.gov.hmcts.reform.pip.model.classified.fields.ClassifiedString;

import java.util.List;

/**
 * This class displays details about the hearing.
 */
public class Hearing {

    private Integer hearingId;

    private ClassifiedString caseName;

    private ClassifiedString caseId;

    private ClassifiedString offence;

    private List<Entity> entities;

    private HearingTime hearingTime;

    private ClassifiedString urn;

    private ClassifiedString platform;

}
