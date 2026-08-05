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
    private UserProvenances userProvenance;
    private String email;
    private Roles roles;
    private LocalDateTime lastSignedInDate;
    private LocalDateTime deletedDate;

    @JsonCreator
    public DeletedAccountMiData(
        @JsonProperty("userId") UUID userId,
        @JsonProperty("userProvenance") UserProvenances userProvenance,
        @JsonProperty("email") String email,
        @JsonProperty("roles") Roles roles,
        @JsonProperty("lastSignedInDate") LocalDateTime lastSignedInDate,
        @JsonProperty("deletedDate") LocalDateTime deletedDate) {
        this.userId = userId;
        this.userProvenance = userProvenance;
        this.email = email;
        this.roles = roles;
        this.lastSignedInDate = lastSignedInDate;
        this.deletedDate = deletedDate;
    }

    public static String[] generateReportHeaders() {
        return new String[] {"user_id", "user_provenance", "email", "roles", "last_signed_in_date", "deleted_date"};
    }

    @Override
    public String[] generateReportData() {
        return new String[] {
            Objects.toString(userId, ""),
            Objects.toString(userProvenance, ""),
            Objects.toString(email, ""),
            Objects.toString(roles, ""),
            formatDateTime(lastSignedInDate),
            formatDateTime(deletedDate)
        };
    }
}
