package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



import org.junit.jupiter.api.Test;

public class ParqueaderoTest {
    

    
    /**
     * Parqueadero con datos completos
     */
    @Test
    public void datosCompletos() {
    
    Parqueadero parqueadero= new Parqueadero("Oasis");
    assertEquals("Oasis", parqueadero.nombre);   
        
    }

     /**
     * Parqueadero con datos nulos
     */
    @Test
    public void datosNulos() {
    
    assertThrows(Throwable.class, ()-> new Parqueadero(null));
        
    }

    
     /**
     * Parqueadero con datos en blanco
     */
    @Test
    public void datosBlanco() {
    
    assertThrows(Throwable.class, ()-> new Parqueadero(""));
        
    }




}
