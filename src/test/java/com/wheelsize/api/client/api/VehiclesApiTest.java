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
import com.wheelsize.api.client.model.Vehicle;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VehiclesApi
 */
@Ignore
public class VehiclesApiTest {

    private final VehiclesApi api = new VehiclesApi();

    
    /**
     * Find OE and option fitments by model/year/trim
     *
     * Find OE and option fitments that match the given manufacturer, model, year and trim.  Please use _**&#x60;GET /search/by_model/&#x60;**_ instead as it is deprecated at the current moment.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void vehiclesListTest() throws ApiException {
        String make = null;
        String model = null;
        Integer year = null;
        String trim = null;
        Boolean onlyOem = null;
        String lang = null;
        List<Vehicle> response = api.vehiclesList(make, model, year, trim, onlyOem, lang);

        // TODO: test validations
    }
    
}
