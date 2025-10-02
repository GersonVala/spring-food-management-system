---
name: ✨ Feature/Task
about: Implementar componente específico del sistema
title: "[FEAT] "
labels: enhancement
assignees: ""
---

## 📋 **Descripción**

Descripción clara y concisa de la funcionalidad a implementar.

## 🎯 **Objetivo**

¿Qué problema resuelve esta funcionalidad? ¿Cómo se relaciona con los requerimientos?

## 🏗️ **Implementación Técnica**

### Spring Boot Components:

-   [ ] **Entity**: `@Entity [Nombre]` con validaciones Bean Validation
-   [ ] **Repository**: `[Nombre]Repository extends JpaRepository<>`
-   [ ] **Service**: `@Service [Nombre]Service` con `@Transactional`
-   [ ] **Controller**: `@RestController` con endpoints REST
-   [ ] **DTOs**: Request/Response objects para API

### Database:

-   [ ] Definir estructura de tabla
-   [ ] Establecer relaciones JPA (`@OneToMany`, `@ManyToOne`, etc.)
-   [ ] Configurar constraints y validaciones
-   [ ] Crear índices necesarios

## ✅ **Criterios de Aceptación**

### Funcionales:

-   [ ] [Comportamiento específico esperado]
-   [ ] [Validación de reglas de negocio]
-   [ ] [Casos edge manejados correctamente]

### Técnicos:

-   [ ] Código sigue convenciones del proyecto (Java, naming, etc.)
-   [ ] Transacciones atómicas donde corresponda
-   [ ] Validaciones entrada/salida implementadas
-   [ ] Manejo de errores apropiado
-   [ ] Performance aceptable (queries optimizadas)

### Seguridad:

-   [ ] Validaciones de rol implementadas
-   [ ] Restricciones de acceso por residencia (si aplica)
-   [ ] Sanitización de inputs

## 🧪 **Testing Strategy**

### Tests Requeridos:

-   [ ] **Unit Tests**: Service layer con mocks
-   [ ] **Integration Tests**: `@SpringBootTest` + `@Transactional`
-   [ ] **Repository Tests**: `@DataJpaTest` con H2
-   [ ] **Controller Tests**: `@WebMvcTest` con MockMvc

### Nomenclatura (español):

```java
@Test
void debería_[resultado_esperado]_cuando_[condición_específica]() {
    // Given: (preparar datos y mocks)
    // When: (ejecutar método bajo prueba)
    // Then: (verificar resultado y comportamiento)
}
```

### Coverage Mínimo:

-   [ ] Service layer: 90%+
-   [ ] Controller layer: 80%+
-   [ ] Repository queries customizadas: 100%

## 📚 **Definition of Done**

-   [ ] Código implementado y funcional
-   [ ] Tests pasan en local y CI (cuando esté configurado)
-   [ ] Code review aprobado
-   [ ] JavaDoc en métodos públicos complejos
-   [ ] Commit message sigue estándar: `feat: descripción concisa`
-   [ ] No warnings de compilación
-   [ ] Performance validada (no queries N+1, etc.)

## 🔗 **Dependencies & Relations**

-   **Parte de Epic**: #[número]
-   **Depende de**: #[número]
-   **Bloquea**: #[número]

## 📝 **Technical Notes**

Consideraciones especiales, arquitectura, referencias a documentación, etc.
