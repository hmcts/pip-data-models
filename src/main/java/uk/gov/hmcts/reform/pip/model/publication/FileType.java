package uk.gov.hmcts.reform.pip.model.publication;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Enum used in the map of files returned from channel management.
 */
@Getter
@AllArgsConstructor
public enum FileType {
    EXCEL(".xlsx"),
    CSV(".csv"),
    PDF(".pdf");

    private final String extension;
}
