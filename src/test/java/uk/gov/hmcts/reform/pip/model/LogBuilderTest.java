package uk.gov.hmcts.reform.pip.model;

import org.junit.jupiter.api.Test;
import uk.gov.hmcts.reform.pip.model.enums.UserActions;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static uk.gov.hmcts.reform.pip.model.LogBuilder.writeLog;

class LogBuilderTest {

    private static final String USER_EMAIL = "bob@test.com";
    private static final UserActions USER_ACTION = UserActions.UPLOAD;
    private static final String ACTION_VALUE = "testFile.pdf";
    private static final LocalDateTime NOW = LocalDateTime.now();

    private static final String RETURNED_STRING = String.format("Track: %s, %s %s, at %s", USER_EMAIL,
                                                                USER_ACTION.actionLog, ACTION_VALUE, NOW);

    @Test
    void testWriteLog() {
        assertEquals(RETURNED_STRING.substring(0, RETURNED_STRING.length() -10),
                     writeLog(USER_EMAIL, USER_ACTION, ACTION_VALUE).substring(0, RETURNED_STRING.length() -10),
                     "Returned String should match with date trimmed for testing purposes");
    }
}
