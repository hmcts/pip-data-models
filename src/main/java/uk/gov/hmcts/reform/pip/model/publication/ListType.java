package uk.gov.hmcts.reform.pip.model.publication;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;
import uk.gov.hmcts.reform.pip.model.account.Roles;
import uk.gov.hmcts.reform.pip.model.account.UserProvenances;
import uk.gov.hmcts.reform.pip.model.location.LocationType;
import uk.gov.hmcts.reform.pip.model.publication.helpers.ListTypeHelper;

import java.util.List;

import static uk.gov.hmcts.reform.pip.model.account.Roles.ALL_VERIFIED_THIRD_PARTY_CFT_ROLES;
import static uk.gov.hmcts.reform.pip.model.account.Roles.ALL_VERIFIED_THIRD_PARTY_CRIME_ROLES;
import static uk.gov.hmcts.reform.pip.model.account.Roles.ALL_VERIFIED_THIRD_PARTY_PRESS_ROLES;
import static uk.gov.hmcts.reform.pip.model.account.UserProvenances.CFT_IDAM;
import static uk.gov.hmcts.reform.pip.model.account.UserProvenances.CRIME_IDAM;
import static uk.gov.hmcts.reform.pip.model.account.UserProvenances.PI_AAD;
import static uk.gov.hmcts.reform.pip.model.location.LocationType.NATIONAL;
import static uk.gov.hmcts.reform.pip.model.location.LocationType.OWNING_HEARING_LOCATION;
import static uk.gov.hmcts.reform.pip.model.location.LocationType.VENUE;

/**
 * Enum that represents the different list types.
 */
