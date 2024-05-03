package ar.edu.unlp.info.oo2.Ejercicio14_OO2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseProxyAccessTest {
    private DatabaseProxyAccess databaseRegistrada;
    private DatabaseProxyAccess databaseNoRegistrada;

    @BeforeEach
    void setUp() throws Exception {
        this.databaseRegistrada = new DatabaseProxyAccess();
        this.databaseRegistrada.registrarse("unaContraseñaComun");
        this.databaseNoRegistrada = new DatabaseProxyAccess();
    }

    @Test
    void testGetSearchResults() {
    	assertEquals(Arrays.asList("Spiderman", "Marvel"), this.databaseRegistrada.getSearchResults("select * from comics where id=1"));
        assertEquals(null, this.databaseNoRegistrada.getSearchResults("select * from comics where id=1"));
    }

    @Test
    void testInsertNewRow() {
        assertEquals(3, this.databaseRegistrada.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(0, this.databaseNoRegistrada.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
    }
}