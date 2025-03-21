package org.openapitools.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${api.name:api}", url="${api.url:http://localhost/design}", configuration = ClientConfiguration.class)
public interface ApiApiClient extends ApiApi {
}
