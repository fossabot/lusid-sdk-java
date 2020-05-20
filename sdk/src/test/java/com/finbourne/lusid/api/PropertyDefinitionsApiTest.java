/*
 * LUSID API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.10.1391
 * Contact: info@finbourne.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.finbourne.lusid.api;

import com.finbourne.lusid.ApiException;
import com.finbourne.lusid.model.CreatePropertyDefinitionRequest;
import com.finbourne.lusid.model.DeletedEntityResponse;
import com.finbourne.lusid.model.LusidProblemDetails;
import com.finbourne.lusid.model.LusidValidationProblemDetails;
import java.time.OffsetDateTime;
import com.finbourne.lusid.model.PropertyDefinition;
import com.finbourne.lusid.model.ResourceListOfPropertyDefinition;
import com.finbourne.lusid.model.UpdatePropertyDefinitionRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PropertyDefinitionsApi
 */
@Ignore
public class PropertyDefinitionsApiTest {

    private final PropertyDefinitionsApi api = new PropertyDefinitionsApi();

    
    /**
     * Create property definition
     *
     * Define a new property.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createPropertyDefinitionTest() throws ApiException {
        CreatePropertyDefinitionRequest definition = null;
        PropertyDefinition response = api.createPropertyDefinition(definition);

        // TODO: test validations
    }
    
    /**
     * Delete property definition
     *
     * Delete the definition of the specified property.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePropertyDefinitionTest() throws ApiException {
        String domain = null;
        String scope = null;
        String code = null;
        DeletedEntityResponse response = api.deletePropertyDefinition(domain, scope, code);

        // TODO: test validations
    }
    
    /**
     * Get multiple property definitions
     *
     * Retrieve the definition of one or more specified properties.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMultiplePropertyDefinitionsTest() throws ApiException {
        List<String> propertyKeys = null;
        OffsetDateTime asAt = null;
        String filter = null;
        ResourceListOfPropertyDefinition response = api.getMultiplePropertyDefinitions(propertyKeys, asAt, filter);

        // TODO: test validations
    }
    
    /**
     * Get property definition
     *
     * Retrieve the definition of a specified property.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPropertyDefinitionTest() throws ApiException {
        String domain = null;
        String scope = null;
        String code = null;
        OffsetDateTime asAt = null;
        PropertyDefinition response = api.getPropertyDefinition(domain, scope, code, asAt);

        // TODO: test validations
    }
    
    /**
     * Update property definition
     *
     * Update the definition of a specified existing property. Not all elements within a property definition  are modifiable due to the potential implications for values already stored against the property.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePropertyDefinitionTest() throws ApiException {
        String domain = null;
        String scope = null;
        String code = null;
        UpdatePropertyDefinitionRequest definition = null;
        PropertyDefinition response = api.updatePropertyDefinition(domain, scope, code, definition);

        // TODO: test validations
    }
    
}
