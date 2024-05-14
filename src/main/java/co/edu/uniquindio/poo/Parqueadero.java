package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Parqueadero {
   
   public String nombre;
   public static Collection <Vehiculo> vehiculos ;

   public static void main(String args[])
   { Vehiculo.crearParqueadero();

   }
    public Parqueadero(String nombre)
    {
        this.nombre=nombre;
        vehiculos = new LinkedList<>();
        

    }

    // Metodo para verificar si un puesto esta ocupado
    public static String ocupado(Vehiculo vehiculo){
       
       String a;
        if(vehiculo!=null){

            a= "Ocupado";

        }
        else{

        a= "desocupado";
        }
        return a;
    }
    //Metodo para agregar un vehiculo
    public static void agregarVehiculo(Vehiculo vehiculo){

        assert verificarPlacaExiste(vehiculo.placa()) == false;
        vehiculos.add(vehiculo);
    
    
    
    
    
    }
  // Metodo para verfificar que la placa esta en la lista
    private static boolean verificarPlacaExiste(String placa){
        boolean existe = false;
        for(Vehiculo vehiculo : vehiculos){
            if(vehiculo.placa().equals(placa)){
                existe = true;
            }
        }
        return existe;
    }

       // función para imprimir matriz
public static String imprimirMatriz(Vehiculo[][] matriz){	
	String resultado = "";
	for(int i = 0; i < matriz.length; i++){
		for(int j = 0; j < matriz.length; j++){
			resultado += matriz[i][j] + "  ";
		}
		resultado = resultado + "\n";
	}
	return resultado;
}

// procedimiento para imprimir una matriz en un JoptionPane
public static void imprimirMatrizResultado(String mensaje){
	JOptionPane.showMessageDialog(null, mensaje);
}



    
    
    

   
  


    
}
