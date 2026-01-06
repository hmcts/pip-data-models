package uk.gov.hmcts.reform.pip.model.subscription;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ThirdPartyInfo {
    private String destinationUrl;
    private String tokenUrl;
    private String clientIdKey;
    private String clientSecretKey;
    private String scopeKey;
    private UUID publicationId;
}
