package uk.gov.hmcts.reform.pip.model.system.admin;

/**
 * Class which represents the system admin change type.
 */
public enum ChangeType {
    ADD_USER("Add User"),
    DELETE_LOCATION("Delete Location"),
    DELETE_LOCATION_SUBSCRIPTION("Delete Location Subscription(s)");

    public final String label;

    ChangeType(String label) {
        this.label = label;
    }
}
