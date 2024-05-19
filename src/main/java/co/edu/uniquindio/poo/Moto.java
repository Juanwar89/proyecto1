package co.edu.uniquindio.poo;
public class Moto extends Vehiculo {

    private int velocidadMax;
    private TipoMoto TipoMoto;

    public Moto(String placa, String modelo, TipoMoto TipoMoto, Propietario propietario, int velocidadMax) {
        super(placa, modelo, propietario);
        this.velocidadMax = velocidadMax;
        assert velocidadMax >= 0;
    }
    
    public int getVelocidadMax() {
        return velocidadMax;
    }

    public TipoMoto getTipoMoto() {
        return TipoMoto;
    }
}
