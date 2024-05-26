package co.edu.uniquindio.poo;
public class Moto extends Vehiculo {

    public int velocidadMaxima;
    public TipoMoto tipoMoto;
     //Constructor
    public Moto(String placa, String modelo, int velocidadMaxima, TipoMoto tipoMoto, Propietario propietario, double tarifa, int horas){
        super(placa, modelo, propietario, tarifa, horas);
        this.tipoMoto = tipoMoto;
        this.velocidadMaxima=velocidadMaxima;
        assert velocidadMaxima >=0 && velocidadMaxima<=120;
    }

    //Metodos get y set
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public TipoMoto getTipoMoto() {
        return tipoMoto;
    }
    public void setTipoMoto(TipoMoto tipoMoto) {
        this.tipoMoto = tipoMoto;
    }
}
