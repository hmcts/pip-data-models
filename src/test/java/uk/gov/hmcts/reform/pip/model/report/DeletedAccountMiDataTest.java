package uk.gov.hmcts.reform.pip.model.report;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static uk.gov.hmcts.reform.pip.model.account.Roles.INTERNAL_ADMIN_CTSC;
import static uk.gov.hmcts.reform.pip.model.account.UserProvenances.PI_AAD;

class DeletedAccountMiDataTest {
    private static final UUID USER_ID = UUID.randomUUID();
    private static final UUID PROVENANCE_ID = UUID.randomUUID();
    private static final LocalDateTime LAST_SIGNED_IN = LocalDateTime.of(2026,1, 25, 14,
                                                                         22, 43);
    private static final LocalDateTime DELETED_DATE = LocalDateTime.of(2026, 6, 19,
                                                                       13, 45, 50);

    private static final DeletedAccountMiData DELETED_ACCOUNT_MI_RECORD = new DeletedAccountMiData(
        USER_ID, PROVENANCE_ID.toString(), PI_AAD, INTERNAL_ADMIN_CTSC, LAST_SIGNED_IN, DELETED_DATE
    );

    @Test
    void testGetHeaders() {
        assertThat(DeletedAccountMiData.generateReportHeaders())
            .containsExactly("user_id", "provenance_user_id", "user_provenance", "roles",
                             "last_signed_in_date", "deleted_date");
    }

    @Test
    void testGetData() {
        assertThat(DELETED_ACCOUNT_MI_RECORD.generateReportData())
            .containsExactly(USER_ID.toString(), PROVENANCE_ID.toString(),
                             PI_AAD.toString(), INTERNAL_ADMIN_CTSC.toString(),
                             "2026-01-25 14:22:43", "2026-06-19 13:45:50");
    }
}
