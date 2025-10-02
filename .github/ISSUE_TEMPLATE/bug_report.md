---
name: 🐛 Bug Report
about: Reportar un error o comportamiento inesperado
title: "[BUG] "
labels: bug
assignees: ""
---

## 🐛 **Descripción del Bug**

Descripción clara y concisa del comportamiento incorrecto.

## 🔄 **Pasos para Reproducir**

1. Configurar entorno: [detalles específicos]
2. Ejecutar acción: [comando/click/request específico]
3. Observar resultado: [qué sucede vs qué debería suceder]

```bash
# Comandos exactos para reproducir (si aplica)
./mvnw test -Dtest=SpecificTest
# o
curl -X POST http://localhost:8080/api/endpoint -d '...'
```

## ✅ **Comportamiento Esperado**

Descripción clara de lo que debería suceder en lugar del bug.

## ❌ **Comportamiento Actual**

Qué está sucediendo realmente (con detalles específicos).

## 🖼️ **Screenshots/Logs**

Si es aplicable, agregar screenshots, logs, o output de consola.

## 🌍 **Entorno**

| Componente    | Versión                         |
| ------------- | ------------------------------- |
| Java          | [ej: OpenJDK 17.0.16]           |
| Spring Boot   | [ej: 3.1.5]                     |
| Base de Datos | [ej: MySQL 8.0.35 / H2 2.1.214] |
| OS            | [ej: Windows 11 / Ubuntu 22.04] |
| Maven         | [ej: 3.9.11]                    |
| IDE           | [ej: VS Code 1.94]              |

## 📚 **Stack Trace**

```java
// Pegar stack trace completo aquí
[timestamp] ERROR [thread] class.method:line - Error message
java.lang.Exception: Detailed error
    at com.fundacionsi.alimentos.service.ServiceClass.method(ServiceClass.java:123)
    at ...
```

## 🔍 **Análisis Adicional**

### Posible Causa:

-   [ ] Error de validación
-   [ ] Problema de transacción/rollback
-   [ ] Issue de concurrencia
-   [ ] Configuración incorrecta
-   [ ] Problema de mapping JPA
-   [ ] Otro: [especificar]

### Severidad:

-   [ ] **Critical**: Sistema no funciona
-   [ ] **High**: Funcionalidad principal afectada
-   [ ] **Medium**: Funcionalidad secundaria afectada
-   [ ] **Low**: Problema cosmético/menor

### Scope:

-   [ ] **Desarrollo**: Solo en entorno local
-   [ ] **Testing**: Solo en tests
-   [ ] **Producción**: Afecta usuarios finales

## 🧪 **Test Case para Reproducir**

```java
@Test
void debería_[comportamiento_esperado]_cuando_[condición_específica]() {
    // Given: (setup que reproduce el bug)

    // When: (acción que causa el bug)

    // Then: (verificación que falla actualmente)
}
```

## 🔗 **Issues Relacionados**

-   Relacionado con: #[número]
-   Duplicado de: #[número]
-   Causado por: #[número]

## 📝 **Contexto Adicional**

Información adicional relevante, workarounds temporales, impacto en el negocio, etc.
