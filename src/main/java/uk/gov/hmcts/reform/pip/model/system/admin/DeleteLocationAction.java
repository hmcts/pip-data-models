package uk.gov.hmcts.reform.pip.model.system.admin;

/**
 * A specific model which represents the delete location action.
 */
public class DeleteLocationAction extends SystemAdminAction {

    /**
     * The details about the delete location action.
     */
    private String detailString;

    public DeleteLocationAction() {
        super();
        this.changeType = ChangeType.DELETE_LOCATION;
    }

    @Override
    public String createAdditionalChangeDetail() {
        return detailString;
    }
}
