package uk.gov.hmcts.reform.pip.model.report;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uk.gov.hmcts.reform.pip.model.subscription.Channel;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

import static uk.gov.hmcts.reform.pip.model.report.MiDataInterface.formatDateTime;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class LocationSubscriptionMiData implements MiDataInterface {

    private UUID id;
    private String searchValue;
    private Channel channel;
    private String userId;
    private String locationName;
    private LocalDateTime createdDate;

    @JsonCreator
    public LocationSubscriptionMiData(
        @JsonProperty("id") UUID id,
        @JsonProperty("searchValue") String searchValue,
        @JsonProperty("channel") Channel channel,
        @JsonProperty("userId") String userId,
        @JsonProperty("locationName") String locationName,
        @JsonProperty("createdDate") LocalDateTime createdDate
    ) {
        this.id = id;
        this.searchValue = searchValue;
        this.channel = channel;
        this.userId = userId;
        this.locationName = locationName;
        this.createdDate = createdDate;
    }

    @Override
    public String[] generateReportHeaders() {
        return new String[] {"id", "search_value", "channel", "user_id", "court_name", "created_date"};
    }

    @Override
    public String[] generateReportData() {
        return new String[] {Objects.toString(id, ""), Objects.toString(searchValue, ""),
            Objects.toString(channel, ""), Objects.toString(userId, ""),
            Objects.toString(locationName, ""), formatDateTime(createdDate)};
    }
}
