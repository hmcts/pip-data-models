package uk.gov.hmcts.reform.pip.model.publication;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Class that contains a case number/case name pair associated with the Artefact.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArtefactCaseInfo {
    private String caseNumber;
    private String caseName;
}
