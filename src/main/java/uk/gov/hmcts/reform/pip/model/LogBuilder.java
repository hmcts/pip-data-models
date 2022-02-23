package uk.gov.hmcts.reform.pip.model;

import uk.gov.hmcts.reform.pip.model.enums.UserActions;

import java.time.LocalDateTime;

public final class LogBuilder {

    private LogBuilder() {

    }

    public static String writeLog(String actioningUserEmail, UserActions userAction, String actionValue) {
        return String.format("Track: %s, %s %s, at %s", actioningUserEmail, userAction.actionLog, actionValue,
                             LocalDateTime.now());
    }
}
