package org.openapitools.configuration;

import org.springframework.beans.factory.annotation.Value;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import feign.Util;


public class ApiKeyRequestInterceptor implements RequestInterceptor {

  @Value("${api.token.location}")
  private final String location;

  @Value("${api.token.name:Authorization}")
  private final String name;

  @Value("${api.token.value:Bearer <your-api-token>}")
  private String value; 

  
  public ApiKeyRequestInterceptor(String location, String name, String value) {
    Util.checkNotNull(location, "location", new Object[0]);
    Util.checkNotNull(name, "name", new Object[0]);
    Util.checkNotNull(value, "value", new Object[0]);
    this.location = location;
    this.name = name;
    this.value = value;
  }

  @Override
  public void apply(RequestTemplate requestTemplate) {
    if(location.equals("header")) {
      requestTemplate.header(name, value);
    } else if(location.equals("query")) {
      requestTemplate.query(name, value);
    }
  }

}
