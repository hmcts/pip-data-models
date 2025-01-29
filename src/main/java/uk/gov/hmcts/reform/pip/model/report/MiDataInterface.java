package uk.gov.hmcts.reform.pip.model.report;

public interface MiDataInterface {

    /**
     * Gets the headers for the MI Data.
     * @return Returns the headers for the MI data in an array.
     */
    String[] getHeaders();

    /**
     * Gets the values for the MI Data.
     * @return Returns the values for the MI data in an array.
     */
    String[] getData();

}
