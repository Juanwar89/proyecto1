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
        "8.-Reporte Diario y Mensual\n"+
        "0.- Salir\n"+
        "Tarifa Auto: $"+tarifaAuto+" por hora.\n"+
        "Tarifa Moto Clásica: $"+tarifaMotoClasica+" por hora.\n"+
        "Tarifa Moto Híbrida: $"+tarifaMotoHibrida+" por hora.\n"+
        
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
            String velocidadMaxima=JOptionPane.showInputDialog(null,"Velocidad maxima:");
            //Codigo para elegir el tipo de moto
            int queTipo=Integer.parseInt(JOptionPane.showInputDialog(null,"Qué tipo de moto?:\n1.- Hibrida" +
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

          //Asignacion de puesto en el parqueadero
          int i=Integer.parseInt(JOptionPane.showInputDialog(null,"En que fila quiere asignarlo:"));
          int j=Integer.parseInt(JOptionPane.showInputDialog(null,"En que columna quiere asignarlo:"));

          //Metodo para verificar que el puesto este vacio y el vehiculo no este ya registrado
          
          if(parqueadero1[i][j]==null )
          {
            parqueadero1[i][j]=moto;
        }

          
          Parqueadero.agregarVehiculo(moto);
        }

        //Creacion de auto
        if(queVehiculo==2)
        {
            String placa=JOptionPane.showInputDialog(null,"Placa:");
            String modelo=JOptionPane.showInputDialog(null,"Modelo:");
            

          var auto= new Auto(placa, modelo,propietario,tarifaAuto,0);
          //Asignación de puesto en el parqueadero
          int a=Integer.parseInt(JOptionPane.showInputDialog(null,"En que fila quiere asignarlo:"));
          int b=Integer.parseInt(JOptionPane.showInputDialog(null,"En que columna quiere asignarlo:"));
          //Metodo para verificar que el puesto este vacio y el vehiculo no este ya registrado
          if (parqueadero1[a][b]==null){
          parqueadero1[a][b]=auto;
        }
         

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
            Parqueadero.imprimirMatrizResultado("La matriz es: \n" + Parqueadero.imprimirMatriz(parqueadero1, filas, columnas));

            //Metodo para recorrer el arreglo de vehiculos e imprimir sus placas
            String a="";
            for ( int i = 0; i < filas; i++ ){                 //El primer índice “i” recorre las filas 
                for ( int j = 0; j < columnas; j++ ){      //El segundo índice “j” recorre las columnas.
                // procesamos cada elemento de la matriz
                
                if(parqueadero1[i][j]!=null){
                    a=a+"Vehiculo con placa: "+parqueadero1[i][j].getPlaca()+"\n";
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
                tarifaAuto=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la nueva tarifa para los autos:"));
                tarifaMotoClasica=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la nueva tarifa para las motos híbridas:"));
                tarifaMotoHibrida=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese la nueva tarifa para las motos clásicas:"));




                break;

                case 7:

                int horaDia=Integer.parseInt(JOptionPane.showInputDialog(null,"Elige para pasar a la siguiente hora o dia:\n1.- +1 Hora" +
            "\n2.- +1 Dia\n" +
            "0.- Salir"));

            //Metodo para recorrer la matriz y cambiar sus horas
            
            
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

            //Metodo para recorrer la matriz y cambiar sus horas
           
            if(diarioMensual==1){
                Double horasAux;
                Double totalRecogido=0.0;
            
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
                    totalRecogido=totalRecogido+(horasAux*parqueadero1[i][j].tarifa);
                }
                    
                }
                
            }
            
            JOptionPane.showMessageDialog(null,"El total recogido del mes es de: $" +totalRecogido);
            
        }
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
