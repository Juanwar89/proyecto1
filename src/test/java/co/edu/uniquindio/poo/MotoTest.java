package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MotoTest {
    

    
    /**
     * Moto con datos completos
     */
    @Test
    public void datosCompletos() {
        Propietario propietario= new Propietario("Juan","Camilo","123");
    
    var moto= new Moto("asd1","a1",40,TipoMoto.CLASICA,propietario,0,0);
    assertEquals("asd1", moto.getPlaca());
    assertEquals("a1", moto.modelo);
    assertEquals(40, moto.velocidadMaxima);
    assertEquals(TipoMoto.CLASICA, moto.tipoMoto);
    assertEquals(propietario,moto.propietario);
    assertEquals(0, moto.tarifa);
    assertEquals(0., moto.horas);




        
    }

    /**
     * Moto con datos nulos
     */
    @Test
    public void datosNulos() {
    
    assertThrows(Throwable.class, ()-> new Moto(null,null,0,null,null,0.0,0));
        
    }

    
    /**
     * Moto con datos en blanco
     */
    @Test
    public void datosBlanco() {
    
        assertThrows(Throwable.class, ()-> new Moto("","",0,null,null,0.0,0));
        
    }




}
