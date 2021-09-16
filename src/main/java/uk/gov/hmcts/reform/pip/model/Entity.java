package uk.gov.hmcts.reform.pip.model;

import uk.gov.hmcts.reform.pip.model.classified.fields.ClassifiedString;

/**
 * This class displays details about an entity in the hearing.
 */
public class Entity {

    private Integer entityId;

    private ClassifiedString name;

    private ClassifiedString type;

    private ClassifiedString roleType;

    private ClassifiedString role;
}
