package org.openapitools.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${config.name:config}", url="${config.url:https://vm-exstreamna1.eimdemo.com/orchestration}", configuration = ClientConfiguration.class)
public interface ConfigApiClient extends ConfigApi {
}
