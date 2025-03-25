package org.openapitools.configuration;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomErrorDecoder implements ErrorDecoder {

    private static final Logger logger = LoggerFactory.getLogger(CustomErrorDecoder.class);

    private final ErrorDecoder defaultErrorDecoder = new Default();

    @Override
    public Exception decode(String methodKey, Response response) {
        // Log the error details
        logger.error("Error occurred while calling method: {}. Status code: {}, Reason: {}",
                methodKey, response.status(), response.reason());

        // Handle specific HTTP status codes
        switch (response.status()) {
            case 400:
                return new BadRequestException("Bad Request: " + response.reason());
            case 404:
                return new NotFoundException("Not Found: " + response.reason());
            case 500:
                return new InternalServerErrorException("Internal Server Error: " + response.reason());
            default:
                // Use the default Feign error decoder for other cases
                return defaultErrorDecoder.decode(methodKey, response);
        }
    }

    // Custom exception classes
    public static class BadRequestException extends RuntimeException {
        public BadRequestException(String message) {
            super(message);
        }
    }

    public static class NotFoundException extends RuntimeException {
        public NotFoundException(String message) {
            super(message);
        }
    }

    public static class InternalServerErrorException extends RuntimeException {
        public InternalServerErrorException(String message) {
            super(message);
        }
    }
}