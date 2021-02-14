

# AmeriSave Sample Project

## Purpose
The purpose of this exercise is for you to demonstrate the ability to architect and code a solution in JAVA.

You should not spend more than 2 hours on this assignment. If you run out of time and don’t complete it, that’s perfectly fine – we are interested in understanding how you set up your code, how you design it, implement it (even if it’s partially implemented) and how you manage your time.

## Scope
We would like you to architect and implement a contact management application that will allow the following functionality:

* Add contact
* Edit contact
* Remove contact

A contact should contain at least the following fields:
* First name
* Last name
* Email address

### Architecture and Frameworks
You are free to choose how you architect the solution. It could be a command line app, a REST API, a web page or another interface of your choice.

You can also select the framework(s), libraries and dependency management of your choice (if any). The only requirement is the use of JAVA.

### Guidelines
The solution should persist the contacts in memory and only during the runtime – it does not need to use a more permanent storage
For the sake of time, you can leave comments in the code indicating TODOs that would need to be implemented in order for the complete solution to work
Please provide us with a ZIP file or a download link to your solution

---
## Customer Demo
### Java 
This demo application uses JDK 15 and maven.

* mvn clean install
* java -jar target/customer.jar
  
### SpringBoot
* mvn clean install
* mvn spring-boot:run

### Postman
I created a Postman Collection of requests to demo the application. Located in src/test/postman
* You can download Postman here: https://www.postman.com/downloads/
* How in import a Postman Collection: https://learning.postman.com/docs/getting-started/importing-and-exporting-data/#importing-data-into-postman

### API
Supports: GET, POST, PATCH, DELETE

http://localhost:8080/customer - List all customers. 

http://localhost:8080/customer/search/findByLastName?lastName= - List contains customers with matching last names.  

http://localhost:8080/customer/1 - get a specific customer by ID.

Sample Body:
    
{ "firstName": "Paula", "lastName": "Anderson", "emailAddress":"someone@email.com", "phoneNumber":"3035551213" }
