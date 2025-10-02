---
name: 🎯 Epic/User Story
about: Implementar funcionalidad completa siguiendo requerimientos de negocio
title: "[EPIC] "
labels: epic, enhancement
assignees: ""
---

## 📋 **Historia de Usuario**

**Como** [tipo de usuario]  
**Quiero** [objetivo/funcionalidad]  
**Para** [beneficio/razón de negocio]

## 🎯 **Contexto del Negocio**

Describe la necesidad del negocio y cómo esta funcionalidad se relaciona con los requerimientos de la Fundación SI.

## ✅ **Criterios de Aceptación**

### Funcionales:

-   [ ] [Criterio funcional específico]
-   [ ] [Validación de reglas de negocio]
-   [ ] [Comportamiento esperado]

### Técnicos:

-   [ ] Entidad JPA implementada con validaciones
-   [ ] Repository con queries específicas
-   [ ] Service layer con lógica de negocio atómica
-   [ ] Controller con endpoints REST
-   [ ] Tests unitarios con nomenclatura `dado_cuando_entonces`
-   [ ] Tests de integración con `@SpringBootTest`

### Seguridad:

-   [ ] Validaciones de rol implementadas (RESIDENTE/VOLUNTARIO/ADMIN)
-   [ ] Restricciones de acceso por residencia
-   [ ] Auditoría de cambios

## 🏗️ **Componentes Técnicos**

### Backend (Spring Boot):

-   [ ] **Entity**: `@Entity [NombreEntidad]`
-   [ ] **Repository**: `[Entidad]Repository extends JpaRepository`
-   [ ] **Service**: `@Service [Entidad]Service` con `@Transactional`
-   [ ] **Controller**: `@RestController [Entidad]Controller`
-   [ ] **DTOs**: Request/Response objects
-   [ ] **Tests**: Unit + Integration tests

### Base de Datos:

-   [ ] Tabla con constraints apropiadas
-   [ ] Relaciones JPA correctas
-   [ ] Índices para performance
-   [ ] Migration scripts (si aplica)

## 🧪 **Estrategia de Testing**

```java
// Ejemplo de tests esperados:
@Test
void debería_[acción]_cuando_[condición]() {
    // Given: (preparar escenario)
    // When: (ejecutar acción)
    // Then: (verificar resultado)
}
```

### Test Cases Mínimos:

-   [ ] Happy path - caso exitoso
-   [ ] Validación de datos inválidos
-   [ ] Restricciones de seguridad/rol
-   [ ] Casos edge/límite
-   [ ] Rollback en transacciones

## 📚 **Definición de Done**

-   [ ] Código implementado siguiendo convenciones del proyecto
-   [ ] Tests unitarios e integración pasan (cobertura > 80%)
-   [ ] Documentación actualizada (JavaDoc, README si aplica)
-   [ ] Code review completado
-   [ ] Validación manual en entorno de desarrollo
-   [ ] Commit messages siguen estándar (`feat:`, `fix:`, etc.)

## 🔗 **Issues Relacionados**

-   Relacionado con: #[número]
-   Depende de: #[número]
-   Bloquea: #[número]

## 📝 **Notas Técnicas**

Información adicional para implementación, arquitectura o consideraciones especiales.
