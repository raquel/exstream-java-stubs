package org.openapitools.api;

import org.openapitools.model.CreateTenantBody;
import org.openapitools.model.CustomFragmentRequest;
import org.openapitools.model.CustomSuperSetRequest;
import org.openapitools.model.DataResponseTenant;
import org.openapitools.model.DataResponseTenantsConfiguration;
import org.openapitools.model.FragmentRequest;
import org.openapitools.model.ListResponseTenant;
import org.openapitools.model.MigrationSetDomainRequest;
import org.openapitools.model.MigrationSetExportRequest;
import org.openapitools.model.MigrationSetLinkRequest;
import org.openapitools.model.MigrationSetPatchRequest;
import org.openapitools.model.MigrationSetRequest;
import org.openapitools.model.RationalisationFilter;
import org.openapitools.model.RationalizationResponseObject;
import org.openapitools.model.SseEmitter;
import java.util.UUID;
import org.openapitools.model.UpdateRationalizationActivityRequest;
import org.openapitools.model.VersionConfig;
import org.openapitools.model.WorkflowRequestBody;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:04:36.667726893Z[Europe/Lisbon]")
@Controller
@RequestMapping("${openapi.exstreamRationalization.base-path:/rationalizationApi}")
public class ApiApiController implements ApiApi {

    private final NativeWebRequest request;

    @Autowired
    public ApiApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
