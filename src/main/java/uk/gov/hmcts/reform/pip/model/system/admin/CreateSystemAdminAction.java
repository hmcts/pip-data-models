package uk.gov.hmcts.reform.pip.model.system.admin;

/**
 * A specific model which represents the create system admin action.
 */
public class CreateSystemAdminAction extends SystemAdminAction {

    /**
     * The email address of the account that's trying to be created.
     */
    private String accountEmail;

    public CreateSystemAdminAction() {
        this.changeType = ChangeType.ADD_USER;
    }

    @Override
    public String createAdditionalChangeDetail() {
        return String.format("Attempted to create account for: %s", this.accountEmail);
    }
}
