/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.loganalytics.v2019_08_01_preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in LinkedServices.
 */
public class LinkedServicesInner {
    /** The Retrofit service to perform REST calls. */
    private LinkedServicesService service;
    /** The service client containing this operation class. */
    private OperationalInsightsManagementClientImpl client;

    /**
     * Initializes an instance of LinkedServicesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public LinkedServicesInner(Retrofit retrofit, OperationalInsightsManagementClientImpl client) {
        this.service = retrofit.create(LinkedServicesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for LinkedServices to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LinkedServicesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2019_08_01_preview.LinkedServices createOrUpdate" })
        @PUT("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/linkedServices/{linkedServiceName}")
        Observable<Response<ResponseBody>> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("linkedServiceName") String linkedServiceName, @Path("subscriptionId") String subscriptionId, @Body LinkedServiceInner parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2019_08_01_preview.LinkedServices delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/linkedServices/{linkedServiceName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("linkedServiceName") String linkedServiceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2019_08_01_preview.LinkedServices get" })
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/linkedServices/{linkedServiceName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("linkedServiceName") String linkedServiceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.loganalytics.v2019_08_01_preview.LinkedServices listByWorkspace" })
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/Microsoft.OperationalInsights/workspaces/{workspaceName}/linkedServices")
        Observable<Response<ResponseBody>> listByWorkspace(@Path("resourceGroupName") String resourceGroupName, @Path("workspaceName") String workspaceName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Create or update a linked service.
     *
     * @param resourceGroupName The workspace's resource group name.
     * @param workspaceName Name of the Log Analytics Workspace that will contain the linkedServices resource
     * @param linkedServiceName Name of the linkedServices resource
     * @param parameters The parameters required to create or update a linked service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LinkedServiceInner object if successful.
     */
    public LinkedServiceInner createOrUpdate(String resourceGroupName, String workspaceName, String linkedServiceName, LinkedServiceInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, linkedServiceName, parameters).toBlocking().single().body();
    }

    /**
     * Create or update a linked service.
     *
     * @param resourceGroupName The workspace's resource group name.
     * @param workspaceName Name of the Log Analytics Workspace that will contain the linkedServices resource
     * @param linkedServiceName Name of the linkedServices resource
     * @param parameters The parameters required to create or update a linked service.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LinkedServiceInner> createOrUpdateAsync(String resourceGroupName, String workspaceName, String linkedServiceName, LinkedServiceInner parameters, final ServiceCallback<LinkedServiceInner> serviceCallback) {
        return ServiceFuture.fromResponse(createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, linkedServiceName, parameters), serviceCallback);
    }

    /**
     * Create or update a linked service.
     *
     * @param resourceGroupName The workspace's resource group name.
     * @param workspaceName Name of the Log Analytics Workspace that will contain the linkedServices resource
     * @param linkedServiceName Name of the linkedServices resource
     * @param parameters The parameters required to create or update a linked service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LinkedServiceInner object
     */
    public Observable<LinkedServiceInner> createOrUpdateAsync(String resourceGroupName, String workspaceName, String linkedServiceName, LinkedServiceInner parameters) {
        return createOrUpdateWithServiceResponseAsync(resourceGroupName, workspaceName, linkedServiceName, parameters).map(new Func1<ServiceResponse<LinkedServiceInner>, LinkedServiceInner>() {
            @Override
            public LinkedServiceInner call(ServiceResponse<LinkedServiceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create or update a linked service.
     *
     * @param resourceGroupName The workspace's resource group name.
     * @param workspaceName Name of the Log Analytics Workspace that will contain the linkedServices resource
     * @param linkedServiceName Name of the linkedServices resource
     * @param parameters The parameters required to create or update a linked service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LinkedServiceInner object
     */
    public Observable<ServiceResponse<LinkedServiceInner>> createOrUpdateWithServiceResponseAsync(String resourceGroupName, String workspaceName, String linkedServiceName, LinkedServiceInner parameters) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (linkedServiceName == null) {
            throw new IllegalArgumentException("Parameter linkedServiceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (parameters == null) {
            throw new IllegalArgumentException("Parameter parameters is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        Validator.validate(parameters);
        return service.createOrUpdate(resourceGroupName, workspaceName, linkedServiceName, this.client.subscriptionId(), parameters, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LinkedServiceInner>>>() {
                @Override
                public Observable<ServiceResponse<LinkedServiceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LinkedServiceInner> clientResponse = createOrUpdateDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<LinkedServiceInner> createOrUpdateDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<LinkedServiceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<LinkedServiceInner>() { }.getType())
                .register(201, new TypeToken<LinkedServiceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Deletes a linked service instance.
     *
     * @param resourceGroupName The workspace's resource group name.
     * @param workspaceName Name of the Log Analytics Workspace that contains the linkedServices resource
     * @param linkedServiceName Name of the linked service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String workspaceName, String linkedServiceName) {
        deleteWithServiceResponseAsync(resourceGroupName, workspaceName, linkedServiceName).toBlocking().single().body();
    }

    /**
     * Deletes a linked service instance.
     *
     * @param resourceGroupName The workspace's resource group name.
     * @param workspaceName Name of the Log Analytics Workspace that contains the linkedServices resource
     * @param linkedServiceName Name of the linked service.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String workspaceName, String linkedServiceName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, workspaceName, linkedServiceName), serviceCallback);
    }

    /**
     * Deletes a linked service instance.
     *
     * @param resourceGroupName The workspace's resource group name.
     * @param workspaceName Name of the Log Analytics Workspace that contains the linkedServices resource
     * @param linkedServiceName Name of the linked service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String workspaceName, String linkedServiceName) {
        return deleteWithServiceResponseAsync(resourceGroupName, workspaceName, linkedServiceName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes a linked service instance.
     *
     * @param resourceGroupName The workspace's resource group name.
     * @param workspaceName Name of the Log Analytics Workspace that contains the linkedServices resource
     * @param linkedServiceName Name of the linked service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String workspaceName, String linkedServiceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (linkedServiceName == null) {
            throw new IllegalArgumentException("Parameter linkedServiceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(resourceGroupName, workspaceName, linkedServiceName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets a linked service instance.
     *
     * @param resourceGroupName The workspace's resource group name.
     * @param workspaceName Name of the Log Analytics Workspace that contains the linkedServices resource
     * @param linkedServiceName Name of the linked service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LinkedServiceInner object if successful.
     */
    public LinkedServiceInner get(String resourceGroupName, String workspaceName, String linkedServiceName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, linkedServiceName).toBlocking().single().body();
    }

    /**
     * Gets a linked service instance.
     *
     * @param resourceGroupName The workspace's resource group name.
     * @param workspaceName Name of the Log Analytics Workspace that contains the linkedServices resource
     * @param linkedServiceName Name of the linked service.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LinkedServiceInner> getAsync(String resourceGroupName, String workspaceName, String linkedServiceName, final ServiceCallback<LinkedServiceInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, workspaceName, linkedServiceName), serviceCallback);
    }

    /**
     * Gets a linked service instance.
     *
     * @param resourceGroupName The workspace's resource group name.
     * @param workspaceName Name of the Log Analytics Workspace that contains the linkedServices resource
     * @param linkedServiceName Name of the linked service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LinkedServiceInner object
     */
    public Observable<LinkedServiceInner> getAsync(String resourceGroupName, String workspaceName, String linkedServiceName) {
        return getWithServiceResponseAsync(resourceGroupName, workspaceName, linkedServiceName).map(new Func1<ServiceResponse<LinkedServiceInner>, LinkedServiceInner>() {
            @Override
            public LinkedServiceInner call(ServiceResponse<LinkedServiceInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a linked service instance.
     *
     * @param resourceGroupName The workspace's resource group name.
     * @param workspaceName Name of the Log Analytics Workspace that contains the linkedServices resource
     * @param linkedServiceName Name of the linked service.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LinkedServiceInner object
     */
    public Observable<ServiceResponse<LinkedServiceInner>> getWithServiceResponseAsync(String resourceGroupName, String workspaceName, String linkedServiceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (linkedServiceName == null) {
            throw new IllegalArgumentException("Parameter linkedServiceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, workspaceName, linkedServiceName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LinkedServiceInner>>>() {
                @Override
                public Observable<ServiceResponse<LinkedServiceInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LinkedServiceInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<LinkedServiceInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<LinkedServiceInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<LinkedServiceInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the linked services instances in a workspace.
     *
     * @param resourceGroupName The workspace's resource group name.
     * @param workspaceName Name of the Log Analytics Workspace that contains the linked services.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the List&lt;LinkedServiceInner&gt; object if successful.
     */
    public List<LinkedServiceInner> listByWorkspace(String resourceGroupName, String workspaceName) {
        return listByWorkspaceWithServiceResponseAsync(resourceGroupName, workspaceName).toBlocking().single().body();
    }

    /**
     * Gets the linked services instances in a workspace.
     *
     * @param resourceGroupName The workspace's resource group name.
     * @param workspaceName Name of the Log Analytics Workspace that contains the linked services.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<LinkedServiceInner>> listByWorkspaceAsync(String resourceGroupName, String workspaceName, final ServiceCallback<List<LinkedServiceInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByWorkspaceWithServiceResponseAsync(resourceGroupName, workspaceName), serviceCallback);
    }

    /**
     * Gets the linked services instances in a workspace.
     *
     * @param resourceGroupName The workspace's resource group name.
     * @param workspaceName Name of the Log Analytics Workspace that contains the linked services.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;LinkedServiceInner&gt; object
     */
    public Observable<List<LinkedServiceInner>> listByWorkspaceAsync(String resourceGroupName, String workspaceName) {
        return listByWorkspaceWithServiceResponseAsync(resourceGroupName, workspaceName).map(new Func1<ServiceResponse<List<LinkedServiceInner>>, List<LinkedServiceInner>>() {
            @Override
            public List<LinkedServiceInner> call(ServiceResponse<List<LinkedServiceInner>> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the linked services instances in a workspace.
     *
     * @param resourceGroupName The workspace's resource group name.
     * @param workspaceName Name of the Log Analytics Workspace that contains the linked services.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the List&lt;LinkedServiceInner&gt; object
     */
    public Observable<ServiceResponse<List<LinkedServiceInner>>> listByWorkspaceWithServiceResponseAsync(String resourceGroupName, String workspaceName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (workspaceName == null) {
            throw new IllegalArgumentException("Parameter workspaceName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByWorkspace(resourceGroupName, workspaceName, this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<LinkedServiceInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<LinkedServiceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<LinkedServiceInner>> result = listByWorkspaceDelegate(response);
                        List<LinkedServiceInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<LinkedServiceInner>> clientResponse = new ServiceResponse<List<LinkedServiceInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<LinkedServiceInner>> listByWorkspaceDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<LinkedServiceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<LinkedServiceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
