package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.Test;

public class ParqueaderoTest {
    

    
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
}
