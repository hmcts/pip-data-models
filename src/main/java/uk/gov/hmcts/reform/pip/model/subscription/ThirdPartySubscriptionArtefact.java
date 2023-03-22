package uk.gov.hmcts.reform.pip.model.subscription;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uk.gov.hmcts.reform.pip.model.publication.Artefact;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ThirdPartySubscriptionArtefact {
    @NotNull
    String apiDestination;

    @NotNull
    Artefact artefact;
}
