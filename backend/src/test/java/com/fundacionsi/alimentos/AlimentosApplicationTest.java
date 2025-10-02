package com.fundacionsi.alimentos;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")
class AlimentosApplicationTest {

    @Test
    void debería_arrancar_aplicación_spring_boot_exitosamente() {
        // Given: Una aplicación Spring Boot configurada
        // When: El contexto de Spring se carga
        // Then: La aplicación debe arrancar sin errores
        // Este test pasa si el contexto se carga correctamente
    }
}