package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class PropietarioTest {
    

    
    /**
     * Propietario con datos completos
     */
    @Test
    public void datosCompletos() {
    
    Propietario propietario= new Propietario("Juan","Camilo","123");
    assertEquals("Juan", propietario.getNombre());
    assertEquals("Camilo", propietario.getApellido());
    assertEquals("123", propietario.getId());
    }

    /**
     * Propietario con datos nulos
     */
    @Test
    public void datosNulos() {
    
    assertThrows(Throwable.class, ()-> new Propietario(null, null, null));
    }

    
    /**
     * Propietario con datos en blanco
     */
    @Test
    public void datosBlanco() {
    
    assertThrows(Throwable.class, ()-> new Propietario("","",""));
        
    }
}
