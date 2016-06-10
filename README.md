# spring-boot-rest-soap

- Import project to Eclipse
------------------------------------------------------------------------
1. Go to menu File -> Imports -> Existing Maven Projects


- How to run app
------------------------------------------------------------------------
1. mvn spring-boot:run
2. go to 
	http://localhost:8080/[URL path here] for REST services 
	http://localhost:8080/ws/authservice.wsdl to get WSDL

or..
If you have Spring IDE plugins installed in your Eclipse, you can run by:
right click on project -> Run As -> Spring Boot App 	

- How to create and run executable jar file
------------------------------------------------------------------------
1. mvn clean package
2. java -jar target\spring-boot-rest-soap-0.1.0.jar --server.port=[port number here]
3. go to 
	http://localhost:[port number here]/[URL path here] for REST services 
	http://localhost:[port number here]/ws/authservice.wsdl to get WSDL

- Log files
------------------------------------------------------------------------
spring_boot_rest_soap.log
spring_boot_rest_soap_error.log
