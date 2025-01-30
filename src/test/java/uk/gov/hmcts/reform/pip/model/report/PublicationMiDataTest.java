package uk.gov.hmcts.reform.pip.model.report;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.UUID;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static uk.gov.hmcts.reform.pip.model.publication.ArtefactType.LIST;
import static uk.gov.hmcts.reform.pip.model.publication.Language.BI_LINGUAL;
import static uk.gov.hmcts.reform.pip.model.publication.ListType.FAMILY_DAILY_CAUSE_LIST;
import static uk.gov.hmcts.reform.pip.model.publication.Sensitivity.PUBLIC;

class PublicationMiDataTest {

    private static final String LOCATION_NAME = "Location";
    public static final UUID ARTEFACT_ID = UUID.randomUUID();
    public static final LocalDateTime DISPLAY_FROM = LocalDateTime.of(2022, 1, 19, 13, 45, 50);
    public static final LocalDateTime DISPLAY_TO = LocalDateTime.of(2025,1, 19, 13, 45, 50);
    public static final String MANUAL_UPLOAD_PROVENANCE = "MANUAL_UPLOAD";
    public static final String SOURCE_ARTEFACT_ID = "1234";
    public static final Integer SUPERSEDED_COUNT = 0;
    public static final LocalDateTime CONTENT_DATE = LocalDateTime.parse("2024-01-19T13:45");


    private static final PublicationMiData PUBLICATION_MI_RECORD = new PublicationMiData(
        ARTEFACT_ID, DISPLAY_FROM, DISPLAY_TO, BI_LINGUAL, MANUAL_UPLOAD_PROVENANCE, PUBLIC, SOURCE_ARTEFACT_ID,
        SUPERSEDED_COUNT, LIST, CONTENT_DATE, "3", FAMILY_DAILY_CAUSE_LIST);

    @BeforeAll
    public static void setUp() {
        PUBLICATION_MI_RECORD.setLocationName(LOCATION_NAME);
    }

    @Test
    void testGetHeaders() {
        assertThat(PUBLICATION_MI_RECORD.generateReportHeaders())
            .containsExactly("artefact_id", "display_from", "display_to", "language", "provenance", "sensitivity",
                             "source_artefact_id", "superseded_count", "type", "content_date", "court_id",
                             "court_name", "list_type");
    }

    @Test
    void testGetData() {
        assertThat(PUBLICATION_MI_RECORD.generateReportData())
            .containsExactly(ARTEFACT_ID.toString(), "2022-01-19 13:45:50",
                             "2025-01-19 13:45:50", BI_LINGUAL.toString(),
                             MANUAL_UPLOAD_PROVENANCE, PUBLIC.toString(), SOURCE_ARTEFACT_ID,
                             SUPERSEDED_COUNT.toString(), LIST.toString(),
                             "2024-01-19 13:45:00", "3",
                             LOCATION_NAME, FAMILY_DAILY_CAUSE_LIST.toString());
    }

}
