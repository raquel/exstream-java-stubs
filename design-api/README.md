# OpenAPI generated API stub

Spring Framework stub


## Overview
This code was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.
By using the [OpenAPI-Spec](https://openapis.org), you can easily generate an API stub.
This is an example of building API stub interfaces in Java using the Spring framework.

The stubs generated can be used in your existing Spring-MVC or Spring-Boot application to create controller endpoints
by adding ```@Controller``` classes that implement the interface. Eg:
```java
@Controller
public class PetController implements PetApi {
// implement all PetApi methods
}
```

You can also use the interface to create [Spring-Cloud Feign clients](http://projects.spring.io/spring-cloud/spring-cloud.html#spring-cloud-feign-inheritance).Eg:
```java
@FeignClient(name="pet", url="http://petstore.swagger.io/v2")
public interface PetClient extends PetApi {

}
```

RUN SERVER
mvn spring-boot:run

CLIENT
java -jar openapi-generator-cli.jar generate -i exstream-ce-design-api-21-2-0.json -g spring -o design-api --library=spring-cloud --additional-properties=javaVersion=21,springBootVersion=3.1.0,dateLibrary=java8,interfaceOnly=false,useSpringBoot3=true,swaggerAnnotations=true

SERVER
java -jar openapi-generator-cli.jar generate -i exstream-ce-design-api-21-2-0.json -g spring -o design-api --additional-properties=javaVersion=21,springBootVersion=3.1.0,dateLibrary=java8,interfaceOnly=false,useSpringBoot3=true,swaggerAnnotations=true
