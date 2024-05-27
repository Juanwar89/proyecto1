package co.edu.uniquindio.poo;

<<<<<<< Updated upstream
import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.swing.JOptionPane;
=======
import static org.junit.jupiter.api.Assertions.*;
>>>>>>> Stashed changes

import org.junit.jupiter.api.Test;

public class ParqueaderoTest {
<<<<<<< Updated upstream
    

    
    /**
     * Crear parqueadero
     */
    @Test
    public void shouldAnswerWithTrue() {
        
        Parqueadero parqueadero = new Parqueadero("LA CASA");
        Auto auto1= new Auto("123","Juan");
        Moto moto1= new Moto("321","120","Hibrida","Maria");
        parqueadero.agregarVehiculo(auto1);
        parqueadero.agregarVehiculo(moto1);
        int x= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese las filas"));
        int v= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese las filas"));
        
         
        Vehiculo [][] parqueadero1 = new Vehiculo [x][v];
        parqueadero.imprimirMatrizResultado("La matriz es: \n" + parqueadero.imprimirMatriz(parqueadero1));
        
        parqueadero1[0][0]= auto1;
        parqueadero1[0][1]=moto1;
        JOptionPane.showMessageDialog(null,"esta ocupado con el vehiculo"+parqueadero1[0][0].placa());
        JOptionPane.showMessageDialog(null,"esta ocupado con el vehiculo"+parqueadero1[0][1].placa());
            

        JOptionPane.showMessageDialog(null,"El lugar esta "+ parqueadero.ocupado(parqueadero1[0][0]));
        JOptionPane.showMessageDialog(null,"El propietario de esa posición es "+ parqueadero1[0][0].propietario());

       
        String a="";
        for ( int i = 0; i < parqueadero1.length; i++ ){                 //El primer índice “i” recorre las filas 
            for ( int j = 0; j < parqueadero1.length; j++ ){      //El segundo índice “j” recorre las columnas.
            // procesamos cada elemento de la matriz
            
            if(parqueadero1[i][j]!=null){
                a=a+" "+parqueadero1[i][j].placa();
            }
            
        }
        }
        JOptionPane.showMessageDialog(null,a);   
    }

    @Test
    public void testAgregarPuesto() {
        Parqueadero parqueadero = new Parqueadero("doña marta", 3, 3);
        Propietario propietario1 = new Propietario("Carlos", "10001");
        Propietario propietario2 = new Propietario("Maria", "10002");
        Auto auto = new Auto("ABC123", "Toyota", propietario1);
        Auto auto2 = new Auto("XYZ789", "Honda", propietario2);
        parqueadero.agregarPuesto(auto, 0, 0);
        assertEquals(auto, parqueadero.getPuestos()[0][0]);
        assertThrows(AssertionError.class, () -> {
            parqueadero.agregarPuesto(auto2, 0, 0);
        });
        assertNotEquals(auto2, parqueadero.getPuestos()[0][0]);
        assertThrows(AssertionError.class, () -> {
            parqueadero.agregarPuesto(auto2, 5, 5);
        });
=======
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
        
>>>>>>> Stashed changes
    }
}
