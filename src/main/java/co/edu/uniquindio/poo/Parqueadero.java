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

        assert verificarPlacaExiste(vehiculo.getPlaca()) == false;
        vehiculos.add(vehiculo);
    
    
    
    
    
    }
  // Metodo para verificar que la placa esta en la lista
    public static boolean verificarPlacaExiste(String placa){
        boolean existe = false;
        for(Vehiculo vehicu : vehiculos){
            
            if(vehicu != null && vehicu.getPlaca()==(placa)){
                existe = true;
            }
        }
        return existe;
    }

       // función para imprimir matriz
       public static String imprimirMatriz(Vehiculo[][] matriz,int a, int b){	
        String resultado = "";
        for(int i = 0; i < a; i++){
            for(int j = 0; j <b; j++){
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


public static String verificarPlaca(Vehiculo[][] matriz, String placa){	
	String resultado = "No existe";
	for(int i = 0; i < matriz.length; i++){
		for(int j = 0; j < matriz.length; j++){
			if(matriz!=null){
            if(matriz[i][j].getPlaca()==placa)
            { 
                resultado="existe";
            }}
		}
		
	}
	return resultado;
}




  


    
}
