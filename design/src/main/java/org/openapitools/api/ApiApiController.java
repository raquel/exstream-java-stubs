package org.openapitools.api;

import org.openapitools.model.BulkDeleteRequest;
import org.openapitools.model.BulkWorkflowRequestBody;
import org.openapitools.model.CollectionResourceFilter;
import org.openapitools.model.CommentRequestBody;
import org.openapitools.model.CreateTenantBody;
import org.openapitools.model.CreateThemeRequest;
import org.openapitools.model.DataResponseBulkDeleteResponse;
import org.openapitools.model.DataResponseBulkFavoriteResponse;
import org.openapitools.model.DataResponseBulkUnfavoriteResponse;
import org.openapitools.model.DataResponseBulkWorkflowStateChangeResponse;
import org.openapitools.model.DataResponseConfigurationResponse;
import org.openapitools.model.DataResponseCurrentUserResponse;
import org.openapitools.model.DataResponseDictionary;
import org.openapitools.model.DataResponseDomain;
import org.openapitools.model.DataResponseFlowContextOutputChannelMappingsResponse;
import org.openapitools.model.DataResponseGroupRole;
import org.openapitools.model.DataResponseImportResponse;
import org.openapitools.model.DataResponseLinkDTO;
import org.openapitools.model.DataResponseListGroupRole;
import org.openapitools.model.DataResponseMapStringListOutcome;
import org.openapitools.model.DataResponseRealtimeService;
import org.openapitools.model.DataResponseResource;
import org.openapitools.model.DataResponseResourceCategory;
import org.openapitools.model.DataResponseResourceVersion;
import org.openapitools.model.DataResponseRole;
import org.openapitools.model.DataResponseRolePermissions;
import org.openapitools.model.DataResponseSettingsObj;
import org.openapitools.model.DataResponseSolrCollection;
import org.openapitools.model.DataResponseTenant;
import org.openapitools.model.DataResponseTenantsConfiguration;
import org.openapitools.model.DataResponseTheme;
import org.openapitools.model.DataResponseTreeResourceVersion;
import org.openapitools.model.DataResponseWebappPermissionResponse;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.model.Domain;
import org.openapitools.model.EtagDescriptorRequest;
import org.openapitools.model.EtagDescriptorResponse;
import org.openapitools.model.ExportRequest;
import org.openapitools.model.FavoriteResourcesInput;
import org.openapitools.model.GenericResponse;
import org.openapitools.model.GroupRole;
import org.openapitools.model.LinkDTO;
import org.openapitools.model.ListResponseCollectionResource;
import org.openapitools.model.ListResponseDictionary;
import org.openapitools.model.ListResponseGroupRole;
import org.openapitools.model.ListResponseImportHistory;
import org.openapitools.model.ListResponseLinkDTO;
import org.openapitools.model.ListResponseRealtimeService;
import org.openapitools.model.ListResponseResourceCategory;
import org.openapitools.model.ListResponseResourceHistory;
import org.openapitools.model.ListResponseResourceVersion;
import org.openapitools.model.ListResponseRolePermissions;
import org.openapitools.model.ListResponseSettingsObj;
import org.openapitools.model.ListResponseTenant;
import org.openapitools.model.Manifest;
import org.openapitools.model.MultipleLinksBody;
import org.openapitools.model.Node;
import org.openapitools.model.NodeFilterRequest;
import java.time.OffsetDateTime;
import org.openapitools.model.OtmmSetting;
import org.openapitools.model.PackageOptions;
import org.openapitools.model.PageResponseCollectionResourceDetailResponse;
import org.openapitools.model.PageResponseDomain;
import org.openapitools.model.PageResponseLinkDTO;
import org.openapitools.model.PageResponseResourceVersion;
import org.openapitools.model.PageResponseRole;
import org.openapitools.model.PdfFragmentResponse;
import org.openapitools.model.PostGetThemeWithOptionsPayload;
import org.openapitools.model.RawDataResponse;
import org.openapitools.model.RealtimeService;
import org.openapitools.model.ResourceCategory;
import org.openapitools.model.ResourceFilter;
import org.openapitools.model.ResourceFilterRequest;
import org.openapitools.model.ResourceVersion;
import org.openapitools.model.Role;
import org.openapitools.model.RolePermissions;
import org.openapitools.model.RunDef;
import org.openapitools.model.SavedResource;
import org.openapitools.model.SavedResourceInput;
import org.openapitools.model.SettingsObj;
import org.openapitools.model.Theme;
import java.util.UUID;
import org.openapitools.model.UserProfileResponse;
import org.openapitools.model.VersionConfig;
import org.openapitools.model.VersionedId;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:02:16.213346402Z[Europe/Lisbon]")
@Controller
@RequestMapping("${openapi.exstreamDesign.base-path:/design}")
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
