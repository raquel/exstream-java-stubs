package org.openapitools.api;

import org.openapitools.model.ConfigFormat;
import org.openapitools.model.CreateTenantBody;
import org.openapitools.model.DataResponseBoolean;
import org.openapitools.model.DataResponseExternalConfiguration;
import org.openapitools.model.DataResponseListEmailevent;
import org.openapitools.model.DataResponseListEvents;
import org.openapitools.model.DataResponseLong;
import org.openapitools.model.DataResponseTenant;
import org.openapitools.model.DataResponseTenantsConfiguration;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.model.ExternalConfiguration;
import org.openapitools.model.GenericResponse;
import org.openapitools.model.ListResponseEditableConfig;
import org.openapitools.model.ListResponseTenant;
import java.util.Map;
import java.time.OffsetDateTime;
import org.openapitools.model.PageResponseMessage;
import org.openapitools.model.ProcessState;
import org.openapitools.model.SecretInfo;
import java.util.UUID;
import org.openapitools.model.VersionConfig;


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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:04:14.260450399Z[Europe/Lisbon]")
@Controller
@RequestMapping("${openapi.exstreamCXIIntegration.base-path:/ei}")
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
