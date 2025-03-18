/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.CreateTenantBody;
import org.openapitools.model.DataResponseSettingType;
import org.openapitools.model.DataResponseTenant;
import org.openapitools.model.DataResponseTenantsConfiguration;
import org.openapitools.model.GenericResponse;
import org.openapitools.model.ListResponseSettingType;
import org.openapitools.model.ListResponseSettings;
import org.openapitools.model.ListResponseTenant;
import org.openapitools.model.SetttingsList;
import org.openapitools.model.VersionConfig;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-18T18:04:22.503697576Z[Europe/Lisbon]")
@Validated
@Tag(name = "tenant-admin-controller", description = "the tenant-admin-controller API")
public interface ApiApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /api/v1/tenants/{tenantId}
     *
     * @param tenantId  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "createTenantSchema",
        tags = { "tenant-admin-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = DataResponseTenant.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1/tenants/{tenantId}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<DataResponseTenant> createTenantSchema(
        @Size(min = 1, max = 40) @Parameter(name = "tenantId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("tenantId") String tenantId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"schema\" : { \"schemaMissingFromDatabase\" : true, \"schemaId\" : \"schemaId\", \"latestSchemaChangeLogEntry\" : { \"liquiBaseVersion\" : \"liquiBaseVersion\", \"orderExecuted\" : 0, \"id\" : \"id\", \"dateExecuted\" : \"2000-01-23T04:56:07.000+00:00\" } }, \"tenantId\" : \"tenantId\" }, \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/v1/tenants/addTenant
     *
     * @param createTenantBody  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "createTenantWithExistingSchema",
        tags = { "tenant-admin-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = DataResponseTenant.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1/tenants/addTenant",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<DataResponseTenant> createTenantWithExistingSchema(
        @Parameter(name = "CreateTenantBody", description = "", required = true) @Valid @RequestBody CreateTenantBody createTenantBody
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"schema\" : { \"schemaMissingFromDatabase\" : true, \"schemaId\" : \"schemaId\", \"latestSchemaChangeLogEntry\" : { \"liquiBaseVersion\" : \"liquiBaseVersion\", \"orderExecuted\" : 0, \"id\" : \"id\", \"dateExecuted\" : \"2000-01-23T04:56:07.000+00:00\" } }, \"tenantId\" : \"tenantId\" }, \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /api/v1/settings/{id} : Delete settings by either setting id or domain id, atleast one of the values should be passed for delete call. If setting id value is passed, domain id value will be ignored and setting will be deleted based on setting id
     * Delete settings by setting id or domain id
     *
     * @param id id of the setting to be deleted (required)
     * @param domainId domain for which settings must be deleted (optional)
     * @return OK (status code 200)
     *         or Forbidden (status code 403)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "deleteSettingsByIdOrDomainId",
        summary = "Delete settings by either setting id or domain id, atleast one of the values should be passed for delete call. If setting id value is passed, domain id value will be ignored and setting will be deleted based on setting id",
        description = "Delete settings by setting id or domain id",
        tags = { "settings-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "403", description = "Forbidden", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = GenericResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/v1/settings/{id}",
        produces = { "*/*" }
    )
    
    default ResponseEntity<GenericResponse> deleteSettingsByIdOrDomainId(
        @Parameter(name = "id", description = "id of the setting to be deleted", required = true, in = ParameterIn.PATH) @PathVariable("id") String id,
        @Parameter(name = "domainId", description = "domain for which settings must be deleted", in = ParameterIn.QUERY) @Valid @RequestParam(value = "domainId", required = false) String domainId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /api/v1/settings : Delete settings by either setting id or domain id, atleast one of the values should be passed for delete call. If setting id value is passed, domain id value will be ignored and setting will be deleted based on setting id
     * Delete settings by setting id or domain id
     *
     * @param id id of the setting to be deleted (required)
     * @param domainId domain for which settings must be deleted (optional)
     * @return OK (status code 200)
     *         or Forbidden (status code 403)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "deleteSettingsByIdOrDomainId1",
        summary = "Delete settings by either setting id or domain id, atleast one of the values should be passed for delete call. If setting id value is passed, domain id value will be ignored and setting will be deleted based on setting id",
        description = "Delete settings by setting id or domain id",
        tags = { "settings-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "403", description = "Forbidden", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = GenericResponse.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = GenericResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/v1/settings",
        produces = { "*/*" }
    )
    
    default ResponseEntity<GenericResponse> deleteSettingsByIdOrDomainId1(
        @Parameter(name = "id", description = "id of the setting to be deleted", required = true, in = ParameterIn.PATH) @PathVariable("id") String id,
        @Parameter(name = "domainId", description = "domain for which settings must be deleted", in = ParameterIn.QUERY) @Valid @RequestParam(value = "domainId", required = false) String domainId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/version/api
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getApiVersion",
        tags = { "version-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = String.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/version/api",
        produces = { "application/json" }
    )
    
    default ResponseEntity<String> getApiVersion(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/tenants/{tenantId}
     *
     * @param tenantId  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getTenant",
        tags = { "tenant-admin-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = DataResponseTenant.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/tenants/{tenantId}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<DataResponseTenant> getTenant(
        @Parameter(name = "tenantId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("tenantId") String tenantId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"schema\" : { \"schemaMissingFromDatabase\" : true, \"schemaId\" : \"schemaId\", \"latestSchemaChangeLogEntry\" : { \"liquiBaseVersion\" : \"liquiBaseVersion\", \"orderExecuted\" : 0, \"id\" : \"id\", \"dateExecuted\" : \"2000-01-23T04:56:07.000+00:00\" } }, \"tenantId\" : \"tenantId\" }, \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/tenants/configuration
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getTenantConfiguration",
        tags = { "tenant-admin-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = DataResponseTenantsConfiguration.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/tenants/configuration",
        produces = { "application/json" }
    )
    
    default ResponseEntity<DataResponseTenantsConfiguration> getTenantConfiguration(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"autoSchemaManagement\" : true }, \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/tenants
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getTenants",
        tags = { "tenant-admin-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ListResponseTenant.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/tenants",
        produces = { "application/json" }
    )
    
    default ResponseEntity<ListResponseTenant> getTenants(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : [ { \"schema\" : { \"schemaMissingFromDatabase\" : true, \"schemaId\" : \"schemaId\", \"latestSchemaChangeLogEntry\" : { \"liquiBaseVersion\" : \"liquiBaseVersion\", \"orderExecuted\" : 0, \"id\" : \"id\", \"dateExecuted\" : \"2000-01-23T04:56:07.000+00:00\" } }, \"tenantId\" : \"tenantId\" }, { \"schema\" : { \"schemaMissingFromDatabase\" : true, \"schemaId\" : \"schemaId\", \"latestSchemaChangeLogEntry\" : { \"liquiBaseVersion\" : \"liquiBaseVersion\", \"orderExecuted\" : 0, \"id\" : \"id\", \"dateExecuted\" : \"2000-01-23T04:56:07.000+00:00\" } }, \"tenantId\" : \"tenantId\" } ], \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/version
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "getVersion",
        tags = { "version-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = VersionConfig.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/version",
        produces = { "application/json" }
    )
    
    default ResponseEntity<VersionConfig> getVersion(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"patch\" : \"patch\", \"major\" : \"major\", \"minor\" : \"minor\", \"versionString\" : \"versionString\", \"apiIdentifier\" : \"apiIdentifier\", \"details\" : { \"git\" : { \"commits\" : \"commits\", \"tag\" : \"tag\", \"branch\" : \"branch\", \"hash\" : \"hash\" }, \"appName\" : \"appName\", \"buildNumber\" : \"buildNumber\", \"timestamp\" : \"timestamp\" }, \"clientVersion\" : \"clientVersion\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/v1/secrets/migrateVault : Migrate secrets to vault.
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "migrateVault",
        summary = "Migrate secrets to vault.",
        tags = { "secrets-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = Boolean.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/v1/secrets/migrateVault",
        produces = { "*/*" }
    )
    
    default ResponseEntity<Boolean> migrateVault(
        
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/setting-types/{typeId} : Retrieve a specific setting type
     * Retrieve a setting type
     *
     * @param typeId Setting type to retrieve. Allowed values are OTN, CORE_SIGNATURE. (required)
     * @param loadSettings Flag to decide if associated settings must be loaded. Allowed values are true/false. Default value is false. (optional)
     * @return OK (status code 200)
     *         or Forbidden (status code 403)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "retrieveSettingType",
        summary = "Retrieve a specific setting type",
        description = "Retrieve a setting type",
        tags = { "setting-types-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = DataResponseSettingType.class))
            }),
            @ApiResponse(responseCode = "403", description = "Forbidden", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = DataResponseSettingType.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = DataResponseSettingType.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/setting-types/{typeId}",
        produces = { "*/*" }
    )
    
    default ResponseEntity<DataResponseSettingType> retrieveSettingType(
        @Parameter(name = "typeId", description = "Setting type to retrieve. Allowed values are OTN, CORE_SIGNATURE.", required = true, in = ParameterIn.PATH) @PathVariable("typeId") String typeId,
        @Parameter(name = "loadSettings", description = "Flag to decide if associated settings must be loaded. Allowed values are true/false. Default value is false.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "loadSettings", required = false) String loadSettings
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"data\" : { \"settings\" : [ { \"modifiedTime\" : \"2000-01-23T04:56:07.000+00:00\", \"settingDetails\" : { \"key\" : \"settingDetails\" }, \"modifiedBy\" : \"modifiedBy\", \"id\" : 0, \"type\" : \"UNKNOWN\", \"domainId\" : \"domainId\" }, { \"modifiedTime\" : \"2000-01-23T04:56:07.000+00:00\", \"settingDetails\" : { \"key\" : \"settingDetails\" }, \"modifiedBy\" : \"modifiedBy\", \"id\" : 0, \"type\" : \"UNKNOWN\", \"domainId\" : \"domainId\" } ], \"type\" : \"type\" }, \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/setting-types : Retrieve all setting types
     * Retrieve setting types
     *
     * @param loadSettings Flag to decide if associated settings must be loaded. Allowed values are true/false. Default value is false. (optional)
     * @return OK (status code 200)
     *         or Forbidden (status code 403)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "retrieveSettingTypes",
        summary = "Retrieve all setting types",
        description = "Retrieve setting types",
        tags = { "setting-types-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = ListResponseSettingType.class))
            }),
            @ApiResponse(responseCode = "403", description = "Forbidden", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = ListResponseSettingType.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = ListResponseSettingType.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/setting-types",
        produces = { "*/*" }
    )
    
    default ResponseEntity<ListResponseSettingType> retrieveSettingTypes(
        @Parameter(name = "loadSettings", description = "Flag to decide if associated settings must be loaded. Allowed values are true/false. Default value is false.", in = ParameterIn.QUERY) @Valid @RequestParam(value = "loadSettings", required = false) String loadSettings
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"data\" : [ { \"settings\" : [ { \"modifiedTime\" : \"2000-01-23T04:56:07.000+00:00\", \"settingDetails\" : { \"key\" : \"settingDetails\" }, \"modifiedBy\" : \"modifiedBy\", \"id\" : 0, \"type\" : \"UNKNOWN\", \"domainId\" : \"domainId\" }, { \"modifiedTime\" : \"2000-01-23T04:56:07.000+00:00\", \"settingDetails\" : { \"key\" : \"settingDetails\" }, \"modifiedBy\" : \"modifiedBy\", \"id\" : 0, \"type\" : \"UNKNOWN\", \"domainId\" : \"domainId\" } ], \"type\" : \"type\" }, { \"settings\" : [ { \"modifiedTime\" : \"2000-01-23T04:56:07.000+00:00\", \"settingDetails\" : { \"key\" : \"settingDetails\" }, \"modifiedBy\" : \"modifiedBy\", \"id\" : 0, \"type\" : \"UNKNOWN\", \"domainId\" : \"domainId\" }, { \"modifiedTime\" : \"2000-01-23T04:56:07.000+00:00\", \"settingDetails\" : { \"key\" : \"settingDetails\" }, \"modifiedBy\" : \"modifiedBy\", \"id\" : 0, \"type\" : \"UNKNOWN\", \"domainId\" : \"domainId\" } ], \"type\" : \"type\" } ], \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/v1/settings : Retrieve all settings for a tenant or a specific domain
     * Retrieve settings
     *
     * @param domainId domain for which settings must be retrieved (optional)
     * @return OK (status code 200)
     *         or Forbidden (status code 403)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "retrieveSettings",
        summary = "Retrieve all settings for a tenant or a specific domain",
        description = "Retrieve settings",
        tags = { "settings-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = ListResponseSettings.class))
            }),
            @ApiResponse(responseCode = "403", description = "Forbidden", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = ListResponseSettings.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = ListResponseSettings.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/v1/settings",
        produces = { "*/*" }
    )
    
    default ResponseEntity<ListResponseSettings> retrieveSettings(
        @Parameter(name = "domainId", description = "domain for which settings must be retrieved", in = ParameterIn.QUERY) @Valid @RequestParam(value = "domainId", required = false) String domainId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"data\" : [ { \"modifiedTime\" : \"2000-01-23T04:56:07.000+00:00\", \"settingDetails\" : { \"key\" : \"settingDetails\" }, \"modifiedBy\" : \"modifiedBy\", \"id\" : 0, \"type\" : \"UNKNOWN\", \"domainId\" : \"domainId\" }, { \"modifiedTime\" : \"2000-01-23T04:56:07.000+00:00\", \"settingDetails\" : { \"key\" : \"settingDetails\" }, \"modifiedBy\" : \"modifiedBy\", \"id\" : 0, \"type\" : \"UNKNOWN\", \"domainId\" : \"domainId\" } ], \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /api/v1/settings : Save a list of settings in domains
     * Save settings
     *
     * @param setttingsList  (required)
     * @return OK (status code 200)
     *         or Forbidden (status code 403)
     *         or Internal Server Error (status code 500)
     */
    @Operation(
        operationId = "saveSettings",
        summary = "Save a list of settings in domains",
        description = "Save settings",
        tags = { "settings-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = ListResponseSettings.class))
            }),
            @ApiResponse(responseCode = "403", description = "Forbidden", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = ListResponseSettings.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal Server Error", content = {
                @Content(mediaType = "*/*", schema = @Schema(implementation = ListResponseSettings.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/v1/settings",
        produces = { "*/*" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<ListResponseSettings> saveSettings(
        @Parameter(name = "SetttingsList", description = "", required = true) @Valid @RequestBody SetttingsList setttingsList
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("*/*"))) {
                    String exampleString = "{ \"data\" : [ { \"modifiedTime\" : \"2000-01-23T04:56:07.000+00:00\", \"settingDetails\" : { \"key\" : \"settingDetails\" }, \"modifiedBy\" : \"modifiedBy\", \"id\" : 0, \"type\" : \"UNKNOWN\", \"domainId\" : \"domainId\" }, { \"modifiedTime\" : \"2000-01-23T04:56:07.000+00:00\", \"settingDetails\" : { \"key\" : \"settingDetails\" }, \"modifiedBy\" : \"modifiedBy\", \"id\" : 0, \"type\" : \"UNKNOWN\", \"domainId\" : \"domainId\" } ], \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "*/*", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /api/v1/tenants/updateTenant
     *
     * @param createTenantBody  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "updateTenant",
        tags = { "tenant-admin-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = DataResponseTenant.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/v1/tenants/updateTenant",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default ResponseEntity<DataResponseTenant> updateTenant(
        @Parameter(name = "CreateTenantBody", description = "", required = true) @Valid @RequestBody CreateTenantBody createTenantBody
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"schema\" : { \"schemaMissingFromDatabase\" : true, \"schemaId\" : \"schemaId\", \"latestSchemaChangeLogEntry\" : { \"liquiBaseVersion\" : \"liquiBaseVersion\", \"orderExecuted\" : 0, \"id\" : \"id\", \"dateExecuted\" : \"2000-01-23T04:56:07.000+00:00\" } }, \"tenantId\" : \"tenantId\" }, \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /api/v1/tenants/{tenantId}/schema
     *
     * @param tenantId  (required)
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "updateTenantSchema",
        tags = { "tenant-admin-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = DataResponseTenant.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/v1/tenants/{tenantId}/schema",
        produces = { "application/json" }
    )
    
    default ResponseEntity<DataResponseTenant> updateTenantSchema(
        @Parameter(name = "tenantId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("tenantId") String tenantId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : { \"schema\" : { \"schemaMissingFromDatabase\" : true, \"schemaId\" : \"schemaId\", \"latestSchemaChangeLogEntry\" : { \"liquiBaseVersion\" : \"liquiBaseVersion\", \"orderExecuted\" : 0, \"id\" : \"id\", \"dateExecuted\" : \"2000-01-23T04:56:07.000+00:00\" } }, \"tenantId\" : \"tenantId\" }, \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /api/v1/tenants/all/schema
     *
     * @return OK (status code 200)
     */
    @Operation(
        operationId = "updateTenantSchemas",
        tags = { "tenant-admin-controller" },
        responses = {
            @ApiResponse(responseCode = "200", description = "OK", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ListResponseTenant.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/v1/tenants/all/schema",
        produces = { "application/json" }
    )
    
    default ResponseEntity<ListResponseTenant> updateTenantSchemas(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"data\" : [ { \"schema\" : { \"schemaMissingFromDatabase\" : true, \"schemaId\" : \"schemaId\", \"latestSchemaChangeLogEntry\" : { \"liquiBaseVersion\" : \"liquiBaseVersion\", \"orderExecuted\" : 0, \"id\" : \"id\", \"dateExecuted\" : \"2000-01-23T04:56:07.000+00:00\" } }, \"tenantId\" : \"tenantId\" }, { \"schema\" : { \"schemaMissingFromDatabase\" : true, \"schemaId\" : \"schemaId\", \"latestSchemaChangeLogEntry\" : { \"liquiBaseVersion\" : \"liquiBaseVersion\", \"orderExecuted\" : 0, \"id\" : \"id\", \"dateExecuted\" : \"2000-01-23T04:56:07.000+00:00\" } }, \"tenantId\" : \"tenantId\" } ], \"status\" : \"status\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
