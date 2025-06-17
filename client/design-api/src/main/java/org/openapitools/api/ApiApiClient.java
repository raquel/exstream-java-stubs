package org.openapitools.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

import org.openapitools.configuration.ClientConfiguration;
import org.openapitools.model.DataResponseTheme;

@FeignClient(name="${api.name}", url="${api.url}", configuration = ClientConfiguration.class)
public interface ApiApiClient extends ApiApi {

    // Use this or the same approach as ThemeSeervice
    default DataResponseTheme getTheme(UUID themeId) {
        String domain = "defaultDomain"; // Replace with your default domain
        Integer version = -1; // Default version

        // Call the existing method
        ResponseEntity<DataResponseTheme> response = getThemeUsingGET(domain, themeId, version);

        // Return the body of the response
        return response.getBody();
    }
    
}
