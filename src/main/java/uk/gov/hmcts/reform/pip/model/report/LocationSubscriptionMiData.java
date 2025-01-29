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
public class LocationSubscriptionMiData implements MiDataInterface {

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

    @Override
    public String[] getHeaders() {
        return new String[] {"id", "searchValue", "channel", "userId", "locationName", "createdDate"};
    }

    @Override
    public String[] getData() {
        return new String[] {String.valueOf(id), searchValue, String.valueOf(channel), userId,
            locationName, String.valueOf(createdDate)};
    }
}
