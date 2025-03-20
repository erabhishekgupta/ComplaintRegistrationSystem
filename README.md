# Complaint Registration System

The Complaint Registration System is a web application that allows users to register and manage complaints efficiently. Each complaint is assigned a unique ticket number, and users can track its progress until resolution.

## Key Features 
✅Register Complaints – Users can submit complaints with details like project, module, priority, and issue description.\
✅ Auto-generated Ticket Number – Each complaint gets a unique ticket number for tracking.\
✅ Complaint Status Management – Complaints have statuses: New, Assigned, Resolved, and Closed.\
✅ Retrieve Complaints – Fetch all complaints or search by ID or Ticket Number.\
✅ Close Complaints – Users can update the status of a complaint when resolved.

## Acknowledgements
I would like to express my gratitude to Shivit Technologies for assigning this project and providing me with the opportunity to work on it.

This project, Complaint Registration System, was entirely developed by myself, from conceptualization to implementation. It was a great learning experience, allowing me to apply my skills in Spring, Hibernate, and MySQL to build a functional and efficient system.

A special thanks to everyone who provided guidance and feedback throughout the development process. Your support and insights were invaluable in refining the project.

## Installation Guide
Follow the steps below to set up and run the Complaint Registration System on your local machine.

### Prerequisites
Ensure you have the following installed on your system:

- Java 17 or later (JDK)
- Apache Maven
- Spring Boot
- MySQL Server
- Postman or any API testing tool (optional for testing)
### Step 1: Clone the Repository
`` git clone <repository-url>``

``cd complaint-registration-system``

### Step 2: Configure the Database
Open MySQL and create a new database:

``CREATE DATABASE complaint_system;``

Update the application.properties file in src/main/resources/ with your database credentials:


``spring.datasource.url=jdbc:mysql://localhost:3306/complaint_system``
``spring.datasource.username=root``
``spring.datasource.password=your_password``

``spring.jpa.hibernate.ddl-auto=update``
``spring.jpa.show-sql=true``
### Step 3: Build the Project
Run the following command to build the project:

``mvn clean install``

### Step 4: Run the Application
Start the Spring Boot application using:


``mvn spring-boot:run``
or

``java -jar target/complaint-registration-system.jar``
### Step 5: Test the API
Use Postman or any API testing tool to interact with the system.\
The application will be available at:


``http://localhost:8080/``
### Step 6: Available API Endpoints

Register Complaint  	POST	``/complaints/add``

List All Complaints 	GET	``/complaints/list``

Get Complaint by ID	 GET	``/complaints/getById/{id}``

Get by Ticket Number	GET	 ``/complaints/getByTicketNo/{ticketNo}``

Close Complaint	PUT 	``/complaints/closeComplaint/{id}``

### Step 7: Stop the Application
To stop the running application, press CTRL + C in the terminal.

## ScreenShots 
- This is post API where we can register complaint
![Image](https://github.com/user-attachments/assets/26fbd8d1-f9e4-45e1-9b51-22cba28eebdb)

- This is the post api generating ticket
![Image](https://github.com/user-attachments/assets/83229245-21a7-4dcd-bba0-c7f52c7fe99b)

- This is get api where we'll get the list of complaints
![Image](https://github.com/user-attachments/assets/d8e261aa-00cc-47fd-a59a-edb7e1c3a032)

- This is get api where we can get complaint details by it's ID
![Image](https://github.com/user-attachments/assets/8951d82e-ed42-4566-a629-aedd660d3930)

- This is get api where we can get complaint details by it's ticket number 
![Image](https://github.com/user-attachments/assets/ad79c904-5b6b-46d9-a22c-19366b066704)

- This is the put api where we can check && update the status of complaint
![Image](https://github.com/user-attachments/assets/ef0fcfc9-0218-42df-9387-89590875ce3f)


### Tech-Stack used 

The Complaint Registration System is built using the following technologies:

#### Backend Technologies

🔹 Spring Boot – For building the RESTful API and handling business logic\
🔹 Hibernate (JPA) – For ORM (Object-Relational Mapping) and database interactions\
🔹 MySQL – Relational database for storing complaint details\
🔹 Spring Data JPA – Simplifies database operations with repository support

#### Development Tools & Configuration
🔹 Maven – For dependency management and project build\
🔹 Postman – For testing REST API endpoints\
🔹 Lombok (Not used as per preference) – Avoided for explicit getter/setter methods\
🔹 Spring Boot DevTools – For faster application development with live reload

#### Server & Deployment
🔹 Spring Boot Embedded Tomcat – Default server for running the backend\
🔹 MySQL Workbench – For managing database operations
