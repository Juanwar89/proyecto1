package co.edu.uniquindio.poo;
public class Moto extends Vehiculo {

    public int velocidadMaxima;
    public String tipoMoto;
     //Constructor
    public Moto(String placa,String modelo, int velocidadMaxima,String tipoMoto, Propietario propietario, double tarifa, int horas){
        this.placa=placa;
        this.propietario=propietario;
        this.modelo=modelo;
        this.tipoMoto=tipoMoto;
        this.velocidadMaxima=velocidadMaxima;
        this.tarifa=tarifa;
        this.horas=horas;
        assert placa != null && !placa.isBlank() :"La placa no puede ser null y tampoco puede ser vacio";

        assert propietario != null :"El propietario no puede ser null y tampoco puede ser vacio";

        assert modelo != null && !modelo.isBlank() :"El modelo no puede ser null y tampoco puede ser vacio";
         
        assert tarifa >= 0;
        assert velocidadMaxima >=0 && velocidadMaxima<=120;

        
    }
}
