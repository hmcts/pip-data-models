package uk.gov.hmcts.reform.pip.model.subscription;

/**
 * This determines the type of search or addition we are using.
 */
public enum SearchType {
    LOCATION_ID,
    CASE_NUMBER,
    CASE_NAME,
    CASE_ID, // Deprecated, use CASE_NUMBER instead
    CASE_URN, // Deprecated, use CASE_NUMBER instead
    LIST_TYPE
}
