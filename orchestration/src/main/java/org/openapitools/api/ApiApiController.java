package org.openapitools.api;

import org.openapitools.model.ConfigurationFilterRequest;
import org.openapitools.model.CreateTenantBody;
import org.openapitools.model.CronJob;
import org.openapitools.model.DataResponseBoolean;
import org.openapitools.model.DataResponseConfiguration;
import org.openapitools.model.DataResponseCronJob;
import org.openapitools.model.DataResponseDeletableResource;
import org.openapitools.model.DataResponseFlowInstance;
import org.openapitools.model.DataResponseFlowInstancesAndAssociatedJobs;
import org.openapitools.model.DataResponseFlowModelContextSnapshot;
import org.openapitools.model.DataResponseFlowModelSnapshot;
import org.openapitools.model.DataResponseFlowStep;
import org.openapitools.model.DataResponseFlowStepFlow;
import org.openapitools.model.DataResponseJob;
import org.openapitools.model.DataResponseJobDeleteStatus;
import org.openapitools.model.DataResponseJsonNode;
import org.openapitools.model.DataResponseMapObjectObject;
import org.openapitools.model.DataResponseMapStringPlugin;
import org.openapitools.model.DataResponseSortingAsset;
import org.openapitools.model.DataResponseTenant;
import org.openapitools.model.DataResponseTenantFlowmodel;
import org.openapitools.model.DataResponseTenantsConfiguration;
import org.openapitools.model.FlowInstanceCountsFilterRequest;
import org.openapitools.model.FlowInstanceFilterRequest;
import org.openapitools.model.FlowModelContextFilterRequest;
import org.openapitools.model.FlowModelSnapshotFilterRequest;
import org.openapitools.model.FlowObjectsRequest;
import org.openapitools.model.FlowStepFilterRequest;
import org.openapitools.model.GenericResponse;
import org.openapitools.model.HostKey;
import org.openapitools.model.JobFilterRequest;
import org.openapitools.model.ListResponseCronJob;
import org.openapitools.model.ListResponseFlowModelContextSnapshot;
import org.openapitools.model.ListResponseHostKey;
import org.openapitools.model.ListResponseString;
import org.openapitools.model.ListResponseTenant;
import org.openapitools.model.ListResponseTenantFlowmodel;
import org.openapitools.model.ModelConfiguration;
import org.openapitools.model.PageResponseConfiguration;
import org.openapitools.model.PageResponseFlowInstance;
import org.openapitools.model.PageResponseFlowModelContextSnapshot;
import org.openapitools.model.PageResponseFlowModelSnapshot;
import org.openapitools.model.PageResponseFlowStep;
import org.openapitools.model.PageResponseJob;
import org.openapitools.model.PageResponseString;
import org.openapitools.model.PostSortRunOption;
import org.openapitools.model.PublicOrcConfiguration;
import org.openapitools.model.SecretInfo;
import org.openapitools.model.SimplePageRequest;
import org.openapitools.model.SortingDataFilterRequest;
import java.util.UUID;
import org.openapitools.model.UpdateState1Request;
import org.openapitools.model.UpdateStateRequest;
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

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:03:17.210646522Z[Europe/Lisbon]")
@Controller
@RequestMapping("${openapi.exstreamOrchestration.base-path:/orchestration}")
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
