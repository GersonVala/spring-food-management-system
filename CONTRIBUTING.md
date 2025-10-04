# Contributing to Spring Food Management System

¡Gracias por tu interés en contribuir! Este documento explica cómo participar en el desarrollo.

## 🏗️ Arquitectura del Proyecto

-   **Backend**: Spring Boot 3.1.5 con Java 17
-   **Base de Datos**: MySQL (producción), H2 (testing)
-   **Testing**: TDD con nomenclatura en español `dado_cuando_entonces`
-   **Build**: Maven con perfiles separados

## 🔄 Proceso de Desarrollo

### 1. Setup del Entorno

```bash
# Clonar el repositorio
git clone git@github.com:GersonVala/spring-food-management-system.git
cd spring-food-management-system/backend

# Verificar Java 17
java -version

# Ejecutar tests
./mvnw test

# Ejecutar aplicación
./mvnw spring-boot:run
```

### 2. Crear una Feature

```bash
# Crear branch desde main
git checkout main
git pull origin main
git checkout -b feature/nombre-descriptivo

# Desarrollar siguiendo TDD
# 1. Escribir test que falle
# 2. Implementar código mínimo
# 3. Refactorizar
```

### 3. Estándares de Commits

Usamos conventional commits en español:

```
tipo: descripción corta (≤50 caracteres)

Explicación del cambio y contexto (72 caracteres por línea).
Relacionar con requerimientos cuando sea relevante.

Closes #123
```

**Tipos permitidos:**

-   `feat`: Nueva funcionalidad
-   `fix`: Corrección de errores
-   `test`: Agregar o modificar tests
-   `refactor`: Mejora sin cambiar funcionalidad
-   `config`: Cambios en configuración
-   `docs`: Documentación

### 4. Testing Requirements

-   **Cobertura mínima**: 80%
-   **Naming**: `dado_cuando_entonces` para tests en español
-   **Profiles**: Usar `@ActiveProfiles("test")` para tests
-   **Atomic tests**: Cada test debe ser independiente

### 5. Pull Request Process

1. **Fork** el repositorio
2. **Crear branch** con nombre descriptivo
3. **Commits atómicos** con mensajes claros
4. **Tests pasan** antes de crear PR
5. **Completar template** de PR
6. **Esperar review** antes de merge

## 🏛️ Convenciones de Código

### Java/Spring Boot

```java
// Entidades JPA
@Entity
@Table(name = "batches")
public class Batch {
    // Usar nombres descriptivos en español para el dominio
    private LocalDate fechaVencimiento;
    private Integer cantidad;
}

// Tests con nomenclatura española
@Test
void debería_crear_lote_cuando_usuario_es_residente() {
    // Given: (preparar datos)
    // When: (ejecutar acción)
    // Then: (verificar resultado)
}

// Servicios con validaciones de negocio
@Service
@Transactional
public class BatchService {
    // Lógica de negocio aquí, no en controllers
}
```

### Configuración

-   **Profiles**: Separar development (`application.yml`) y test (`application-test.yml`)
-   **Security**: Implementar en service layer, no solo controllers
-   **Transactions**: Usar `@Transactional` para operaciones atómicas

## 🐛 Reportar Issues

-   Usar templates de issue apropiados
-   Incluir steps para reproducir
-   Agregar información del entorno
-   Stack traces completos para bugs

## 🤝 Code Review

-   **Constructivo**: Feedback específico y útil
-   **Completo**: Revisar lógica, tests, y documentación
-   **Oportuno**: Reviews en 24-48 horas
-   **Educativo**: Explicar el "por qué" de los cambios sugeridos

## 📚 Recursos

-   [Spring Boot Documentation](https://spring.io/projects/spring-boot)
-   [JPA/Hibernate Guide](https://hibernate.org/orm/documentation/)
-   [Testing with Spring Boot](https://spring.io/guides/gs/testing-web/)
-   [Conventional Commits](https://www.conventionalcommits.org/)

## 📞 Contacto

Para preguntas específicas del proyecto, crear un issue o contactarme.
gersonvalashek@gmail.com

---

**¡Gracias por contribuir al proyecto!** 🚀
