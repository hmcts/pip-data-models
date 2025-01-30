package uk.gov.hmcts.reform.pip.model.report;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uk.gov.hmcts.reform.pip.model.subscription.Channel;
import uk.gov.hmcts.reform.pip.model.subscription.SearchType;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

import static uk.gov.hmcts.reform.pip.model.report.MiDataInterface.formatDateTime;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class AllSubscriptionMiData implements MiDataInterface {

    private UUID id;
    private Channel channel;
    private SearchType searchType;
    private String userId;
    private String locationName;
    private LocalDateTime createdDate;

    @JsonCreator
    public AllSubscriptionMiData(
        @JsonProperty("id") UUID id,
        @JsonProperty("channel") Channel channel,
        @JsonProperty("searchType") SearchType searchType,
        @JsonProperty("userId") String userId,
        @JsonProperty("locationName") String locationName,
        @JsonProperty("createdDate") LocalDateTime createdDate
    ) {
        this.id = id;
        this.channel = channel;
        this.searchType = searchType;
        this.userId = userId;
        this.locationName = locationName;
        this.createdDate = createdDate;
    }

    @Override
    public String[] generateReportHeaders() {
        return new String[] {"id", "channel", "search_type", "user_id", "court_name", "created_date"};
    }

    @Override
    public String[] generateReportData() {
        return new String[] {Objects.toString(id, ""), Objects.toString(channel, ""),
            Objects.toString(searchType, ""), Objects.toString(userId, ""),
            Objects.toString(locationName, ""), formatDateTime(createdDate)};
    }
}
