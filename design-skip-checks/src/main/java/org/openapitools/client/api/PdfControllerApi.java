/*
 * Exstream Design
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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


import org.openapitools.client.model.DataResponseResourceVersion;
import org.openapitools.client.model.PdfFragmentResponse;
import java.util.UUID;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PdfControllerApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PdfControllerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PdfControllerApi(ApiClient apiClient) {
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
     * Build call for createThumbnailContentForResource
     * @param domain  (required)
     * @param id  (required)
     * @param version  (optional, default to 1)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createThumbnailContentForResourceCall(String domain, UUID id, Integer version, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/pdf/{domain}/{id}/content/thumbnail"
            .replace("{" + "domain" + "}", localVarApiClient.escapeString(domain.toString()))
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (version != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("version", version));
        }

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
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createThumbnailContentForResourceValidateBeforeCall(String domain, UUID id, Integer version, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new ApiException("Missing the required parameter 'domain' when calling createThumbnailContentForResource(Async)");
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling createThumbnailContentForResource(Async)");
        }

        return createThumbnailContentForResourceCall(domain, id, version, _callback);

    }

    /**
     * 
     * Expects a resource id , resource content type and version.
     * @param domain  (required)
     * @param id  (required)
     * @param version  (optional, default to 1)
     * @return DataResponseResourceVersion
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public DataResponseResourceVersion createThumbnailContentForResource(String domain, UUID id, Integer version) throws ApiException {
        ApiResponse<DataResponseResourceVersion> localVarResp = createThumbnailContentForResourceWithHttpInfo(domain, id, version);
        return localVarResp.getData();
    }

    /**
     * 
     * Expects a resource id , resource content type and version.
     * @param domain  (required)
     * @param id  (required)
     * @param version  (optional, default to 1)
     * @return ApiResponse&lt;DataResponseResourceVersion&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DataResponseResourceVersion> createThumbnailContentForResourceWithHttpInfo(String domain, UUID id, Integer version) throws ApiException {
        okhttp3.Call localVarCall = createThumbnailContentForResourceValidateBeforeCall(domain, id, version, null);
        Type localVarReturnType = new TypeToken<DataResponseResourceVersion>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Expects a resource id , resource content type and version.
     * @param domain  (required)
     * @param id  (required)
     * @param version  (optional, default to 1)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createThumbnailContentForResourceAsync(String domain, UUID id, Integer version, final ApiCallback<DataResponseResourceVersion> _callback) throws ApiException {

        okhttp3.Call localVarCall = createThumbnailContentForResourceValidateBeforeCall(domain, id, version, _callback);
        Type localVarReturnType = new TypeToken<DataResponseResourceVersion>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for extractPdf
     * @param domain  (required)
     * @param id  (required)
     * @param version  (required)
     * @param state  (required)
     * @param pageNum  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call extractPdfCall(String domain, UUID id, Integer version, String state, Integer pageNum, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/pdf/{domain}/contents/{id}/fragments"
            .replace("{" + "domain" + "}", localVarApiClient.escapeString(domain.toString()))
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (version != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("version", version));
        }

        if (state != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("state", state));
        }

        if (pageNum != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageNum", pageNum));
        }

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
    private okhttp3.Call extractPdfValidateBeforeCall(String domain, UUID id, Integer version, String state, Integer pageNum, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new ApiException("Missing the required parameter 'domain' when calling extractPdf(Async)");
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling extractPdf(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling extractPdf(Async)");
        }

        // verify the required parameter 'state' is set
        if (state == null) {
            throw new ApiException("Missing the required parameter 'state' when calling extractPdf(Async)");
        }

        return extractPdfCall(domain, id, version, state, pageNum, _callback);

    }

    /**
     * 
     * Expects a resource id, version and state as request parameter and return fragments ( paragraph, image ) for Pdf type resource
     * @param domain  (required)
     * @param id  (required)
     * @param version  (required)
     * @param state  (required)
     * @param pageNum  (optional)
     * @return PdfFragmentResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PdfFragmentResponse extractPdf(String domain, UUID id, Integer version, String state, Integer pageNum) throws ApiException {
        ApiResponse<PdfFragmentResponse> localVarResp = extractPdfWithHttpInfo(domain, id, version, state, pageNum);
        return localVarResp.getData();
    }

    /**
     * 
     * Expects a resource id, version and state as request parameter and return fragments ( paragraph, image ) for Pdf type resource
     * @param domain  (required)
     * @param id  (required)
     * @param version  (required)
     * @param state  (required)
     * @param pageNum  (optional)
     * @return ApiResponse&lt;PdfFragmentResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PdfFragmentResponse> extractPdfWithHttpInfo(String domain, UUID id, Integer version, String state, Integer pageNum) throws ApiException {
        okhttp3.Call localVarCall = extractPdfValidateBeforeCall(domain, id, version, state, pageNum, null);
        Type localVarReturnType = new TypeToken<PdfFragmentResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Expects a resource id, version and state as request parameter and return fragments ( paragraph, image ) for Pdf type resource
     * @param domain  (required)
     * @param id  (required)
     * @param version  (required)
     * @param state  (required)
     * @param pageNum  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call extractPdfAsync(String domain, UUID id, Integer version, String state, Integer pageNum, final ApiCallback<PdfFragmentResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = extractPdfValidateBeforeCall(domain, id, version, state, pageNum, _callback);
        Type localVarReturnType = new TypeToken<PdfFragmentResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for pdfPreview
     * @param domain  (required)
     * @param resourceId  (required)
     * @param version  (required)
     * @param state  (required)
     * @param pageNum  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call pdfPreviewCall(String domain, UUID resourceId, Integer version, String state, Integer pageNum, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/api/v1/pdf/{domain}/contents/{resourceId}"
            .replace("{" + "domain" + "}", localVarApiClient.escapeString(domain.toString()))
            .replace("{" + "resourceId" + "}", localVarApiClient.escapeString(resourceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (version != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("version", version));
        }

        if (state != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("state", state));
        }

        if (pageNum != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pageNum", pageNum));
        }

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
    private okhttp3.Call pdfPreviewValidateBeforeCall(String domain, UUID resourceId, Integer version, String state, Integer pageNum, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'domain' is set
        if (domain == null) {
            throw new ApiException("Missing the required parameter 'domain' when calling pdfPreview(Async)");
        }

        // verify the required parameter 'resourceId' is set
        if (resourceId == null) {
            throw new ApiException("Missing the required parameter 'resourceId' when calling pdfPreview(Async)");
        }

        // verify the required parameter 'version' is set
        if (version == null) {
            throw new ApiException("Missing the required parameter 'version' when calling pdfPreview(Async)");
        }

        // verify the required parameter 'state' is set
        if (state == null) {
            throw new ApiException("Missing the required parameter 'state' when calling pdfPreview(Async)");
        }

        // verify the required parameter 'pageNum' is set
        if (pageNum == null) {
            throw new ApiException("Missing the required parameter 'pageNum' when calling pdfPreview(Async)");
        }

        return pdfPreviewCall(domain, resourceId, version, state, pageNum, _callback);

    }

    /**
     * 
     * Expects a resource id, version and state and page number as request parameter and return fragments image preview for Pdf type resource
     * @param domain  (required)
     * @param resourceId  (required)
     * @param version  (required)
     * @param state  (required)
     * @param pageNum  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public Object pdfPreview(String domain, UUID resourceId, Integer version, String state, Integer pageNum) throws ApiException {
        ApiResponse<Object> localVarResp = pdfPreviewWithHttpInfo(domain, resourceId, version, state, pageNum);
        return localVarResp.getData();
    }

    /**
     * 
     * Expects a resource id, version and state and page number as request parameter and return fragments image preview for Pdf type resource
     * @param domain  (required)
     * @param resourceId  (required)
     * @param version  (required)
     * @param state  (required)
     * @param pageNum  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> pdfPreviewWithHttpInfo(String domain, UUID resourceId, Integer version, String state, Integer pageNum) throws ApiException {
        okhttp3.Call localVarCall = pdfPreviewValidateBeforeCall(domain, resourceId, version, state, pageNum, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Expects a resource id, version and state and page number as request parameter and return fragments image preview for Pdf type resource
     * @param domain  (required)
     * @param resourceId  (required)
     * @param version  (required)
     * @param state  (required)
     * @param pageNum  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call pdfPreviewAsync(String domain, UUID resourceId, Integer version, String state, Integer pageNum, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = pdfPreviewValidateBeforeCall(domain, resourceId, version, state, pageNum, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
