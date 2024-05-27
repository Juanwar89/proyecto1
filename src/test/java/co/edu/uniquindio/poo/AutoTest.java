package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AutoTest {
    

    
    /**
     * Auto con datos completos
     */
    @Test
    public void datosCompletos() {
        var  propietario= new Propietario("Juan","Camilo","123");
    
        var auto= new Auto("asd1","a1",propietario,0,0);
        assertEquals("asd1", auto.getPlaca());
        assertEquals("a1", auto.modelo);
        assertEquals(propietario,auto.propietario);
        assertEquals(0, auto.tarifa);
        assertEquals(0., auto.horas);
    }

    /**
     * Auto con datos nulos
     */
    @Test
    public void datosNulos() {
        assertThrows(Throwable.class, ()-> new Auto(null,null,null,0,0));
    }

    /**
     * Auto con datos en blanco
     */
    @Test
    public void datosBlanco() {
        assertThrows(Throwable.class, ()-> new Auto("", "",null,0,0)); 
    }




}
