package org.openapitools.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.openapitools.api.ApiApiClient;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.UUID;

import static org.mockito.Mockito.verify;

@SpringBootTest
public class ExportServiceTest {

    @Test
    public void testExportResources() {
        ApiApiClient mockApiApiClient = Mockito.mock(ApiApiClient.class);
        ExportService exportService = new ExportService(mockApiApiClient);

        UUID rootId = UUID.randomUUID();
        String domain = "exampleDomain";

        exportService.exportResources(rootId, domain);

        verify(mockApiApiClient).exportResourcesFromRootInDomainUsingGET(domain, rootId, "LATEST_APPROVED");
    }
}