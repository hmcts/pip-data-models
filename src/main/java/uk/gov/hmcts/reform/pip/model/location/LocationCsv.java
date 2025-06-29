package uk.gov.hmcts.reform.pip.model.location;

import com.opencsv.bean.CsvBindAndSplitByName;
import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * This class captures the inbound Court CSV that will be ingested.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LocationCsv {
    private static final String DELIMITER = ";(\\s)?";
    private static final String WRITE_DELIMITER = "; ";

    @CsvBindByName(column = "P&I ID")
    private Integer uniqueId;

    @CsvBindByName(column = "Court Desc")
    private String locationName;

    @CsvBindAndSplitByName(elementType = String.class, splitOn = DELIMITER, writeDelimiter = WRITE_DELIMITER,
        column = "Region")
    private List<String> region = new ArrayList<>();

    @CsvBindAndSplitByName(elementType = String.class, splitOn = DELIMITER, writeDelimiter = WRITE_DELIMITER,
        column = "Jurisdiction")
    private List<String> jurisdiction = new ArrayList<>();

    @CsvBindAndSplitByName(elementType = String.class, splitOn = DELIMITER, writeDelimiter = WRITE_DELIMITER,
        column = "Jurisdiction Type")
    private List<String> jurisdictionType = new ArrayList<>();

    @CsvBindByName(column = "Provenance")
    private String provenance;

    @CsvBindByName(column = "Provenance Location ID")
    private String provenanceLocationId;

    @CsvBindByName(column = "Provenance Location Type")
    private String provenanceLocationType;

    @CsvBindByName(column = "Welsh Court Desc")
    private String welshLocationName;

    @CsvBindAndSplitByName(elementType = String.class, splitOn = DELIMITER, writeDelimiter = WRITE_DELIMITER,
        column = "Welsh Region")
    private List<String> welshRegion = new ArrayList<>();

    @CsvBindAndSplitByName(elementType = String.class, splitOn = DELIMITER, writeDelimiter = WRITE_DELIMITER,
        column = "Welsh Jurisdiction")
    private List<String> welshJurisdiction = new ArrayList<>();

    @CsvBindAndSplitByName(elementType = String.class, splitOn = DELIMITER, writeDelimiter = WRITE_DELIMITER,
        column = "Welsh Jurisdiction Type")
    private List<String> welshJurisdictionType = new ArrayList<>();

    @CsvBindByName(column = "Email")
    private String email;

    @CsvBindByName(column = "Contact No")
    private String contactNo;
}
