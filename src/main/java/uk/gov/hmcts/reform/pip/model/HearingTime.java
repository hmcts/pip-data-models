package uk.gov.hmcts.reform.pip.model;

import uk.gov.hmcts.reform.pip.model.classified.fields.ClassifiedLocalDateTime;
import uk.gov.hmcts.reform.pip.model.classified.fields.ClassifiedString;

/**
 * This class displays details about the hearing time
 */
public class HearingTime {

    private ClassifiedLocalDateTime start;

    private ClassifiedLocalDateTime end;

    private ClassifiedString duration;

}
