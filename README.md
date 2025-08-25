# Spring Security Basics

## Overview
This project demonstrates the basics of Spring Security in a Java Spring Boot application. It uses Maven for dependency management and follows standard Spring Boot conventions.

## Features
- User authentication and authorization
- Secure REST endpoints
- Custom security configuration
- Role-based access control

## Technologies Used
- Java
- Spring Boot
- Spring Security
- Maven

## Getting Started

### Prerequisites
- Java 17 or higher
- Maven 3.8+
- Git

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/asathsara/spring-security-basics.git
   cd spring-security-basics
   ```

2. Build the project:
   ```sh
   mvn clean install
   ```

3. Run the application:
   ```sh
   mvn spring-boot:run
   ```

### Configuration
- Security settings can be customized in `src/main/java/.../SecurityConfig.java`.
- Application properties are managed in `src/main/resources/application.properties`.

## Usage

- Access the application at `http://localhost:8080`.
- Default endpoints are protected; authentication is required.
- Example users and roles are defined in the security configuration.

## Project Structure

```
spring-security-basics/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── ... (source code)
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
├── pom.xml
└── README.md
```

## Contributing
Pull requests are welcome. For major changes, open an issue first to discuss what you would like to change.

## License
This project is licensed under the MIT License.

