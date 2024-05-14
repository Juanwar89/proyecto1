package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public abstract class Vehiculo {

    public String placa;
    public String modelo;
    public Propietario propietario;
   
 
    //Retorna la placa
    public String placa(){
        return placa;
    }
    //Retorna un propietario
    public Propietario propietario(){
        return propietario;
    }

    
    
    public static void crearParqueadero()
    {  
         int menu=8;
//Creacion del arreglo que representara el parqueadero
         int filas=Integer.parseInt(JOptionPane.showInputDialog(null,"¿De cuantas filas es el parqueadero?"));
         int columnas=Integer.parseInt(JOptionPane.showInputDialog(null,"¿De cuantas columnas es el parqueadero?"));
         Vehiculo [][] parqueadero1 = new Vehiculo [filas][columnas];

         Parqueadero.imprimirMatrizResultado("La matriz es: \n" + Parqueadero.imprimirMatriz(parqueadero1));
       
        
        //Mientras la opción elegida sea 0, preguntamos al usuario
		while(menu != 0){
            try{
        //Creacion del menu
        menu=Integer.parseInt(JOptionPane.showInputDialog(null,"Elige opción:\n1.- Añadir vehiculo" +
        "\n2.- Sacar vehiculo\n" +
        "3.- Verificar puesto libre\n" +
        "4.- Registro de vehiculos\n" +
        "5.- Consulta de propietario\n" +
        "0.- Salir"));

        switch(menu){
            case 1:
            //Datos del propietario
            String nPropietario=JOptionPane.showInputDialog(null,"Nombre del propietario");
            String aPropietario=JOptionPane.showInputDialog(null,"Apellido del propietario");
            String idPropietario=JOptionPane.showInputDialog(null,"ID del propietario");

            var propietario= new Propietario(nPropietario,aPropietario,idPropietario);

            //Elige el tipo de vehiculo
        int queVehiculo=Integer.parseInt(JOptionPane.showInputDialog(null,"Qué tipo de vehiculo?:\n1.- Moto" +
        "\n2.- Auto\n" +
        "0.- Salir"));

        //Crear Vehiculo
        if(queVehiculo==1)
        {   //Creacion de moto
            String tipoMoto="";
            String placa=JOptionPane.showInputDialog(null,"Placa:");
            String modelo=JOptionPane.showInputDialog(null,"Modelo:");
            String velocidadMaxima=JOptionPane.showInputDialog(null,"Velocidad maxima:");
            //Codigo para elegir el tipo de moto
            int queTipo=Integer.parseInt(JOptionPane.showInputDialog(null,"Qué tipo de moto?:\n1.- Hibrida" +
            "\n2.- Clasica\n" +
            "0.- Salir"));
            if(queTipo==1)
            { 
                tipoMoto="Hibrida";
            }
            if(queTipo==2)
            {
                tipoMoto="Clasica";
            }


          var moto= new Moto(placa, modelo,velocidadMaxima,tipoMoto,propietario);
          //Asignacion de puesto
          parqueadero1[Integer.parseInt(JOptionPane.showInputDialog(null,"En que fila quiere asignarlo:"))][Integer.parseInt(JOptionPane.showInputDialog(null,"En que columna quiere asignarlo:"))]=moto;
          Parqueadero.agregarVehiculo(moto);
        }
        //Creacion de auto
        if(queVehiculo==2)
        {
            String placa=JOptionPane.showInputDialog(null,"Placa:");
            String modelo=JOptionPane.showInputDialog(null,"Modelo:");
            

          var auto= new Auto(placa, modelo,propietario);
          parqueadero1[Integer.parseInt(JOptionPane.showInputDialog(null,"En que fila quiere asignarlo:"))][Integer.parseInt(JOptionPane.showInputDialog(null,"En que columna quiere asignarlo:"))]=auto;
          Parqueadero.agregarVehiculo(auto);
        }

       
              
                break;
            case 2: 
             //Eliminacion de vehivulo
            int fila=Integer.parseInt(JOptionPane.showInputDialog(null,"Sacar vehiculo de la fila:"));
            int columna=Integer.parseInt(JOptionPane.showInputDialog(null,"Sacar vehiculo de la columna:"));
                parqueadero1[fila][columna]=null;
                break;

            case 3: 
            //Consulta de puesto libre
            int fila1=Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de la fila:"));
            int columna1=Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de la columna:"));
               
            JOptionPane.showMessageDialog(null,"El lugar en la posicion "+fila1+""+""+columna1 + " esta "+ Parqueadero.ocupado(parqueadero1[fila1][columna1]));
                
                break;
            case 4: 

            //Metodo para recorrer el arreglo de vehiculos e imprimir sus placas
            String a="";
            for ( int i = 0; i < parqueadero1.length; i++ ){                 //El primer índice “i” recorre las filas 
                for ( int j = 0; j < parqueadero1.length; j++ ){      //El segundo índice “j” recorre las columnas.
                // procesamos cada elemento de la matriz
                
                if(parqueadero1[i][j]!=null){
                    a=a+"Vehiculo con placa: "+parqueadero1[i][j].placa()+"\n";
                }
                
            }
            }
            JOptionPane.showMessageDialog(null,a);
        
            
               
                break;
                case 5: 
            //Consulta de propietario del vehiculo en cierto puesto
            int fila2=Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de la fila:"));
            int columna2=Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de la columna:"));
               
            JOptionPane.showMessageDialog(null,"El propietario es  "+parqueadero1[fila2][columna2].propietario.getNombre()+ " "+parqueadero1[fila2][columna2].propietario.getApellido()+ " "+parqueadero1[fila2][columna2].propietario.getID());
                
                break;

                case 6:




                break;
            case 0: 
            JOptionPane.showMessageDialog(null,"Adios!");
                break;
            default:
                System.out.println("Número no reconocido");break;
            }
        
        }catch(Exception e){
            System.out.println("Error!");
        }}

    }
 



   
    
}
