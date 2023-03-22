package uk.gov.hmcts.reform.pip.model.publication;

import lombok.AllArgsConstructor;
import lombok.Getter;
import uk.gov.hmcts.reform.pip.model.location.LocationType;

/**
 * Enum that represents the different list types.
 */
@Getter
@AllArgsConstructor
public enum ListType {
    SJP_PUBLIC_LIST(LocationType.NATIONAL),
    SJP_PRESS_LIST(LocationType.NATIONAL),
    SJP_PRESS_REGISTER(LocationType.NATIONAL),
    CROWN_DAILY_LIST(LocationType.VENUE),
    CROWN_FIRM_LIST(LocationType.VENUE),
    CROWN_WARNED_LIST(LocationType.VENUE),
    MAGISTRATES_PUBLIC_LIST(LocationType.VENUE),
    MAGISTRATES_STANDARD_LIST(LocationType.VENUE),
    CIVIL_DAILY_CAUSE_LIST(LocationType.VENUE),
    FAMILY_DAILY_CAUSE_LIST(LocationType.VENUE),
    CIVIL_AND_FAMILY_DAILY_CAUSE_LIST(LocationType.VENUE),
    COP_DAILY_CAUSE_LIST(LocationType.VENUE),
    ET_FORTNIGHTLY_PRESS_LIST(LocationType.OWNING_HEARING_LOCATION),
    ET_DAILY_LIST(LocationType.OWNING_HEARING_LOCATION),
    SSCS_DAILY_LIST(LocationType.OWNING_HEARING_LOCATION),
    SSCS_DAILY_LIST_ADDITIONAL_HEARINGS(LocationType.OWNING_HEARING_LOCATION, SSCS_DAILY_LIST),
    IAC_DAILY_LIST(LocationType.VENUE),
    CARE_STANDARDS_LIST(LocationType.NATIONAL),
    PRIMARY_HEALTH_LIST(LocationType.NATIONAL);

    /**
     * Flag that represents the Location Type level the list displays at.
     */
    private final LocationType listLocationLevel;

    /**
     * Indicates the parent list type where this list type is based on.
     */
    private ListType parentListType;

    ListType(LocationType listLocationLevel) {
        this.listLocationLevel = listLocationLevel;
    }

}
