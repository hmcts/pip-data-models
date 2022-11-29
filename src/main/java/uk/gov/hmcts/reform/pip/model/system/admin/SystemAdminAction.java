package uk.gov.hmcts.reform.pip.model.system.admin;

import lombok.Getter;

import java.util.List;

/**
 * Abstract Class which represents a system admin action.
 */
@Getter
public abstract class SystemAdminAction {

    /**
     * The name of the requester for the action.
     */
    protected String requesterName;

    /**
     * Whether the action was successful.
     */
    protected ActionResult actionResult;

    /**
     * The type of change that has been requested.
     */
    protected ChangeType changeType;

    /**
     * The list of users to notify about the email.
     */
    protected List<String> emailList;

    /**
     * Abstract method that all actions should implement, which details the system admin change that has taken place.
     * @return A string that can be passed to notify to detail the change that has taken place.
     */
    public abstract String createAdditionalChangeDetail();

}
