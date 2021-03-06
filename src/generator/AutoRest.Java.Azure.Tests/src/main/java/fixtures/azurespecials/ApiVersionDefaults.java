/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials;

import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import fixtures.azurespecials.models.ErrorException;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in ApiVersionDefaults.
 */
public interface ApiVersionDefaults {
    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getMethodGlobalValid() throws ErrorException, IOException, IllegalArgumentException;

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getMethodGlobalValidAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getMethodGlobalNotProvidedValid() throws ErrorException, IOException, IllegalArgumentException;

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getMethodGlobalNotProvidedValidAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getPathGlobalValid() throws ErrorException, IOException, IllegalArgumentException;

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getPathGlobalValidAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * GET method with api-version modeled in global settings.
     *
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> getSwaggerGlobalValid() throws ErrorException, IOException, IllegalArgumentException;

    /**
     * GET method with api-version modeled in global settings.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getSwaggerGlobalValidAsync(final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

}
