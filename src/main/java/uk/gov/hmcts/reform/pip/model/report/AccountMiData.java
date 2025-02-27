package uk.gov.hmcts.reform.pip.model.report;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uk.gov.hmcts.reform.pip.model.account.Roles;
import uk.gov.hmcts.reform.pip.model.account.UserProvenances;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

import static uk.gov.hmcts.reform.pip.model.report.MiDataInterface.formatDateTime;

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
    private LocalDateTime createdDate;

    /**
     * The timestamp when the user was last signed in.
     */
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

    public static String[] generateReportHeaders() {
        return new String[] {"user_id", "provenance_user_id", "user_provenance", "roles",
            "created_date", "last_signed_in_date"};
    }

    @Override
    public String[] generateReportData() {
        return new String[] {Objects.toString(userId, ""), Objects.toString(provenanceUserId, ""),
            Objects.toString(userProvenance, ""), Objects.toString(roles, ""),
            formatDateTime(createdDate), formatDateTime(lastSignedInDate)};
    }

}
