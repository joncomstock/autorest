/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package fixtures.azurespecials.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceResponseBuilder;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponseCallback;
import com.microsoft.rest.ServiceResponseWithHeaders;
import com.microsoft.rest.Validator;
import fixtures.azurespecials.models.ErrorException;
import fixtures.azurespecials.models.HeaderCustomNamedRequestIdHeaders;
import fixtures.azurespecials.models.HeaderCustomNamedRequestIdParamGroupingHeaders;
import fixtures.azurespecials.models.HeaderCustomNamedRequestIdParamGroupingParameters;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.Response;

/**
 * An instance of this class provides access to all the operations defined
 * in Headers.
 */
public final class HeadersImpl implements fixtures.azurespecials.Headers {
    /** The Retrofit service to perform REST calls. */
    private HeadersService service;
    /** The service client containing this operation class. */
    private AutoRestAzureSpecialParametersTestClientImpl client;

    /**
     * Initializes an instance of HeadersImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public HeadersImpl(Retrofit retrofit, AutoRestAzureSpecialParametersTestClientImpl client) {
        this.service = retrofit.create(HeadersService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Headers to be
     * used by Retrofit to perform actually REST calls.
     */
    interface HeadersService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("azurespecials/customNamedRequestId")
        Call<ResponseBody> customNamedRequestId(@Header("foo-client-request-id") String fooClientRequestId, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("azurespecials/customNamedRequestIdParamGrouping")
        Call<ResponseBody> customNamedRequestIdParamGrouping(@Header("accept-language") String acceptLanguage, @Header("foo-client-request-id") String fooClientRequestId, @Header("User-Agent") String userAgent);

    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, HeaderCustomNamedRequestIdHeaders> customNamedRequestId(String fooClientRequestId) throws ErrorException, IOException, IllegalArgumentException {
        if (fooClientRequestId == null) {
            throw new IllegalArgumentException("Parameter fooClientRequestId is required and cannot be null.");
        }
        Call<ResponseBody> call = service.customNamedRequestId(fooClientRequestId, this.client.acceptLanguage(), this.client.userAgent());
        return customNamedRequestIdDelegate(call.execute());
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request.
     *
     * @param fooClientRequestId The fooRequestId
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall customNamedRequestIdAsync(String fooClientRequestId, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (fooClientRequestId == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter fooClientRequestId is required and cannot be null."));
            return null;
        }
        Call<ResponseBody> call = service.customNamedRequestId(fooClientRequestId, this.client.acceptLanguage(), this.client.userAgent());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(customNamedRequestIdDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponseWithHeaders<Void, HeaderCustomNamedRequestIdHeaders> customNamedRequestIdDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildWithHeaders(response, HeaderCustomNamedRequestIdHeaders.class);
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter group.
     *
     * @param headerCustomNamedRequestIdParamGroupingParameters Additional parameters for the operation
     * @throws ErrorException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponseWithHeaders} object if successful.
     */
    public ServiceResponseWithHeaders<Void, HeaderCustomNamedRequestIdParamGroupingHeaders> customNamedRequestIdParamGrouping(HeaderCustomNamedRequestIdParamGroupingParameters headerCustomNamedRequestIdParamGroupingParameters) throws ErrorException, IOException, IllegalArgumentException {
        if (headerCustomNamedRequestIdParamGroupingParameters == null) {
            throw new IllegalArgumentException("Parameter headerCustomNamedRequestIdParamGroupingParameters is required and cannot be null.");
        }
        Validator.validate(headerCustomNamedRequestIdParamGroupingParameters);
        String fooClientRequestId = headerCustomNamedRequestIdParamGroupingParameters.fooClientRequestId();
        Call<ResponseBody> call = service.customNamedRequestIdParamGrouping(this.client.acceptLanguage(), fooClientRequestId, this.client.userAgent());
        return customNamedRequestIdParamGroupingDelegate(call.execute());
    }

    /**
     * Send foo-client-request-id = 9C4D50EE-2D56-4CD3-8152-34347DC9F2B0 in the header of the request, via a parameter group.
     *
     * @param headerCustomNamedRequestIdParamGroupingParameters Additional parameters for the operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link Call} object
     */
    public ServiceCall customNamedRequestIdParamGroupingAsync(HeaderCustomNamedRequestIdParamGroupingParameters headerCustomNamedRequestIdParamGroupingParameters, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException {
        if (serviceCallback == null) {
            throw new IllegalArgumentException("ServiceCallback is required for async calls.");
        }
        if (headerCustomNamedRequestIdParamGroupingParameters == null) {
            serviceCallback.failure(new IllegalArgumentException("Parameter headerCustomNamedRequestIdParamGroupingParameters is required and cannot be null."));
            return null;
        }
        Validator.validate(headerCustomNamedRequestIdParamGroupingParameters, serviceCallback);
        String fooClientRequestId = headerCustomNamedRequestIdParamGroupingParameters.fooClientRequestId();
        Call<ResponseBody> call = service.customNamedRequestIdParamGrouping(this.client.acceptLanguage(), fooClientRequestId, this.client.userAgent());
        final ServiceCall serviceCall = new ServiceCall(call);
        call.enqueue(new ServiceResponseCallback<Void>(serviceCallback) {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    serviceCallback.success(customNamedRequestIdParamGroupingDelegate(response));
                } catch (ErrorException | IOException exception) {
                    serviceCallback.failure(exception);
                }
            }
        });
        return serviceCall;
    }

    private ServiceResponseWithHeaders<Void, HeaderCustomNamedRequestIdParamGroupingHeaders> customNamedRequestIdParamGroupingDelegate(Response<ResponseBody> response) throws ErrorException, IOException, IllegalArgumentException {
        return new AzureServiceResponseBuilder<Void, ErrorException>(this.client.mapperAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .registerError(ErrorException.class)
                .buildWithHeaders(response, HeaderCustomNamedRequestIdParamGroupingHeaders.class);
    }

}
