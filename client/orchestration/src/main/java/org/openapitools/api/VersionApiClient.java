package org.openapitools.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.openapitools.configuration.ClientConfiguration;

@FeignClient(name="${version.name:version}", url="${version.url:https://vm-exstreamna1.eimdemo.com/orchestration}", configuration = ClientConfiguration.class)
public interface VersionApiClient extends VersionApi {
}
