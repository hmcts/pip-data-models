package uk.gov.hmcts.reform.pip.model.system.admin;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DeleteLocationSubscriptionAction extends SystemAdminAction {

    /**
     * The details about the delete location action.
     */
    private String detailString;

    public DeleteLocationSubscriptionAction() {
        super();
        this.changeType = ChangeType.DELETE_LOCATION_SUBSCRIPTION;
    }

    @Override
    public String createAdditionalChangeDetail() {
        return detailString;
    }
}

