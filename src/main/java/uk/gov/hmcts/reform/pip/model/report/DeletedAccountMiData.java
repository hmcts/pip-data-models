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
public class DeletedAccountMiData implements MiDataInterface {
    private UUID userId;
    private String provenanceUserId;
    private UserProvenances userProvenance;
    private Roles roles;
    private LocalDateTime lastSignedInDate;
    private LocalDateTime deletedDate;

    @JsonCreator
    public DeletedAccountMiData(
        @JsonProperty("userId") UUID userId,
        @JsonProperty("provenanceUserId") String provenanceUserId,
        @JsonProperty("userProvenance") UserProvenances userProvenance,
        @JsonProperty("roles") Roles roles,
        @JsonProperty("lastSignedInDate") LocalDateTime lastSignedInDate,
        @JsonProperty("deletedDate") LocalDateTime deletedDate) {
        this.userId = userId;
        this.provenanceUserId = provenanceUserId;
        this.userProvenance = userProvenance;
        this.roles = roles;
        this.lastSignedInDate = lastSignedInDate;
        this.deletedDate = deletedDate;
    }

    public static String[] generateReportHeaders() {
        return new String[] {
            "user_id", "provenance_user_id", "user_provenance", "roles", "last_signed_in_date", "deleted_date"
        };
    }

    @Override
    public String[] generateReportData() {
        return new String[] {
            Objects.toString(userId, ""),
            Objects.toString(provenanceUserId, ""),
            Objects.toString(userProvenance, ""),
            Objects.toString(roles, ""),
            formatDateTime(lastSignedInDate),
            formatDateTime(deletedDate)
        };
    }
}
