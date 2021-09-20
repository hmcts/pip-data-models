package uk.gov.hmcts.reform.pip.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;
import javax.persistence.Id;


/**
 * This class displays details about dates which determine whether publications
 * should be displayed and when they should be retained to.
 */
@Data
public class GroupedDates {

    @Id
    private Long groupedDatesId;

    @JsonProperty("public")
    private LocalDate publicDate;

    private LocalDate media;

    private LocalDate legalProfessional;

}
