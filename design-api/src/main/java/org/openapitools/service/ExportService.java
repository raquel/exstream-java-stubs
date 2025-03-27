package org.openapitools.service;

import org.openapitools.api.ApiApiClient;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ExportService {

    private final ApiApiClient apiApiClient;

    public ExportService(ApiApiClient apiApiClient) {
        this.apiApiClient = apiApiClient;
    }

    public void exportResources(UUID rootId, String domain) {
        apiApiClient.exportResourcesFromRootInDomainUsingGET(domain, rootId, "LATEST_APPROVED");
        System.out.println("Export request sent successfully.");
    }
}