package uk.gov.hmcts.reform.pip.model.report;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static uk.gov.hmcts.reform.pip.model.account.Roles.INTERNAL_ADMIN_CTSC;
import static uk.gov.hmcts.reform.pip.model.account.UserProvenances.PI_AAD;

class AccountMiDataTest {

    private static final UUID USER_ID = UUID.randomUUID();
    private static final UUID PROVENANCE_ID = UUID.randomUUID();
    private static final LocalDateTime CREATED_DATE = LocalDateTime.of(2022, 1, 19,
                                                                       13, 45, 50);
    private static final LocalDateTime LAST_SIGNED_IN = LocalDateTime.of(2023,1, 25, 14,
                                                                         22, 43);


    private static final AccountMiData ACCOUNT_MI_RECORD =
        new AccountMiData(USER_ID, PROVENANCE_ID.toString(), PI_AAD, INTERNAL_ADMIN_CTSC, CREATED_DATE, LAST_SIGNED_IN);


    @Test
    void testGetHeaders() {
        assertThat(ACCOUNT_MI_RECORD.getHeaders())
            .containsExactly("userId", "provenanceUserId", "userProvenance", "roles",
                             "createdDate", "lastSignedInDate");
    }


    @Test
    void testGetData() {
        assertThat(ACCOUNT_MI_RECORD.getData())
            .containsExactly(USER_ID.toString(), PROVENANCE_ID.toString(),
                             PI_AAD.toString(), INTERNAL_ADMIN_CTSC.toString(),
                             CREATED_DATE.toString(), LAST_SIGNED_IN.toString());
    }
}
