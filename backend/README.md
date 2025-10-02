# Sistema de Gestión de Alimentos - Fundación SI

## 🎯 Descripción

Sistema para gestionar inventarios de alimentos, registro de preparaciones y control nutricional en residencias estudiantiles.

## 🚀 Tecnologías

- **Backend**: Java 17 + Spring Boot 3.1.5
- **Base de Datos**: MySQL 8.0
- **Testing**: JUnit 5 + Spring Boot Test
- **Build Tool**: Maven

## 📋 Prerrequisitos

- Java 17+
- Maven 3.6+
- MySQL 8.0+ (para desarrollo)

## 🛠️ Setup de Desarrollo

### 1. Clonar y configurar

```bash
cd backend
./mvnw clean install
```

### 2. Ejecutar tests

```bash
./mvnw test
```

### 3. Ejecutar aplicación (requiere MySQL)

```bash
./mvnw spring-boot:run
```

### 4. Health Check

```bash
curl http://localhost:8080/actuator/health
```

## 📊 Estado del Proyecto

- ✅ Configuración base de Spring Boot
- ✅ Conexión a base de datos
- ✅ Health check endpoints
- ⏳ Entidades JPA (próximo)
- ⏳ APIs REST (próximo)

## 🧪 Testing

```bash
# Ejecutar todos los tests
./mvnw test

# Ejecutar test específico
./mvnw test -Dtest=AlimentosApplicationTest

# Ver coverage
./mvnw jacoco:report
```

## 📁 Estructura del Proyecto

```
src/
├── main/java/com/fundacionsi/alimentos/
│   ├── AlimentosApplication.java
│   ├── config/
│   │   └── SecurityConfig.java
│   ├── controller/
│   ├── service/
│   ├── repository/
│   └── entity/
├── main/resources/
│   └── application.yml
└── test/java/
    └── com/fundacionsi/alimentos/
```

## 🚀 Próximos Pasos

1. Implementar entidades JPA según BD schema
2. Crear repositorios y servicios
3. Desarrollar APIs REST
4. Configurar Docker Compose
