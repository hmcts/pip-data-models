package uk.gov.hmcts.reform.pip.model.report;

import org.junit.jupiter.api.Test;
import uk.gov.hmcts.reform.pip.model.subscription.Channel;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LocationSubscriptionMiDataTest {

    private static final UUID SUBSCRIPTION_ID = UUID.randomUUID();
    private static final UUID USER_ID = UUID.randomUUID();
    private static final Channel EMAIL_CHANNEL = Channel.EMAIL;
    private static final String SEARCH_VALUE = "SEARCH_VALUE";
    private static final LocalDateTime CREATED_DATE = LocalDateTime.of(2022, 1, 19, 13, 45, 50);
    private static final String LOCATION_NAME = "Location";

    private static final LocationSubscriptionMiData LOCATION_SUBS_MI_RECORD = new LocationSubscriptionMiData(
        SUBSCRIPTION_ID, SEARCH_VALUE, EMAIL_CHANNEL, USER_ID.toString(), LOCATION_NAME, CREATED_DATE
    );

    @Test
    void testGetHeaders() {
        assertThat(LOCATION_SUBS_MI_RECORD.getHeaders())
            .containsExactly("id", "searchValue", "channel", "userId", "locationName", "createdDate");
    }


    @Test
    void testGetData() {
        assertThat(LOCATION_SUBS_MI_RECORD.getData())
            .containsExactly(SUBSCRIPTION_ID.toString(), SEARCH_VALUE, EMAIL_CHANNEL.toString(),
                             USER_ID.toString(), LOCATION_NAME, CREATED_DATE.toString());
    }

}
