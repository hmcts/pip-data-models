package uk.gov.hmcts.reform.pip.model.report;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uk.gov.hmcts.reform.pip.model.publication.ArtefactType;
import uk.gov.hmcts.reform.pip.model.publication.Language;
import uk.gov.hmcts.reform.pip.model.publication.ListType;
import uk.gov.hmcts.reform.pip.model.publication.Sensitivity;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

import static uk.gov.hmcts.reform.pip.model.report.MiDataInterface.formatDateTime;

@Getter
@Setter
@EqualsAndHashCode
@SuppressWarnings("PMD.ExcessiveParameterList")
@NoArgsConstructor
public class PublicationMiData implements MiDataInterface {

    private UUID artefactId;
    private LocalDateTime displayFrom;
    private LocalDateTime displayTo;
    private Language language;
    private String provenance;
    private Sensitivity sensitivity;
    private String sourceArtefactId;
    private Integer supersededCount;
    private ArtefactType type;
    private LocalDateTime contentDate;
    private String locationId;
    private String locationName;
    private ListType listType;

    @JsonCreator
    public PublicationMiData(
        @JsonProperty("artefactId") UUID artefactId,
        @JsonProperty("displayFrom") LocalDateTime displayFrom,
        @JsonProperty("displayTo") LocalDateTime displayTo,
        @JsonProperty("language") Language language,
        @JsonProperty("provenance") String provenance,
        @JsonProperty("sensitivity") Sensitivity sensitivity,
        @JsonProperty("sourceArtefactId") String sourceArtefactId,
        @JsonProperty("supersededCount") Integer supersededCount,
        @JsonProperty("type") ArtefactType type,
        @JsonProperty("contentDate") LocalDateTime contentDate,
        @JsonProperty("locationId") String locationId,
        @JsonProperty("listType") ListType listType
    ) {
        this.artefactId = artefactId;
        this.displayFrom = displayFrom;
        this.displayTo = displayTo;
        this.language = language;
        this.provenance = provenance;
        this.sensitivity = sensitivity;
        this.sourceArtefactId = sourceArtefactId;
        this.supersededCount = supersededCount;
        this.type = type;
        this.contentDate = contentDate;
        this.locationId = locationId;
        this.listType = listType;
    }

    public static String[] generateReportHeaders() {
        return new String[] {"artefact_id", "display_from", "display_to", "language", "provenance", "sensitivity",
            "source_artefact_id", "superseded_count",
            "type", "content_date", "court_id", "court_name", "list_type"};
    }

    @Override
    public String[] generateReportData() {
        return new String[] {Objects.toString(artefactId, ""), formatDateTime(displayFrom),
            formatDateTime(displayTo), Objects.toString(language, ""),
            Objects.toString(provenance, ""), Objects.toString(sensitivity, ""),
            Objects.toString(sourceArtefactId, ""), Objects.toString(supersededCount, ""),
            Objects.toString(type, ""), formatDateTime(contentDate),
            Objects.toString(locationId, ""), Objects.toString(locationName, ""),
            Objects.toString(listType, "")};
    }

}
