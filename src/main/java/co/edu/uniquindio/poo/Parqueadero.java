package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class Parqueadero {

    public String nombre;
<<<<<<< Updated upstream
    private Vehiculo[][] puestos;
    private int filas;
    private int columnas;

    public Parqueadero(String nombre, int filas, int columnas) {
        this.nombre = nombre;
        this.puestos = new Vehiculo[filas][columnas];
        this.filas = filas;
        this.columnas = columnas;
=======
    public static Collection <Vehiculo> vehiculos ;

    public static void main(String args[]){
        crearParqueadero();
    }
    public Parqueadero(String nombre){
        this.nombre=nombre;
        vehiculos = new LinkedList<>();
        assert nombre != null && !nombre.isBlank() :"El modelo no puede ser null y tampoco puede ser vacio";
>>>>>>> Stashed changes
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Vehiculo[][] getPuestos() {
        return puestos;
    }
    public void setPuestos(Vehiculo[][] puestos) {
        this.puestos = puestos;
    }
    public int getFilas() {
        return filas;
    }
    public void setFilas(int filas) {
        this.filas = filas;
    }
    public int getColumnas() {
        return columnas;
    }
    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
    
    

    // funcion para agregar un vehiculo verificando si la placa esta repetida o si el puesto es ocupado
    public void agregarPuesto(Vehiculo vehiculo, int fila, int columna) {
        assert fila >= 0 && fila < filas && columna >= 0 && columna < columnas : "Ubicación de puesto inválida";
        assert puestos[fila][columna] == null : "El puesto está ocupado";
        assert !verificarPlacaExiste(vehiculo.getPlaca()) : "La placa ya está registrada en otro puesto";
        if (puestos[fila][columna] != null) {
            System.out.println("El puesto en la fila " + fila + ", columna " + columna + " está ocupado.");
            return;
        }
        puestos[fila][columna] = vehiculo;
    }

    public boolean verificarPuestoDisponible(int fila, int columna) {
        if (fila >= 0 && fila < filas && columna >= 0 && columna < columnas) {
            return puestos[fila][columna] == null;
        } else {
            return false;
        }
    }

    public String ocupado(){
        String a;
        if(verificarPuestoDisponible(filas, columnas)){

            a= "desocupado";

        }
        else{

        a= "Ocupado";
        }
        return a;
    }
<<<<<<< Updated upstream

    // funcion para verificar si una placa ya ha sido añadida
    public boolean verificarPlacaExiste(String placa) {
        for (Vehiculo[] fila : puestos) {
            if (fila != null) {
                for (Vehiculo vehiculo : fila) {
                    if (vehiculo != null && vehiculo.getPlaca().equals(placa)) {
                        return true;
                    }
=======
    //Metodo para agregar un vehiculo
    public static void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }

    // Metodo para verificar que la placa esta en la lista
    public static boolean verificarPlacaExiste(Vehiculo[][] matriz, String placa) {
        for (Vehiculo[] fila : matriz) {
            for (Vehiculo vehiculo : fila) {
                if (vehiculo!= null && vehiculo.getPlaca().equals(placa)) {
                    return true;
>>>>>>> Stashed changes
                }
            }
        }
        return false;
    }

    // función para imprimir matriz
    public String imprimirMatriz(Vehiculo[][] matriz){	
        String resultado = "";
<<<<<<< Updated upstream
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                resultado += matriz[i][j] + "  ";
=======
        for(int i = 0; i < a; i++){
            for(int j = 0; j <b; j++){
                resultado += " |libre| ";
>>>>>>> Stashed changes
            }
            resultado = resultado + "\n";
        }
        return resultado;
    }

    // procedimiento para imprimir una matriz en un JoptionPane
<<<<<<< Updated upstream
    public void imprimirMatrizResultado(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}
=======
    public static void imprimirMatrizResultado(String resultado){
        JOptionPane.showMessageDialog(null, resultado);
    }


    public static String verificarPlaca(Vehiculo[] matriz, String placa){
        String resultado = "No existe";
        for (Vehiculo vehiculo : matriz) {
            if (vehiculo!= null && vehiculo.getPlaca().equals(placa)) {
                resultado = "existe";
                break;
            }
        }
        return resultado;
    }

    // función para imprimir matriz con los vehiculos
    public static String imprimirMatrizVehiculo(Vehiculo[][] matriz,int a, int b){
        String resultado = "";
        for(int i = 0; i < a; i++){
            for(int j = 0; j <b; j++){
                if(matriz[i][j]==null){
                resultado += "  |libre|  ";
                }
                else{
                    resultado = "  ";
                    resultado +=matriz[i][j].placa + "  ";
                }
            }
            resultado = resultado + "\n";
        }
        return resultado;
    }

    

    // procedimiento para imprimir una matriz en un JoptionPane
    public static String ingresar(String mensaje){
        return JOptionPane.showInputDialog(null, mensaje);
    }

    public static void crearParqueadero(){
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
                if(nPropietario == null || nPropietario.isBlank()){
                break;
                }
                String aPropietario=JOptionPane.showInputDialog(null,"Apellido del propietario");
                if(aPropietario == null || aPropietario.isBlank()){
                break;
                }
                String idPropietario=JOptionPane.showInputDialog(null,"ID del propietario");
                if(idPropietario == null || idPropietario.isBlank()){
                break;
                }
                var propietario= new Propietario(nPropietario,aPropietario,idPropietario);

                //Elige el tipo de vehiculo
                int queVehiculo=Integer.parseInt(JOptionPane.showInputDialog(null,"Qué tipo de vehiculo?:\n1.- Moto" + "\n2.- Auto\n" + "0.- Salir"));

                //Crear Vehiculo
                if(queVehiculo==1){
                    //Creacion de moto
                    String placa=JOptionPane.showInputDialog(null,"Placa:");
                    if(placa == null || placa.isBlank()){
                        break;
                    }
                    String modelo=JOptionPane.showInputDialog(null,"Modelo:");
                    if(modelo == null || modelo.isBlank()){
                        break;
                    }
                    int velocidadMaxima=Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Velocidad maxima:"));
                    if(velocidadMaxima<0 || velocidadMaxima>120){
                        break;
                    }
                
                    //Código para elegir el tipo de moto
                    int queTipo = Integer.parseInt(JOptionPane.showInputDialog(null, "Qué tipo de moto?:\n1.- Hibrida" + "\n2.- Clasica\n" + "0.- Salir"));
                    TipoMoto tipoMoto = TipoMoto.CLASICA;
                    if (queTipo == 1) {
                        tipoMoto = TipoMoto.HIBRIDA;
                        tarifaMoto = tarifaMotoHibrida;
                    } else if (queTipo == 2) {
                        tipoMoto = TipoMoto.CLASICA;
                        tarifaMoto = tarifaMotoClasica;
                    }
                    Moto moto = new Moto(placa, modelo, velocidadMaxima, tipoMoto, propietario, tarifaMoto, 0);

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
                if(queVehiculo==2){
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
                imprimirMatrizVehiculo(parqueadero1,filas,columnas);
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
                    JOptionPane.showMessageDialog(null,"El lugar en la posicion "+fila1+""+""+columna1 + " esta "+ ocupado(parqueadero1[fila1][columna1]));
                break;

                case 4:
                Parqueadero.imprimirMatrizResultado("Parqueadero: \n" + Parqueadero.imprimirMatrizVehiculo(parqueadero1, filas, columnas));

                //Metodo para recorrer el arreglo de vehiculos e imprimir sus placas, horas y tarifa.
                String a=" ";
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
                JOptionPane.showMessageDialog(null,"El propietario es  "+parqueadero1[fila2][columna2].propietario.getNombre()+ " "+parqueadero1[fila2][columna2].propietario.getApellido()+ " "+parqueadero1[fila2][columna2].propietario.getId());

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
                }if(horaDia==2){
                    for ( int i = 0; i < filas; i++ ){                 //El primer índice “i” recorre las filas 
                        for ( int j = 0; j < columnas; j++ ){      //El segundo índice “j” recorre las columnas.
                        // procesamos cada elemento de la matriz
                            if(parqueadero1[i][j]!=null){
                                parqueadero1[i][j].setHora(parqueadero1[i][j].horas+24);
                                JOptionPane.showMessageDialog(null, parqueadero1[i][j].horas);
                            }
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Listo");
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
                                if(parqueadero1[i][j].horas>24){
                                    horasAux=Double.parseDouble(""+24);
                                    } else{
                                        horasAux=Double.parseDouble(""+parqueadero1[i][j].horas);
                                    }
                                totalRecogido=horasAux*parqueadero1[i][j].tarifa++;
                            }
                        }
                    }
                        JOptionPane.showMessageDialog(null,"El total recogido hoy es de: $" +totalRecogido);
                    }else if(diarioMensual==2){
                        Double horasAux;
                        Double totalRecogido=0.0;
                        //Recorre la matriz y devuelve las ganancias del mes
                        for ( int i = 0; i < filas; i++ ){                 //El primer índice “i” recorre las filas 
                            for ( int j = 0; j < columnas; j++ ){      //El segundo índice “j” recorre las columnas.
                            // procesamos cada elemento de la matriz
                                if(parqueadero1[i][j]!=null){
                                    if (parqueadero1[i][j].horas>720 ){
                                        horasAux=Double.parseDouble(""+720);
                                    } else{
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
            }
        }
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

    public String getNombre() {
        return nombre;
    }
    public static Collection<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}
>>>>>>> Stashed changes
