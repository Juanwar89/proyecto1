package co.edu.uniquindio.poo;



import javax.swing.JOptionPane;

public abstract class Vehiculo {

    public String placa;
    public String modelo;
    public Propietario propietario;
    public double tarifa;
    public int horas;
    
 
    //Retorna la placa
    public String getPlaca(){
        return placa;
    }
    //Retorna un propietario
    public Propietario propietario(){
        return propietario;
    }

    public void setHora(int nuevaHora)
    {
       horas=nuevaHora;
    }

    
    
    public static void crearParqueadero()
    {  
         int menu=-1;
         double tarifaMoto=0;
         double tarifaMotoClasica=2000;
         double tarifaMotoHibrida=3000;
         double tarifaAuto=4000;
         double gananciasTotales=0;
//Creacion del arreglo que representara el parqueadero
         int filas=Integer.parseInt(JOptionPane.showInputDialog(null,"¿De cuantas filas es el parqueadero?"));
         int columnas=Integer.parseInt(JOptionPane.showInputDialog(null,"¿De cuantas columnas es el parqueadero?"));
         Vehiculo [][] parqueadero1 = new Vehiculo [filas][columnas];

         Parqueadero.imprimirMatrizResultado("La matriz es: \n" + Parqueadero.imprimirMatriz(parqueadero1, filas, columnas));
       
        
        //Mientras la opción elegida sea 0, preguntamos al usuario
		while(menu != 0){
            try{
        //Creacion del menu
        menu=Integer.parseInt(JOptionPane.showInputDialog(null,"Elige opción:\n1.- Añadir vehiculo" +
        "\n2.- Sacar vehiculo\n" +
        "3.- Verificar puesto libre\n" +
        "4.- Registro de vehiculos\n" +
        "5.- Consulta de propietario\n" +
        "6.- Modificar tarifa\n" +
        "7.-Pasar hora o dia\n"+
        "8.-Reporte Diario y Mensual de ganancias estimadas\n"+
        "9.-Ganancias\n"+
        "0.- Salir\n"+
        "Tarifa Auto: $"+tarifaAuto+" pesos por hora.\n"+
        "Tarifa Moto Clásica: $"+tarifaMotoClasica+" pesos por hora.\n"+
        "Tarifa Moto Híbrida: $"+tarifaMotoHibrida+" pesos por hora.\n"+
        
        "Nota: Por un dia se cobran las 24 horas. "
          ));

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
            int velocidadMaxima=Integer.parseInt(JOptionPane.showInputDialog(null,
            "Velocidad maxima:"));
            
            //Codigo para elegir el tipo de moto
            int queTipo=Integer.parseInt(JOptionPane.showInputDialog(null,
            "Qué tipo de moto?:\n1.- Hibrida" +
            "\n2.- Clasica\n" +
            "0.- Salir"));
            if(queTipo==1)
            { 
                tipoMoto="Hibrida";
                tarifaMoto=tarifaMotoHibrida;
                
            }
            if(queTipo==2)
            {
                tipoMoto="Clasica";
                tarifaMoto=tarifaMotoClasica;
            }


          var moto= new Moto(placa, modelo,velocidadMaxima,tipoMoto,propietario,tarifaMoto,0);

          
          //Asignación de puesto en el parqueadero
          
          for ( int i = 0; i < filas; i++ ){                 //El primer índice “i” recorre las filas 
            for ( int j = 0; j < columnas; j++ ){      //El segundo índice “j” recorre las columnas.
            // procesamos cada elemento de la matriz
            if(parqueadero1[i][j]==null){
                parqueadero1[i][j]=moto;
                JOptionPane.showMessageDialog(null,"Agregado exitosamente:");
                i=filas+1;
            }
            
        }
        }
        }
         
        //Creacion de auto
        if(queVehiculo==2)
        {   
            String placa=JOptionPane.showInputDialog(null,"Placa:");
            String modelo=JOptionPane.showInputDialog(null,"Modelo:");
            

          var auto= new Auto(placa, modelo,propietario,tarifaAuto,0);
          //Asignación de puesto en el parqueadero
          
          for ( int i = 0; i < filas; i++ ){                 //El primer índice “i” recorre las filas 
              for ( int j = 0; j < columnas; j++ ){      //El segundo índice “j” recorre las columnas.
              // procesamos cada elemento de la matriz
              if(parqueadero1[i][j]==null){
                
                  parqueadero1[i][j]=auto;
                  JOptionPane.showMessageDialog(null,"Agregado exitosamente");
                  i=filas+1;
              }
              
          }
          }
        }

                break;

            case 2: 
             //Eliminacion de vehivulo
           String placaEliminar=Parqueadero.ingresar("Escriba la placa del vehiculo que quiere eliminar: \n"+ Parqueadero.imprimirMatrizVehiculo(parqueadero1,filas,columnas));
             

          //Eliminacion del puesto
          for ( int i = 0; i < filas; i++ ){                 //El primer índice “i” recorre las filas 
            for ( int j = 0; j < columnas; j++ ){      //El segundo índice “j” recorre las columnas.
            // procesamos cada elemento de la matriz
            if(parqueadero1[i][j]!=null){
            if(parqueadero1[i][j].getPlaca().equals(placaEliminar)){
                 //Factura
                JOptionPane.showMessageDialog(null, "El total a pagar es de "+parqueadero1[i][j].horas*parqueadero1[i][j].tarifa);
                gananciasTotales=gananciasTotales+(parqueadero1[i][j].horas*parqueadero1[i][j].tarifa);
                parqueadero1[i][j]=null;
                i=filas+1;
            }
        }
        }
        }
       
                
                break;

            case 3: 
            //Consulta de puesto libre
            int fila1=Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de la fila de 0 a "+(filas-1)+":"));
            int columna1=Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de la columna de 0 a "+(columnas-1)+":"));
               
            JOptionPane.showMessageDialog(null,"El lugar en la posicion "+fila1+""+""+columna1 + " esta "+ Parqueadero.ocupado(parqueadero1[fila1][columna1]));
                
                break;
            case 4: 
            Parqueadero.imprimirMatrizResultado("Parqueadero: \n" + Parqueadero.imprimirMatrizVehiculo(parqueadero1, filas, columnas));

            //Metodo para recorrer el arreglo de vehiculos e imprimir sus placas, horas y tarifa.
            String a="";
            for ( int i = 0; i < filas; i++ ){                 //El primer índice “i” recorre las filas 
                for ( int j = 0; j < columnas; j++ ){      //El segundo índice “j” recorre las columnas.
                // procesamos cada elemento de la matriz
                
                if(parqueadero1[i][j]!=null){
                    a=a+"Vehiculo con placa: "+parqueadero1[i][j].getPlaca()+"  Horas: "+parqueadero1[i][j].horas+ "  Tarifa: "+parqueadero1[i][j].tarifa+"\n";
                }
                
            }
            }
            JOptionPane.showMessageDialog(null,a);
        
            
               
                break;
                case 5: 
            //Consulta de propietario del vehiculo en cierto puesto
            int fila2=Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de la fila de 0 a "+(filas-1)+":"));
            int columna2=Integer.parseInt(JOptionPane.showInputDialog(null,"Numero de la columna de 0 a "+(columnas-1)+":"));
               
            JOptionPane.showMessageDialog(null,"El propietario es  "+parqueadero1[fila2][columna2].propietario.getNombre()+ " "+parqueadero1[fila2][columna2].propietario.getApellido()+ " "+parqueadero1[fila2][columna2].propietario.getID());
                
                break;

                case 6:
                //Cambia las tarifas
                tarifaAuto=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la nueva tarifa para los autos:"));
                tarifaMotoClasica=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la nueva tarifa para las motos híbridas:"));
                tarifaMotoHibrida=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la nueva tarifa para las motos clásicas:"));




                break;

                case 7:

                int horaDia=Integer.parseInt(JOptionPane.showInputDialog(null,"Elige para pasar a la siguiente hora o dia:\n1.- +1 Hora" +
            "\n2.- +1 Dia\n" +
            "0.- Salir"));

            //Recorrer la matriz y cambiar sus horas
            
            if(horaDia==1){
                cambiarHora(parqueadero1,filas,columnas);
            }
            if(horaDia==2){
                for ( int i = 0; i < filas; i++ ){                 //El primer índice “i” recorre las filas 
                    for ( int j = 0; j < columnas; j++ ){      //El segundo índice “j” recorre las columnas.
                    // procesamos cada elemento de la matriz
                    if(parqueadero1[i][j]!=null){
                    parqueadero1[i][j].setHora(parqueadero1[i][j].horas+24);
                    JOptionPane.showMessageDialog(null, parqueadero1[i][j].horas);
                    }
                }
                    
                    
                }
                }

                break;

                case 8:
                int diarioMensual=Integer.parseInt(JOptionPane.showInputDialog(null,"Elige para un reporte diario o mensual:\n1.- Reporte diario" +
            "\n2.- Reporte mensual\n" +
            "0.- Salir"));
           
            if(diarioMensual==1){
                Double horasAux;
                Double totalRecogido=0.0;
            //Recorre la matriz y devuelve las ganancias estimadas de las ultimas 24 horas.
            for ( int i = 0; i < filas; i++ ){                 //El primer índice “i” recorre las filas 
                for ( int j = 0; j < columnas; j++ ){      //El segundo índice “j” recorre las columnas.
                // procesamos cada elemento de la matriz
                if (parqueadero1[i][j]!=null){
                if(parqueadero1[i][j].horas>24)
                {
                horasAux=Double.parseDouble(""+24);
                }
                else
                {
                    horasAux=Double.parseDouble(""+parqueadero1[i][j].horas);
                }
                totalRecogido=horasAux*parqueadero1[i][j].tarifa++;
            }
            }
            
            }
            
            JOptionPane.showMessageDialog(null,"El total recogido hoy es de: $" +totalRecogido);
            }
            if(diarioMensual==2){
                Double horasAux;
                Double totalRecogido=0.0;
                //Recorre la matriz y devuelve las ganancias del mes
                for ( int i = 0; i < filas; i++ ){                 //El primer índice “i” recorre las filas 
                    for ( int j = 0; j < columnas; j++ ){      //El segundo índice “j” recorre las columnas.
                    // procesamos cada elemento de la matriz
                    
                    if(parqueadero1[i][j]!=null){
                     if (parqueadero1[i][j].horas>720 ){
                    horasAux=Double.parseDouble(""+720);
                    }
                    else{
                        horasAux=Double.parseDouble(""+parqueadero1[i][j].horas);
                    }
                    totalRecogido=horasAux*parqueadero1[i][j].tarifa++;
                }
                    
                }
                
            }
            
            JOptionPane.showMessageDialog(null,"El total recogido del mes es de: $" +totalRecogido);
            
        }
                break;

                case 9:
                JOptionPane.showMessageDialog(null, "Ganancias totales: $"+ gananciasTotales +" pesos");



                break;
            case 0: 
            JOptionPane.showMessageDialog(null,"Adios!");
                break;
            default:
            JOptionPane.showMessageDialog(null,"Numero no reconocido");break;
                
            }
        
        }catch(Exception e){
            
            System.out.println("Error");
            
        }}


    }

    //Metodo que añade una hora
    public static String cambiarHora(Vehiculo[][] matriz, int filas, int columnas){
    for ( int i = 0; i < filas; i++ ){                 //El primer índice “i” recorre las filas 
        for ( int j = 0; j < columnas; j++ ){      //El segundo índice “j” recorre las columnas.
        // procesamos cada elemento de la matriz
        if(matriz[i][j]!=null){
        matriz[i][j].setHora(matriz[i][j].horas+1);
        
        JOptionPane.showMessageDialog(null, matriz[i][j].horas);
        }
    }
    }
        return "Listo";
        
    }



   
    
}
