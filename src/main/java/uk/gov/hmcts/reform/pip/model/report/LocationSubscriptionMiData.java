package uk.gov.hmcts.reform.pip.model.report;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uk.gov.hmcts.reform.pip.model.subscription.Channel;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class LocationSubscriptionMiData {

    private UUID id;
    private String searchValue;
    private Channel channel;
    private String userId;
    private String locationName;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
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
}
