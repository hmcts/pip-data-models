package uk.gov.hmcts.reform.pip.model.enums;

public enum UserActions {
    UPLOAD("Uploaded"),
    REMOVE("Removed"),
    CREATE_ACCOUNT("Created account for:"),
    REMOVE_ACCOUNT("Removed account for:"),
    APPROVE_MEDIA("Approved media request"),
    REJECT_MEDIA("Rejected media request"),
    LOCATION_UPLOAD("Uploaded locations"),
    CREATE_SUBSCRIPTION("Created subscription"),
    DELETE_SUBSCRIPTION("Deleted subscription"),
    UPDATE_LIST_TYPE_LOCATION_SUBSCRIPTION("Update list type for location subscription"),
    CREATE_MEDIA_APPLICATION("Create media application"),
    UPDATE_MEDIA_APPLICATION("Update media application"),
    DELETE_MEDIA_APPLICATION("Delete media application"),
    ADD_LOCATION_METADATA("Add location metadata"),
    DELETE_LOCATION_METADATA("Delete location metadata"),
    UPDATE_LOCATION_METADATA("Update location metadata");

    public final String actionLog;

    UserActions(String actionLog) {
        this.actionLog = actionLog;
    }
}
