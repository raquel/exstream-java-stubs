/*
 * Exstream CE Design API (21.2.0)
 * The Exstream CE Design API allows developers to query, create, modify, or delete Exstream CE resources and their links outside of the Exstream CE user inferface. This API requires authentication in order to be used - to authenticate requests, supply a valid OTDS token with `Authorization: Bearer OTDS_TOKEN` in the request header.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.openapitools.client.model.DataResponseImportResponse;
import java.io.File;
import org.openapitools.client.model.ListResponseImportHistory;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ImportControllerApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ImportControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ImportControllerApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getImportHistoryUsingGET
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getImportHistoryUsingGETCall(final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/import/logs";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getImportHistoryUsingGETValidateBeforeCall(final ApiCallback _callback) throws ApiException {
        return getImportHistoryUsingGETCall(_callback);

    }

    /**
     * Fetch import history
     * 
     * @return ListResponseImportHistory
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ListResponseImportHistory getImportHistoryUsingGET() throws ApiException {
        ApiResponse<ListResponseImportHistory> localVarResp = getImportHistoryUsingGETWithHttpInfo();
        return localVarResp.getData();
    }

    /**
     * Fetch import history
     * 
     * @return ApiResponse&lt;ListResponseImportHistory&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListResponseImportHistory> getImportHistoryUsingGETWithHttpInfo() throws ApiException {
        okhttp3.Call localVarCall = getImportHistoryUsingGETValidateBeforeCall(null);
        Type localVarReturnType = new TypeToken<ListResponseImportHistory>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Fetch import history (asynchronously)
     * 
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getImportHistoryUsingGETAsync(final ApiCallback<ListResponseImportHistory> _callback) throws ApiException {

        okhttp3.Call localVarCall = getImportHistoryUsingGETValidateBeforeCall(_callback);
        Type localVarReturnType = new TypeToken<ListResponseImportHistory>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for importPackageUsingPOST
     * @param domain domain (required)
     * @param packagetype packagetype (required)
     * @param commit Set to false to do a dry run (optional)
     * @param previousExportPackage The id of a previously uploaded export package. (optional)
     * @param exportPackage The zip of the export to import (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call importPackageUsingPOSTCall(String domain, String packagetype, String commit, String previousExportPackage, File exportPackage, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/import/{packagetype}/{domain}"
            .replace("{" + "domain" + "}", localVarApiClient.escapeString(domain.toString()))
            .replace("{" + "packagetype" + "}", localVarApiClient.escapeString(packagetype.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (exportPackage != null) {
            localVarFormParams.put("exportPackage", exportPackage);
        }

        if (commit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("commit", commit));
        }

        if (previousExportPackage != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("previousExportPackage", previousExportPackage));
        }

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call importPackageUsingPOSTValidateBeforeCall(String domain, String packagetype, String commit, String previousExportPackage, File exportPackage, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new ApiException("Missing the required parameter 'domain' when calling importPackageUsingPOST(Async)");
        }

        // verify the required parameter 'packagetype' is set
        if (packagetype == null) {
            throw new ApiException("Missing the required parameter 'packagetype' when calling importPackageUsingPOST(Async)");
        }

        return importPackageUsingPOSTCall(domain, packagetype, commit, previousExportPackage, exportPackage, _callback);

    }

    /**
     * Import a package that was previously exported
     * 
     * @param domain domain (required)
     * @param packagetype packagetype (required)
     * @param commit Set to false to do a dry run (optional)
     * @param previousExportPackage The id of a previously uploaded export package. (optional)
     * @param exportPackage The zip of the export to import (optional)
     * @return DataResponseImportResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public DataResponseImportResponse importPackageUsingPOST(String domain, String packagetype, String commit, String previousExportPackage, File exportPackage) throws ApiException {
        ApiResponse<DataResponseImportResponse> localVarResp = importPackageUsingPOSTWithHttpInfo(domain, packagetype, commit, previousExportPackage, exportPackage);
        return localVarResp.getData();
    }

    /**
     * Import a package that was previously exported
     * 
     * @param domain domain (required)
     * @param packagetype packagetype (required)
     * @param commit Set to false to do a dry run (optional)
     * @param previousExportPackage The id of a previously uploaded export package. (optional)
     * @param exportPackage The zip of the export to import (optional)
     * @return ApiResponse&lt;DataResponseImportResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DataResponseImportResponse> importPackageUsingPOSTWithHttpInfo(String domain, String packagetype, String commit, String previousExportPackage, File exportPackage) throws ApiException {
        okhttp3.Call localVarCall = importPackageUsingPOSTValidateBeforeCall(domain, packagetype, commit, previousExportPackage, exportPackage, null);
        Type localVarReturnType = new TypeToken<DataResponseImportResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Import a package that was previously exported (asynchronously)
     * 
     * @param domain domain (required)
     * @param packagetype packagetype (required)
     * @param commit Set to false to do a dry run (optional)
     * @param previousExportPackage The id of a previously uploaded export package. (optional)
     * @param exportPackage The zip of the export to import (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 201 </td><td> Created </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Not Found </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call importPackageUsingPOSTAsync(String domain, String packagetype, String commit, String previousExportPackage, File exportPackage, final ApiCallback<DataResponseImportResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = importPackageUsingPOSTValidateBeforeCall(domain, packagetype, commit, previousExportPackage, exportPackage, _callback);
        Type localVarReturnType = new TypeToken<DataResponseImportResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
