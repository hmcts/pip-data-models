package uk.gov.hmcts.reform.pip.model.enums;

/**
 * Enum that contains the different actions that are audited.
 */
public enum AuditAction {
    ATTEMPT_SYSTEM_ADMIN_CREATION,
    ADMIN_CREATION,
    SYSTEM_ADMIN_CREATION,
    REFERENCE_DATA_UPLOAD,
    REFERENCE_DATA_DOWNLOAD,
    VIEW_THIRD_PARTY_USERS,
    MANAGE_THIRD_PARTY_USER_VIEW,
    MANAGE_THIRD_PARTY_USER_SUBSCRIPTIONS,
    THIRD_PARTY_USER_CREATION,
    DELETE_THIRD_PARTY_USER,
    USER_MANAGEMENT_VIEW,
    MANAGE_USER,
    UPDATE_USER,
    DELETE_USER,
    VIEW_BLOB_EXPLORER,
    BULK_MEDIA_UPLOAD,
    DELETE_LOCATION_ATTEMPT,
    DELETE_LOCATION_SUCCESS,
    DELETE_LOCATION_SUBSCRIPTION_SUCCESS,
    DELETE_LOCATION_PUBLICATION_SUCCESS,
    PUBLICATION_UPLOAD,
    DELETE_PUBLICATION,
    APPROVE_MEDIA_APPLICATION,
    REJECT_MEDIA_APPLICATION,
    RESUBMIT_SUBSCRIPTION,
    CREATE_LOCATION_METADATA,
    UPDATE_LOCATION_METADATA,
    DELETE_LOCATION_METADATA
}
