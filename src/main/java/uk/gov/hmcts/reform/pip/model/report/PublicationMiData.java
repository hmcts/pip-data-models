package uk.gov.hmcts.reform.pip.model.report;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
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
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@SuppressWarnings("PMD.ExcessiveParameterList")
@NoArgsConstructor
public class PublicationMiData implements MiDataInterface {

    private UUID artefactId;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private LocalDateTime displayFrom;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private LocalDateTime displayTo;
    private Language language;
    private String provenance;
    private Sensitivity sensitivity;
    private String sourceArtefactId;
    private Integer supersededCount;
    private ArtefactType type;
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
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

    @Override
    public String[] getHeaders() {
        return new String[] {"artefactId", "displayFrom", "displayTo", "language", "provenance", "sensitivity",
            "sourceArtefactId", "supersededCount", "type", "contentDate", "locationId", "locationName", "listType"};
    }

    @Override
    public String[] getData() {
        return new String[] {String.valueOf(artefactId), String.valueOf(displayFrom), String.valueOf(displayTo),
            String.valueOf(language), provenance, String.valueOf(sensitivity), sourceArtefactId,
            String.valueOf(supersededCount), String.valueOf(type), String.valueOf(contentDate), locationId,
            locationName, String.valueOf(listType)};
    }

}
