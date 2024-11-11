package org.factoriaf5.computershop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TiendaTest {

    private Tienda tienda;

    @BeforeEach
    void setUp() {
        tienda = new Tienda("PC World", "Carlos Pérez", "12345678-X");
    }

    @Test
    void testAgregarComputador() {
        Computador computador = new Computador("Dell", 16, "Intel i7", "Windows 10", 1200.0);
        tienda.agregarComputador(computador);
        
        assertEquals(1, tienda.getComputadores().size(), "La tienda debería tener un computador.");
    }

    @Test
    void testEliminarComputador() {
        Computador computador = new Computador("HP", 8, "AMD Ryzen 5", "Windows 11", 900.0);
        tienda.agregarComputador(computador);
        
        tienda.eliminarComputador("HP");
        
        assertNull(tienda.buscarComputador("HP"), "El computador HP debería haber sido eliminado.");
    }

    @Test
    void testBuscarComputador() {
        Computador computador = new Computador("Dell", 16, "Intel i7", "Windows 10", 1200.0);
        tienda.agregarComputador(computador);
        
        Computador encontrado = tienda.buscarComputador("Dell");
        
        assertNotNull(encontrado, "El computador Dell debería ser encontrado.");
        assertEquals("Dell", encontrado.getMarca(), "El computador encontrado debería ser Dell.");
    }

    @Test
    void testListarComputadores() {
        Computador computador1 = new Computador("Dell", 16, "Intel i7", "Windows 10", 1200.0);
        Computador computador2 = new Computador("HP", 8, "AMD Ryzen 5", "Windows 11", 900.0);
        
        tienda.agregarComputador(computador1);
        tienda.agregarComputador(computador2);
        
        assertEquals(2, tienda.getComputadores().size(), "La tienda debería tener 2 computadores.");
    }

    @Test
    void testEliminarComputadorNoExistente() {
        tienda.eliminarComputador("Lenovo");

        assertEquals(0, tienda.getComputadores().size(), "La tienda no debería tener computadores eliminados.");
    }
}
