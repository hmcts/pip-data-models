package uk.gov.hmcts.reform.pip.model.subscription;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LegacyThirdPartySubscription {
    @NotNull
    String apiDestination;

    @NotNull
    UUID artefactId;
}
