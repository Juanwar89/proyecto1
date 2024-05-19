package co.edu.uniquindio.poo;

import javax.swing.JOptionPane;

public class Parqueadero {

    public String nombre;
    private Vehiculo[][] puestos;
    private int filas;
    private int columnas;

    public Parqueadero(String nombre, int filas, int columnas) {
        this.nombre = nombre;
        this.puestos = new Vehiculo[filas][columnas];
        this.filas = filas;
        this.columnas = columnas;
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

    // funcion para verificar si una placa ya ha sido añadida
    public boolean verificarPlacaExiste(String placa) {
        for (Vehiculo[] fila : puestos) {
            if (fila != null) {
                for (Vehiculo vehiculo : fila) {
                    if (vehiculo != null && vehiculo.getPlaca().equals(placa)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // función para imprimir matriz
    public String imprimirMatriz(Vehiculo[][] matriz){	
        String resultado = "";
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                resultado += matriz[i][j] + "  ";
            }
            resultado = resultado + "\n";
        }
        return resultado;
    }

    // procedimiento para imprimir una matriz en un JoptionPane
    public void imprimirMatrizResultado(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
    
}