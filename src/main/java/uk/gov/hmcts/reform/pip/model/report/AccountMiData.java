package uk.gov.hmcts.reform.pip.model.report;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uk.gov.hmcts.reform.pip.model.account.Roles;
import uk.gov.hmcts.reform.pip.model.account.UserProvenances;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class AccountMiData implements MiDataInterface {

    /**
     * The ID of the user as they exist in P&I.
     */
    private UUID userId;

    /**
     * The user id of the user as per their provenance system.
     */
    private String provenanceUserId;

    /**
     * The Sign in entry system the user was added with. (CFT IDAM, Crime IDAM, P&I AAD).
     */
    private UserProvenances userProvenance;

    /**
     * Role of the user, Verified, Internal or Technical.
     */
    private Roles roles;

    /**
     * The timestamp of when the user was created.
     */
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private LocalDateTime createdDate;

    /**
     * The timestamp when the user was last signed in.
     */
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private LocalDateTime lastSignedInDate;

    @JsonCreator
    public AccountMiData(
        @JsonProperty("userId") UUID userId,
        @JsonProperty("provenanceUserId") String provenanceUserId,
        @JsonProperty("userProvenance") UserProvenances userProvenance,
        @JsonProperty("roles") Roles roles,
        @JsonProperty("createdDate") LocalDateTime createdDate,
        @JsonProperty("lastSignedInDate") LocalDateTime lastSignedInDate
    ) {
        this.userId = userId;
        this.provenanceUserId = provenanceUserId;
        this.userProvenance = userProvenance;
        this.roles = roles;
        this.createdDate = createdDate;
        this.lastSignedInDate = lastSignedInDate;
    }

    @Override
    public String[] getHeaders() {
        return new String[] {"userId", "provenanceUserId", "userProvenance", "roles",
            "createdDate", "lastSignedInDate"};
    }

    @Override
    public String[] getData() {
        return new String[] {String.valueOf(userId), provenanceUserId, String.valueOf(userProvenance),
            String.valueOf(roles), String.valueOf(createdDate), String.valueOf(lastSignedInDate)};
    }

}
