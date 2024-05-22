package co.edu.uniquindio.poo;

public class Auto extends Vehiculo {

    //Constructor
    public Auto(String placa,String modelo, Propietario propietario, double tarifa, int horas){
        this.placa=placa;
        this.propietario=propietario;
        this.modelo=modelo;
        this.tarifa=tarifa;
        this.horas=horas;
        assert placa != null && !placa.isBlank() :"La placa no puede ser null y tampoco puede ser vacio";

        assert propietario != null :"El propietario no puede ser null y tampoco puede ser vacio";

        assert modelo != null && !modelo.isBlank() :"El modelo no puede ser null y tampoco puede ser vacio";
         
        assert tarifa >= 0;
        



    }

    
}
