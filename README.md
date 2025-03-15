# Project Documentation: Soumyajit Spring Boot Application

## Overview
This is a Spring Boot application that provides an image storage and retrieval service using an H2 database. It includes functionalities for uploading and downloading images, managing image metadata, and serving web-based interactions. 

## Technologies Used
- **Spring Boot 3.4.3**: Simplifies Java application development.
- **Spring Boot Starter Web**: Provides RESTful web services.
- **Spring Boot Starter Data JDBC**: Manages database interactions.
- **Spring Boot Starter Validation**: Ensures request data integrity.
- **H2 Database**: In-memory database for lightweight storage.
- **Spring Boot Starter Test**: Supports unit and integration testing.

## Project Structure
```
src/main/java/soumyajit/example/soumyajit
│── model
│   ├── Photo.java            # Entity class for photo metadata
│── repository
│   ├── PhotozRepository.java # Interface for database operations
│── service
│   ├── PhotozService.java    # Business logic for handling photos
│── web
│   ├── PhotozController.java # Handles image upload and retrieval API
│   ├── DownloadController.java # Manages file downloads
│   ├── SoumyajitApplication.java # Main Spring Boot application entry point
```

## Features
1. **Upload Images**: Users can upload images using an HTML form.
2. **Store Metadata**: Images are saved in an H2 database with relevant details.
3. **Download Images**: Users can download previously uploaded images.
4. **REST API**: Provides endpoints to interact with image data.
5. **Validation**: Ensures correct data input using Spring Validation.

## How to Run
1. Clone the repository.
2. Navigate to the project directory and run:
   ```bash
   mvn spring-boot:run
   ```
3. Open `http://localhost:8080` in your browser.

## Endpoints
| Method | Endpoint | Description |
|--------|---------|-------------|
| `POST` | `/upload` | Uploads an image |
| `GET` | `/download/{id}` | Downloads an image by ID |
| `GET` | `/photos` | Retrieves all stored photos |

## Database Configuration
The application uses an H2 in-memory database. Configuration can be found in `application.properties`:
```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

## Future Enhancements
- Implement user authentication for secure access.
- Enable cloud storage for scalability.
- Improve frontend UI for a better user experience.

This documentation provides an overview of the project and how it functions. Let me know if you need further details! 🚀
