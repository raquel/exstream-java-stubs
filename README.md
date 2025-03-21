# exstream-java-stubs
Temporary project

Client - openfeign
java -jar openapi-generator-cli.jar generate -i exstream-ce-design-api-21-2-0.json -g spring -o design-api --library=spring-cloud --additional-properties=javaVersion=21,springBootVersion=3.1.0,dateLibrary=java8,interfaceOnly=false,useSpringBoot3=true,swaggerAnnotations=true

Server
java -jar openapi-generator-cli.jar generate -i exstream-ce-design-api-21-2-0.json -g spring -o design-api --additional-properties=javaVersion=21,springBootVersion=3.1.0,dateLibrary=java8,interfaceOnly=false,useSpringBoot3=true,swaggerAnnotations=true