@Getter
@AllArgsConstructor
@SuppressWarnings("PMD.ExcessivePublicCount")
public enum ListType {
    SJP_PUBLIC_LIST(NATIONAL, PI_AAD, ALL_VERIFIED_THIRD_PARTY_PRESS_ROLES, null,
                    "SJP Public List (Full list)", true, false),
    SJP_DELTA_PUBLIC_LIST(NATIONAL, PI_AAD, ALL_VERIFIED_THIRD_PARTY_PRESS_ROLES, SJP_PUBLIC_LIST,
                          "SJP Public List (New cases)", true, false),
    SJP_PRESS_LIST(NATIONAL, PI_AAD, ALL_VERIFIED_THIRD_PARTY_PRESS_ROLES, null,
                   "SJP Press List (Full list)", true, false),
    SJP_DELTA_PRESS_LIST(NATIONAL, PI_AAD, ALL_VERIFIED_THIRD_PARTY_PRESS_ROLES, SJP_PRESS_LIST,
                         "SJP Press List (New cases)", true, false),
    SJP_PRESS_REGISTER(NATIONAL, PI_AAD, ALL_VERIFIED_THIRD_PARTY_PRESS_ROLES),
    CROWN_DAILY_LIST(VENUE, CRIME_IDAM, ALL_VERIFIED_THIRD_PARTY_CRIME_ROLES),
    CROWN_FIRM_LIST(VENUE, CRIME_IDAM, ALL_VERIFIED_THIRD_PARTY_CRIME_ROLES),
    CROWN_WARNED_LIST(VENUE, CRIME_IDAM, ALL_VERIFIED_THIRD_PARTY_CRIME_ROLES),
    MAGISTRATES_PUBLIC_LIST(VENUE, CRIME_IDAM, ALL_VERIFIED_THIRD_PARTY_CRIME_ROLES),
    MAGISTRATES_STANDARD_LIST(VENUE, CRIME_IDAM, ALL_VERIFIED_THIRD_PARTY_CRIME_ROLES),
    CIVIL_DAILY_CAUSE_LIST(VENUE, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    FAMILY_DAILY_CAUSE_LIST(VENUE, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    CIVIL_AND_FAMILY_DAILY_CAUSE_LIST(VENUE, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    COP_DAILY_CAUSE_LIST(VENUE, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    ET_FORTNIGHTLY_PRESS_LIST(OWNING_HEARING_LOCATION, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    ET_DAILY_LIST(OWNING_HEARING_LOCATION, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    SSCS_DAILY_LIST(OWNING_HEARING_LOCATION, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    SSCS_DAILY_LIST_ADDITIONAL_HEARINGS(OWNING_HEARING_LOCATION, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                                        SSCS_DAILY_LIST, "SSCS Daily List - Additional Hearings", false, true),
    IAC_DAILY_LIST(VENUE, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    IAC_DAILY_LIST_ADDITIONAL_CASES(VENUE, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                                    IAC_DAILY_LIST, "IAC Daily List - Additional Cases", false, true),
    CARE_STANDARDS_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    PRIMARY_HEALTH_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    OPA_PRESS_LIST(VENUE, PI_AAD, ALL_VERIFIED_THIRD_PARTY_PRESS_ROLES, null, null, true, false),
    OPA_PUBLIC_LIST(VENUE, PI_AAD, ALL_VERIFIED_THIRD_PARTY_PRESS_ROLES),
    OPA_RESULTS(VENUE, PI_AAD, ALL_VERIFIED_THIRD_PARTY_PRESS_ROLES),
    CIC_DAILY_HEARING_LIST(VENUE, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    CST_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    PHT_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    GRC_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    WPAFCC_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    UT_IAC_JR_LONDON_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES, null,
        "Upper Tribunal (Immigration and Asylum) Chamber - Judicial Review: London Daily Hearing List",
            false, true),
    UT_IAC_JR_MANCHESTER_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
        UT_IAC_JR_LONDON_DAILY_HEARING_LIST,
        "Upper Tribunal (Immigration and Asylum) Chamber - Judicial Review: Manchester Daily Hearing List",
        false, true),
    UT_IAC_JR_BIRMINGHAM_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
        UT_IAC_JR_LONDON_DAILY_HEARING_LIST,
        "Upper Tribunal (Immigration and Asylum) Chamber - Judicial Review: Birmingham Daily Hearing List",
        false, true),
    UT_IAC_JR_CARDIFF_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
        UT_IAC_JR_LONDON_DAILY_HEARING_LIST,
        "Upper Tribunal (Immigration and Asylum) Chamber - Judicial Review: Cardiff Daily Hearing List",
        false, true),
    UT_IAC_STATUTORY_APPEALS_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    SIAC_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                             null, "Special Immigration Appeals Commission Weekly Hearing List",
                             false, true),
    POAC_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                             SIAC_WEEKLY_HEARING_LIST,
                             "Proscribed Organisations Appeal Commission Weekly Hearing List",
                             false, true),
    PAAC_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                             SIAC_WEEKLY_HEARING_LIST, "Pathogens Access Appeal Commission Weekly Hearing List ",
                             false, true),
    FTT_TAX_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    FTT_LR_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    UT_T_AND_CC_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    UT_LC_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    UT_AAC_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    RPT_LONDON_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                                   null, "Residential Property Tribunal: London Region Weekly Hearing List",
                                   false, true),
    RPT_EASTERN_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
        RPT_LONDON_WEEKLY_HEARING_LIST, "Residential Property Tribunal: Eastern Region Weekly Hearing List",
                                    false, true),
    RPT_MIDLANDS_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
        RPT_LONDON_WEEKLY_HEARING_LIST, "Residential Property Tribunal: Midlands Region Weekly Hearing List",
                                     false, true),
    RPT_NORTHERN_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
        RPT_LONDON_WEEKLY_HEARING_LIST, "Residential Property Tribunal: Northern Region Weekly Hearing List",
                                     false, true),
    RPT_SOUTHERN_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
        RPT_LONDON_WEEKLY_HEARING_LIST, "Residential Property Tribunal: Southern Region Weekly Hearing List",
                                     false, true);

    /**
     * Flag that represents the Location Type level the list displays at.
     */
    private final LocationType listLocationLevel;

    /**
     * Allowed user provenance for accessing the list.
     */
    private final UserProvenances allowedProvenance;

    /**
     * Allowed third party roles for accessing the list.
     */
    private final List<Roles> allowedThirdPartyRoles;

    /**
     * Indicates the parent list type where this list type is based on.
     */
    private ListType parentListType;

    /**
     * Friendly name of the list if it is different to the list type name.
     */
    private String friendlyName;

    @Accessors(fluent = true)
    private boolean hasExcel;

    @Accessors(fluent = true)
    @SuppressWarnings("PMD.ImmutableField")
    private boolean hasAdditionalPdf = true;

    ListType(LocationType listLocationLevel, UserProvenances allowedProvenance, List<Roles> allowedThirdPartyRoles) {
        this.listLocationLevel = listLocationLevel;
        this.allowedProvenance = allowedProvenance;
        this.allowedThirdPartyRoles = allowedThirdPartyRoles;
    }

    public String getFriendlyName() {
        return friendlyName == null ? ListTypeHelper.buildFriendlyName(this) : friendlyName;
    }
}
