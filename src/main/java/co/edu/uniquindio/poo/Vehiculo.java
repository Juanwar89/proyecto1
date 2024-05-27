package co.edu.uniquindio.poo;

public abstract class Vehiculo {

    public String placa;
    public String modelo;
    public Propietario propietario;
    public double tarifa;
    public int horas;
    
    public Vehiculo(String placa, String modelo, Propietario propietario, double tarifa, int horas) {
        this.placa=placa;
        this.propietario=propietario;
        this.modelo=modelo;
        this.tarifa=tarifa;
        this.horas=horas;
        assert placa != null && !placa.isBlank() :"La placa no puede ser null y tampoco puede ser vacio";
        assert propietario != null :"El propietario no puede ser null y tampoco puede ser vacio";
        assert modelo != null && !modelo.isBlank() :"El modelo no puede ser null y tampoco puede ser vacio"; 
        assert tarifa >= 0;
        assert horas >= 0;
    }

    //Metodos get y set
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public Propietario getPropietario() {
        return propietario;
    }
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }
    public double getTarifa() {
        return tarifa;
    }
    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public void setHora(int nuevaHora){
        horas=nuevaHora;
    }
}
