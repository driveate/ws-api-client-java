/*
 * Wheel Fitment API
 * The Wheel Fitment API allows for programmatic access to the database of www.wheel-size.com and its services. Use this API to retrieve information about vehicle fitment database for rims and tires, including OE and option fitments, and plus/minus sizing fitment information. A variety of country and language specific options are available. The coverage of fitment data for vehicles manufactured since 2000 is nearly 100%.  The information about fitment data is updated on a daily basis.
 *
 * OpenAPI spec version: v1
 * Contact: info@wheel-size.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.wheelsize.api.client.api;

import com.wheelsize.api.client.ApiException;
import com.wheelsize.api.client.model.Year;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for YearsApi
 */
@Ignore
public class YearsApiTest {

    private final YearsApi api = new YearsApi();

    
    /**
     * Returns list of years for the given manufacturer/model
     *
     * Get a list of years that match the given manufacturer and model (if present)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void yearsListTest() throws ApiException {
        String make = "mitsubishi";
        List<Year> response = api.yearsList(make, null);
        List<Year> response2 = api.yearsList(make, "outlander");

        // TODO: test validations
        assertTrue("Response list should not be empty", response.size() > 0);
        assertTrue("Filtered response list should not be empty", response2.size() > 0);
        assertTrue(response2.size() < response.size());
    }
    
}
