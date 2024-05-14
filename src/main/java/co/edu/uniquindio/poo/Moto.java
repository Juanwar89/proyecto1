package co.edu.uniquindio.poo;
public class Moto extends Vehiculo {

    public String velocidadMaxima;
    public String tipoMoto;
     //Constructor
    public Moto(String placa,String modelo, String velocidadMaxima,String tipoMoto, Propietario propietario){
        this.placa=placa;
        this.propietario=propietario;
        this.modelo=modelo;
        this.tipoMoto=tipoMoto;
        this.velocidadMaxima=velocidadMaxima;

        
    }
}
