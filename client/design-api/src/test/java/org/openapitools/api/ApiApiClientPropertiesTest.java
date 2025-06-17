package org.openapitools.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ApiApiClientPropertiesTest {

    @Value("${api.name}")
    private String apiName;

    @Value("${api.url}")
    private String apiUrl;

    @Test
    public void testApiProperties() {
        assertEquals("api", apiName, "api.name property should be 'api'");
        assertEquals("http://localhost/design", apiUrl, "api.url property should be 'http://localhost/design'");
    }
    
}