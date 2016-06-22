# Simple REST experiment

An experiment exposing an API built with [Apache CXF](http://cxf.apache.org/), withe the same service in REST and SOAP. Also experimenting with the documentation created with **Swagger** (now OpenAPI).
The annotations were created with the following dependency:
```xml
		<dependency>
			<groupId>com.wordnik</groupId>
			<artifactId>swagger-jaxrs_2.10</artifactId>
			<version>1.3.13</version>
		</dependency>	
```		

## TODO
* Migrate Swagger code to a new dependency and a better building strategy (`io.swagger`?)
* Experiment with parsing Swagger
* Create another example with [RESTEasy](http://resteasy.jboss.org/)
