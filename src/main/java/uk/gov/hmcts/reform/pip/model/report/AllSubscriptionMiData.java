package uk.gov.hmcts.reform.pip.model.report;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uk.gov.hmcts.reform.pip.model.subscription.Channel;
import uk.gov.hmcts.reform.pip.model.subscription.SearchType;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class AllSubscriptionMiData {

    private UUID id;
    private Channel channel;
    private SearchType searchType;
    private String userId;
    private String locationName;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
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
}
