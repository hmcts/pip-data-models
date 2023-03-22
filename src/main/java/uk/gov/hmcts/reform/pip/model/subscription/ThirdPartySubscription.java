package uk.gov.hmcts.reform.pip.model.subscription;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ThirdPartySubscription {
    @NotNull
    String apiDestination;

    @NotNull
    UUID artefactId;
}
