package uk.gov.hmcts.reform.pip.model.subscription;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocationSubscriptionDeletion {
    @NotNull
    String locationName;

    @NotNull
    List<String> subscriberEmails = new ArrayList<>();
}
