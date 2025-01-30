package uk.gov.hmcts.reform.pip.model.report;

import org.junit.jupiter.api.Test;
import uk.gov.hmcts.reform.pip.model.subscription.Channel;
import uk.gov.hmcts.reform.pip.model.subscription.SearchType;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static uk.gov.hmcts.reform.pip.model.subscription.SearchType.CASE_ID;

class AllSubscriptionMiDataTest {

    private static final UUID SUBSCRIPTION_ID = UUID.randomUUID();
    private static final UUID USER_ID = UUID.randomUUID();
    private static final Channel EMAIL_CHANNEL = Channel.EMAIL;
    private static final SearchType SEARCH_TYPE = CASE_ID;
    private static final LocalDateTime CREATED_DATE = LocalDateTime.of(2022, 1, 19, 13, 45, 50);
    private static final String LOCATION_NAME = "Location";

    private static final AllSubscriptionMiData ALL_SUBS_MI_RECORD = new AllSubscriptionMiData(
        SUBSCRIPTION_ID, EMAIL_CHANNEL, SEARCH_TYPE, USER_ID.toString(), LOCATION_NAME, CREATED_DATE
    );

    @Test
    void testGetHeaders() {
        assertThat(ALL_SUBS_MI_RECORD.generateReportHeaders())
            .containsExactly("id", "channel", "search_type", "user_id", "court_name", "created_date");
    }


    @Test
    void testGetData() {
        assertThat(ALL_SUBS_MI_RECORD.generateReportData())
            .containsExactly(SUBSCRIPTION_ID.toString(), EMAIL_CHANNEL.toString(),
                             SEARCH_TYPE.toString(), USER_ID.toString(), LOCATION_NAME, "2022-01-19 13:45:50");
    }

}
