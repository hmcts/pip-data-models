package uk.gov.hmcts.reform.pip.model.enums;

public enum UserActions {
    UPLOAD("Uploaded"),
    REMOVE("Removed"),
    CREATE_ACCOUNT("Created account for:"),
    REMOVE_ACCOUNT("Removed account for:"),
    APPROVE_MEDIA("Approved media request"),
    REJECT_MEDIA("Rejected media request");

    public final String actionLog;

    UserActions(String actionLog) {
        this.actionLog = actionLog;
    }
}
