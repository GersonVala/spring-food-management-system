package com.fundacionsi.alimentos.infrastructure;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
class DatabaseConnectionTest {

    @Autowired
    private DataSource dataSource;

    @Test
    void debería_conectar_con_base_de_datos_mysql() throws SQLException {
        // Given: Un datasource configurado
        assertNotNull(dataSource, "DataSource debe estar configurado");
        
        // When: Intentamos obtener una conexión
        try (Connection connection = dataSource.getConnection()) {
            // Then: La conexión debe ser válida
            assertNotNull(connection, "La conexión no debe ser null");
            assertTrue(connection.isValid(5), "La conexión debe ser válida");
            assertFalse(connection.isClosed(), "La conexión no debe estar cerrada");
        }
    }
}