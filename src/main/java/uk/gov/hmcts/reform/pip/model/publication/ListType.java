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
public enum ListType {
    SJP_PUBLIC_LIST(NATIONAL, PI_AAD, ALL_VERIFIED_THIRD_PARTY_PRESS_ROLES, null,
                    "SJP Public List (Full list)", true, false, false),
    SJP_DELTA_PUBLIC_LIST(NATIONAL, PI_AAD, ALL_VERIFIED_THIRD_PARTY_PRESS_ROLES, SJP_PUBLIC_LIST,
                          "SJP Public List (New cases)", true, false, false),
    SJP_PRESS_LIST(NATIONAL, PI_AAD, ALL_VERIFIED_THIRD_PARTY_PRESS_ROLES, null,
                   "SJP Press List (Full list)", true, false, false),
    SJP_DELTA_PRESS_LIST(NATIONAL, PI_AAD, ALL_VERIFIED_THIRD_PARTY_PRESS_ROLES, SJP_PRESS_LIST,
                         "SJP Press List (New cases)", true, false, false),
    SJP_PRESS_REGISTER(NATIONAL, PI_AAD, ALL_VERIFIED_THIRD_PARTY_PRESS_ROLES),
    CROWN_DAILY_LIST(VENUE, CRIME_IDAM, ALL_VERIFIED_THIRD_PARTY_CRIME_ROLES, true),
    CROWN_FIRM_LIST(VENUE, CRIME_IDAM, ALL_VERIFIED_THIRD_PARTY_CRIME_ROLES, true),
    CROWN_WARNED_LIST(VENUE, CRIME_IDAM, ALL_VERIFIED_THIRD_PARTY_CRIME_ROLES, true),
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
                                        SSCS_DAILY_LIST, "SSCS Daily List - Additional Hearings"),
    IAC_DAILY_LIST(VENUE, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    IAC_DAILY_LIST_ADDITIONAL_CASES(VENUE, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                                    IAC_DAILY_LIST, "IAC Daily List - Additional Cases"),
    CARE_STANDARDS_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES, true),
    PRIMARY_HEALTH_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES, true),
    CIC_DAILY_HEARING_LIST(VENUE, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES, true),
    CST_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    PHT_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    GRC_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    WPAFCC_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    UT_IAC_JR_LONDON_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
        "Upper Tribunal (Immigration and Asylum) Chamber - Judicial Review: London Daily Hearing List"),
    UT_IAC_JR_LEEDS_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
       "Upper Tribunal (Immigration and Asylum) Chamber - Judicial Review: Leeds Daily Hearing List"),
    UT_IAC_JR_MANCHESTER_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
        UT_IAC_JR_LEEDS_DAILY_HEARING_LIST,
        "Upper Tribunal (Immigration and Asylum) Chamber - Judicial Review: Manchester Daily Hearing List"),
    UT_IAC_JR_BIRMINGHAM_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
        UT_IAC_JR_LEEDS_DAILY_HEARING_LIST,
        "Upper Tribunal (Immigration and Asylum) Chamber - Judicial Review: Birmingham Daily Hearing List"),
    UT_IAC_JR_CARDIFF_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
         UT_IAC_JR_LEEDS_DAILY_HEARING_LIST,
        "Upper Tribunal (Immigration and Asylum) Chamber - Judicial Review: Bristol and Cardiff Daily Hearing List"),
    UT_IAC_STATUTORY_APPEALS_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    SIAC_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                             "Special Immigration Appeals Commission Weekly Hearing List"),
    POAC_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                             SIAC_WEEKLY_HEARING_LIST,
                             "Proscribed Organisations Appeal Commission Weekly Hearing List"),
    PAAC_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                             SIAC_WEEKLY_HEARING_LIST, "Pathogens Access Appeal Commission Weekly Hearing List"),
    FTT_TAX_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    FTT_LR_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    UT_T_AND_CC_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    UT_LC_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    UT_AAC_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    RPT_LONDON_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                           "First-tier Tribunal (Residential Property Tribunal): London region Weekly Hearing List"),
    RPT_EASTERN_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
        RPT_LONDON_WEEKLY_HEARING_LIST, "First-tier Tribunal (Residential Property Tribunal): Eastern "
                            + "region Weekly Hearing List"),
    RPT_MIDLANDS_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
        RPT_LONDON_WEEKLY_HEARING_LIST, "First-tier Tribunal (Residential Property Tribunal): Midlands region "
                             + "Weekly Hearing List"),
    RPT_NORTHERN_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
        RPT_LONDON_WEEKLY_HEARING_LIST, "First-tier Tribunal (Residential Property Tribunal): Northern region "
                             + "Weekly Hearing List"),
    RPT_SOUTHERN_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
        RPT_LONDON_WEEKLY_HEARING_LIST, "First-tier Tribunal (Residential Property Tribunal): "
                             + "Southern region Weekly Hearing List"),
    AST_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    SSCS_MIDLANDS_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
         "Midlands Social Security and Child Support Tribunal Daily Hearing List"),
    SSCS_SOUTH_EAST_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
        SSCS_MIDLANDS_DAILY_HEARING_LIST,
        "South East Social Security and Child Support Tribunal Daily Hearing List"),
    SSCS_WALES_AND_SOUTH_WEST_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
        SSCS_MIDLANDS_DAILY_HEARING_LIST,
        "Wales and South West Social Security and Child Support Tribunal Daily Hearing List"),
    SSCS_SCOTLAND_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
        SSCS_MIDLANDS_DAILY_HEARING_LIST,
        "Scotland Social Security and Child Support Tribunal Daily Hearing List"),
    SSCS_NORTH_EAST_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
        SSCS_MIDLANDS_DAILY_HEARING_LIST,
        "North East Social Security and Child Support Tribunal Daily Hearing List"),
    SSCS_NORTH_WEST_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
        SSCS_MIDLANDS_DAILY_HEARING_LIST,
        "North West Social Security and Child Support Tribunal Daily Hearing List"),
    SSCS_LONDON_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
        SSCS_MIDLANDS_DAILY_HEARING_LIST,
        "London Social Security and Child Support Tribunal Daily Hearing List"),
    MENTAL_HEALTH_TRIBUNAL_HEARING_LIST(NATIONAL, PI_AAD, ALL_VERIFIED_THIRD_PARTY_PRESS_ROLES, null,
        "Mental Health Tribunal Daily Hearing List", true, false, false),
    LONDON_ADMINISTRATIVE_COURT_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    COUNTY_COURT_LONDON_CIVIL_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                                               "County Court at Central London Civil Daily Cause List"),
    CIVIL_COURTS_RCJ_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                                     "Civil Courts at the RCJ Daily Cause List"),
    COURT_OF_APPEAL_CRIMINAL_DAILY_CAUSE_LIST(NATIONAL, CRIME_IDAM, ALL_VERIFIED_THIRD_PARTY_CRIME_ROLES,
                                              "Court of Appeal (Criminal Division) Daily Cause List"),
    FAMILY_DIVISION_HIGH_COURT_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                                                "Family Division of the High Court Daily Cause List"),
    KINGS_BENCH_DIVISION_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                                          "King’s Bench Division Daily Cause List"),
    KINGS_BENCH_MASTERS_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                                         "King’s Bench Masters Daily Cause List"),
    SENIOR_COURTS_COSTS_OFFICE_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    MAYOR_AND_CITY_CIVIL_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                                          "Mayor & City Civil Daily Cause List"),
    INTERIM_APPLICATIONS_CHD_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                  "Interim Applications List (ChD) Daily Cause List"),
    INTELLECTUAL_PROPERTY_AND_ENTERPRISE_COURT_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
        "Intellectual Property and Enterprise Court (ChD) Daily Cause List"
    ),
    INTELLECTUAL_PROPERTY_LIST_CHD_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                                                    "Intellectual Property List (ChD) Daily Cause List"),
    LONDON_CIRCUIT_COMMERCIAL_COURT_KB_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                                                        "London Circuit Commercial Court (KB) Daily Cause List"),
    PATENTS_COURT_CHD_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                                        "Patents Court (ChD) Daily Cause List"),
    PENSIONS_LIST_CHD_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                                       "Pensions List (ChD) Daily Cause List"),
    PROPERTY_TRUSTS_PROBATE_LIST_CHD_DAILY_CAUSE_LIST(
        NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES, PENSIONS_LIST_CHD_DAILY_CAUSE_LIST,
        "Property, Trusts and Probate List (ChD) Daily Cause List"),
    REVENUE_LIST_CHD_DAILY_CAUSE_LIST(
        NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES, PENSIONS_LIST_CHD_DAILY_CAUSE_LIST,
        "Revenue List (ChD) Daily Cause List"),
    TECHNOLOGY_AND_CONSTRUCTION_COURT_KB_DAILY_CAUSE_LIST(
        NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES, null,
        "Technology and Construction Court (KB) Daily Cause List"),
    ADMIRALTY_COURT_KB_DAILY_CAUSE_LIST(
        NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES, "Admiralty Court (KB) Daily Cause List"),
    BUSINESS_LIST_CHD_DAILY_CAUSE_LIST(
        NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES, "Business List (ChD) Daily Cause List"),
    CHANCERY_APPEALS_CHD_DAILY_CAUSE_LIST(
        NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES, "Chancery Appeals (ChD) Daily Cause List"),
    COMMERCIAL_COURT_KB_DAILY_CAUSE_LIST(
        NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES, "Commercial Court (KB) Daily Cause List"),
    COMPANIES_WINDING_UP_CHD_DAILY_CAUSE_LIST(
        NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES, "Companies Winding Up (ChD) Daily Cause List"),
    COMPETITION_LIST_CHD_DAILY_CAUSE_LIST(
        NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES, BUSINESS_LIST_CHD_DAILY_CAUSE_LIST,
        "Competition List (ChD) Daily Cause List"),
    FINANCIAL_LIST_CHD_KB_DAILY_CAUSE_LIST(
        NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES, "Financial List (ChD/KB) Daily Cause List"),
    INSOLVENCY_AND_COMPANIES_COURT_CHD_DAILY_CAUSE_LIST(
        NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES, "Insolvency & Companies Court (ChD) Daily Cause List"),
    COURT_OF_APPEAL_CIVIL_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                                           "Court of Appeal (Civil Division) Daily Cause List"),
    BIRMINGHAM_ADMINISTRATIVE_COURT_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    BRISTOL_AND_CARDIFF_ADMINISTRATIVE_COURT_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
          BIRMINGHAM_ADMINISTRATIVE_COURT_DAILY_CAUSE_LIST,
            "Bristol and Cardiff Administrative Court Daily Cause List"),
    MANCHESTER_ADMINISTRATIVE_COURT_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
            BIRMINGHAM_ADMINISTRATIVE_COURT_DAILY_CAUSE_LIST, "Manchester Administrative Court Daily Cause List"),
    LEEDS_ADMINISTRATIVE_COURT_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    PCOL_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    SEND_DAILY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                            "First-tier Tribunal (Special Educational Needs and Disability) Daily Hearing List"),
    CIC_WEEKLY_HEARING_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES),
    MAGISTRATES_ADULT_COURT_LIST_DAILY(VENUE, CRIME_IDAM, ALL_VERIFIED_THIRD_PARTY_CRIME_ROLES,
                                       "Magistrates Adult Court List - Daily"),
    MAGISTRATES_ADULT_COURT_LIST_FUTURE(VENUE, CRIME_IDAM, ALL_VERIFIED_THIRD_PARTY_CRIME_ROLES,
                                        MAGISTRATES_ADULT_COURT_LIST_DAILY, "Magistrates Adult Court List - Future"),
    MAGISTRATES_PUBLIC_ADULT_COURT_LIST_DAILY(VENUE, CRIME_IDAM,
        ALL_VERIFIED_THIRD_PARTY_CRIME_ROLES, "Magistrates Public Adult Court List - Daily"),
    MAGISTRATES_PUBLIC_ADULT_COURT_LIST_FUTURE(VENUE, CRIME_IDAM, ALL_VERIFIED_THIRD_PARTY_CRIME_ROLES,
        MAGISTRATES_PUBLIC_ADULT_COURT_LIST_DAILY,"Magistrates Public Adult Court List - Future"),
    CROWN_DAILY_PDDA_LIST(VENUE, CRIME_IDAM, ALL_VERIFIED_THIRD_PARTY_CRIME_ROLES),
    CROWN_FIRM_PDDA_LIST(VENUE, CRIME_IDAM, ALL_VERIFIED_THIRD_PARTY_CRIME_ROLES),
    CROWN_WARNED_PDDA_LIST(VENUE, CRIME_IDAM, ALL_VERIFIED_THIRD_PARTY_CRIME_ROLES),
    HIGH_COURT_CIVIL_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                               "High Court Civil Daily Cause List"),
    HIGH_COURT_FAMILY_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                                "High Court Family Daily Cause List"),
    BUSINESS_AND_PROPERTY_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                                  "Business & Property Daily Cause List"),
    CIRCUIT_COMMERCIAL_COURT_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                                      "Circuit Commercial Court Daily Cause List"),
    TECHNOLOGY_AND_CONSTRUCTION_COURT_DAILY_CAUSE_LIST(NATIONAL, CFT_IDAM, ALL_VERIFIED_THIRD_PARTY_CFT_ROLES,
                                        "Technology and Construction Court Daily Cause List");

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
    private boolean hasAdditionalPdf = true;

    /**
     * Flag to indicate whether the list type is deprecated and no longer in use.
     */
    private boolean isDeprecated;

    ListType(LocationType listLocationLevel, UserProvenances allowedProvenance, List<Roles> allowedThirdPartyRoles) {
        this.listLocationLevel = listLocationLevel;
        this.allowedProvenance = allowedProvenance;
        this.allowedThirdPartyRoles = allowedThirdPartyRoles;
    }

    ListType(LocationType listLocationLevel, UserProvenances allowedProvenance,
             List<Roles> allowedThirdPartyRoles, boolean isDeprecated) {
        this(listLocationLevel, allowedProvenance, allowedThirdPartyRoles);
        this.isDeprecated = isDeprecated;
    }

    ListType(LocationType listLocationLevel, UserProvenances allowedProvenance,
             List<Roles> allowedThirdPartyRoles, String friendlyName) {
        this(listLocationLevel, allowedProvenance, allowedThirdPartyRoles);
        this.friendlyName = friendlyName;
    }

    ListType(LocationType listLocationLevel, UserProvenances allowedProvenance,
             List<Roles> allowedThirdPartyRoles, ListType parentListType, String friendlyName) {
        this(listLocationLevel, allowedProvenance, allowedThirdPartyRoles, friendlyName);
        this.parentListType = parentListType;
    }

    public String getFriendlyName() {
        return friendlyName == null ? ListTypeHelper.buildFriendlyName(this) : friendlyName;
    }
}
