package uk.gov.hmcts.reform.pip.model.thirdparty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ThirdPartySubscription {
    List<ThirdPartyOauthConfiguration> thirdPartyOauthConfigurationList;
    UUID publicationId;
    ThirdPartyAction thirdPartyAction;
    boolean useMockData = false;
}
