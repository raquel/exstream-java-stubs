package org.openapitools.api;

import org.openapitools.model.CreateThemeRequest;
import org.openapitools.model.DataResponseImportResponse;
import org.openapitools.model.DataResponseLinkDTO;
import org.openapitools.model.DataResponseResource;
import org.openapitools.model.DataResponseResourceVersion;
import org.openapitools.model.DataResponseTheme;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.model.Domain;
import org.openapitools.model.GenericResponse;
import org.openapitools.model.LinkDTO;
import org.openapitools.model.ListResponseImportHistory;
import org.openapitools.model.ListResponseLinkDTO;
import org.openapitools.model.ListResponseResourceHistory;
import org.openapitools.model.MultipleLinksBody;
import java.time.OffsetDateTime;
import org.openapitools.model.PageResponseLinkDTO;
import org.openapitools.model.PageResponseResourceVersion;
import org.openapitools.model.PostGetThemeWithOptionsPayload;
import org.openapitools.model.ResourceVersion;
import org.openapitools.model.Theme;
import java.util.UUID;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T17:54:43.132703260Z[Europe/Lisbon]")
@Controller
@RequestMapping("${openapi.exstreamCEDesignAPI2120.base-path:/design}")
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
