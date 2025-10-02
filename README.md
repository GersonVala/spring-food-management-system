# 🍽️ Spring Food Management System

Enterprise-grade food inventory and nutrition management system built with Spring Boot for student residences.

## 🚀 Tech Stack

- **Backend**: Java 17, Spring Boot 3.1.5
- **Database**: MySQL 8.0 (Production), H2 (Testing)
- **Build Tool**: Maven
- **Testing**: JUnit 5, Spring Boot Test
- **Architecture**: MVC with Repository Pattern

## 🏗️ Features

- **Role-based Inventory Control**: Residence-specific access management
- **Atomic Transactions**: Consistent meal preparation tracking
- **Multi-profile Configuration**: Separate development and testing environments
- **Nutritional Tracking**: Comprehensive meal and ingredient monitoring
- **TDD Approach**: Test-driven development with Spanish nomenclature

## 🛠️ Quick Start

### Prerequisites
- Java 17+
- Maven 3.6+
- MySQL 8.0+

### Running the Application

```bash
# Clone the repository
git clone https://github.com/GersonVala/spring-food-management-system.git
cd spring-food-management-system/backend

# Run tests
./mvnw test

# Start the application
./mvnw spring-boot:run
```

### Health Check
```bash
curl http://localhost:8080/actuator/health
```

## 📊 Project Status

- ✅ Spring Boot foundation
- ✅ Database connectivity  
- ✅ Security configuration
- ✅ Testing framework
- ⏳ JPA entities (in progress)
- ⏳ REST APIs (planned)
- ⏳ Frontend integration (planned)

## 🏛️ Architecture

```
backend/
├── src/main/java/com/fundacionsi/alimentos/
│   ├── AlimentosApplication.java          # Application entry point
│   ├── config/SecurityConfig.java         # Security configuration
│   ├── controller/                        # REST controllers
│   ├── service/                          # Business logic
│   ├── repository/                       # Data access layer
│   └── entity/                          # JPA entities
├── src/main/resources/
│   ├── application.yml                   # Production config
│   └── application-test.yml              # Testing config
└── src/test/java/                        # Test suite
```

## 🧪 Testing

The project follows TDD (Test-Driven Development) with Spanish naming conventions:

```bash
# Run all tests
./mvnw test

# Run specific test
./mvnw test -Dtest=AlimentosApplicationTest
```

## 🤝 Contributing

This project follows professional development practices:
- TDD methodology with `dado_cuando_entonces` naming
- Atomic commits with descriptive messages
- Separate profiles for development and testing
- Comprehensive test coverage

## 📝 License

This project is developed for educational and professional demonstration purposes.

---

**Built with ❤️ using Spring Boot and modern Java practices**