package uk.gov.hmcts.reform.pip.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

/**
 * This class displays details about dates which determine whether publications
 * should be displayed and when they should be retained to.
 */
public class GroupedDates {

    @JsonProperty("public")
    private LocalDate publicDate;

    private LocalDate media;

    private LocalDate legalProfessional;

}
