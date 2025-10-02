# AI Agent Instructions - Fundación SI Food Management System

## Learning & Educational Context

**🎓 IMPORTANTE: Este es un proyecto de aprendizaje**

-   El desarrollador está aprendiendo Spring Boot, arquitectura de software y mejores prácticas
-   **SIEMPRE explica qué estás haciendo y por qué** en cada paso
-   Detalla el propósito de cada archivo, configuración y decisión técnica
-   Usa ejemplos concretos del código para explicar conceptos
-   Comparte el razonamiento detrás de patrones de diseño y convenciones
-   Cuando encuentres errores, explica qué los causó y cómo se solucionan
-   Prefiere respuestas educativas que enseñen sobre respuestas rápidas sin contexto

## Project Overview

Java 17 + Spring Boot 3.1.5 food inventory management system for student residences. Features role-based inventory control, atomic preparation transactions, and nutritional tracking.

## Key Architecture Patterns

### Backend Structure

-   **Entry Point**: `backend/src/main/java/com/fundacionsi/alimentos/AlimentosApplication.java`
-   **Configuration**: Spring Security in `config/SecurityConfig.java` - permits actuator endpoints
-   **Testing**: TDD approach with Given-When-Then pattern in Spanish (`dado_cuando_entonces`)
-   **Database**: MySQL (prod) + H2 (tests) with profile-based configuration

### Critical Workflows

#### Environment Setup (Pre-development)

```bash
# ALWAYS verify Java 17 is active before any Maven command
java -version  # Must show "17.x.x"
cd backend && ./mvnw clean compile
```

#### Test-Driven Development Cycle

1. Write failing test with `dado_cuando_entonces` naming
2. Implement minimal code to pass test
3. Refactor with justification
4. Tests run via: `./mvnw test -Dtest=SpecificTest`

#### Application Profiles

-   **Development**: `application.yml` - MySQL with `ddl-auto: validate`
-   **Testing**: `application-test.yml` - H2 in-memory with `ddl-auto: create-drop`
-   All tests use `@ActiveProfiles("test")` annotation

## Project-Specific Conventions

### Role-Based Inventory Rules

-   **RESIDENTE**: Can only add inventory to their assigned residence (auto-assigned)
-   **VOLUNTARIO/ADMIN**: Must specify target residence when adding inventory
-   Implement as service-layer constraints, not controller validations

### Atomic Transaction Pattern

Preparation registration must be fully atomic:

```java
// If ANY ingredient lacks stock -> complete rollback
// NO partial updates to inventory allowed
// Use @Transactional with appropriate isolation level
```

### Test Naming & Structure

```java
@Test
void debería_descontar_stock_cuando_preparación_tiene_inventario_suficiente() {
    // Given: (setup test data)
    // When: (execute action)
    // Then: (verify results)
}
```

## VS Code Integration

### Critical Extensions

Run when opening project: `Ctrl+Shift+P` → `Extensions: Show Recommended Extensions`

-   Extension Pack for Java (vscjava.vscode-java-pack)
-   Spring Boot Extension Pack (Pivotal.vscode-spring-boot)

### Essential Tasks (Ctrl+Shift+P → Tasks: Run Task)

-   `Maven: Test` - Run all tests
-   `Maven: Spring Boot Run` - Start application (port 8080)
-   `Maven: Clean Install` - Full build cycle

### Debug Configuration

-   `F5` - Debug mode (uses `launch.json` configurations)
-   Health check: http://localhost:8080/actuator/health

## Business Domain Knowledge

### Core Entities (from requirements)

-   **Batch**: Inventory lots with expiration tracking
-   **Preparation**: Cooking events that consume inventory atomically
-   **Inventory**: Consolidated stock view per residence
-   **Recipes (Dishes)**: Standardized preparations with ingredient requirements

### Security Model

Users have residence assignments that control inventory operations. Service layer enforces these constraints - never rely on UI-level restrictions alone.

### Nutritional Calculations

Future feature requiring precise macro calculations from ingredient nutritional profiles. Plan for `NutritionCalculatorService` integration.

## Development Workflow

### Before Any Code Changes

1. Verify Java 17: `java -version`
2. Ensure tests pass: `./mvnw test`
3. Check application starts: `./mvnw spring-boot:run`

### TDD Implementation (per `agents/agentsTDD.md`)

1. Generate prioritized test cases list
2. Create failing test with exact run command
3. Implement minimal passing code
4. Refactor with documented justification
5. Repeat for each test case

### Educational Approach for Development

**Cuando implementes cualquier funcionalidad:**

-   Explica la arquitectura Spring Boot relevante (ej: por qué usamos `@Service`, `@Repository`)
-   Describe patrones de diseño aplicados (ej: Dependency Injection, Repository Pattern)
-   Justifica decisiones de configuración (ej: por qué `ddl-auto: validate` en desarrollo)
-   Muestra cómo cada test contribuye a la confianza del código
-   Explica conexiones entre entidades del dominio de negocio
-   Relaciona cada implementación con los requerimientos funcionales

### Common Pitfalls

-   **Java Version**: Project requires Java 17, system may have Java 25 installed
-   **MySQL Connection**: Development requires running MySQL instance
-   **Transaction Scope**: Inventory operations must maintain ACID properties
-   **Profile Activation**: Tests fail if not using `test` profile

## Git Commit Standards

### **Mensaje de Commit Profesional**

Genera mensajes claros, concisos y conformes al estándar del proyecto. Un único mensaje por commit siguiendo estas reglas:

#### **Estructura Obligatoria:**

```
tipo: descripción corta (≤50 caracteres)

Explicación del porqué y contexto (72 caracteres por línea).
Relacionar con requerimientos de negocio cuando sea relevante.

Closes #N (si aplica)
BREAKING CHANGE: descripción (si aplica)
```

#### **Tipos Permitidos:**

-   **feat**: Nueva funcionalidad (entidades, servicios, APIs)
-   **fix**: Corrección de errores
-   **test**: Agregar o modificar tests (siguiendo TDD)
-   **refactor**: Mejora de código sin cambiar funcionalidad
-   **config**: Cambios en configuración (application.yml, pom.xml)
-   **docs**: Documentación
-   **chore**: Tareas de mantenimiento

#### **Ejemplos Específicos del Proyecto:**

```bash
feat: agregar entidad Batch para lotes de inventario

Implementa la entidad JPA con validaciones de fecha de vencimiento
y relación con Residencia. Incluye restricciones de rol según
requerimientos funcionales.

Closes #SCRUM-15

test: validar rollback en preparación sin stock suficiente

Implementa test atómico que verifica rollback completo cuando
inventario es insuficiente para completar preparación.

config: actualizar perfil test con H2 en memoria

Configura base de datos H2 para tests con ddl-auto: create-drop
mejorando velocidad de ejecución del suite TDD.
```

#### **Integración con TDD:**

-   **Commits de test**: Usar `test:` para tests que fallan inicialmente
-   **Commits de implementación**: Usar `feat:` o `fix:` para código que hace pasar tests
-   **Commits de refactor**: Usar `refactor:` para mejoras post-test

## Quick Commands Reference

```bash
# Environment check
java -version && mvn -version

# Full development cycle
cd backend
./mvnw clean test spring-boot:run

# Specific test execution
./mvnw test -Dtest=AlimentosApplicationTest

# Health verification
curl http://localhost:8080/actuator/health

# Git workflow
git status
git add .
git commit -m "tipo: descripción concisa"
git push origin main
```
