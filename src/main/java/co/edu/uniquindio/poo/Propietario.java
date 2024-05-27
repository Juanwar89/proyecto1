package co.edu.uniquindio.poo;

<<<<<<< Updated upstream
public record Propietario(String nombre, String apellido, String iD)
{
  public String getNombre()
  {
    return nombre;
  }
  public String getApellido()
  {
    return apellido;
  }
  public String getID()
  {
    return iD;
  }


=======
public class  Propietario{
    private String nombre, apellido, id;
    public Propietario(String apellido, String id, String nombre) {
        this.apellido = apellido;
        this.id = id;
        this.nombre = nombre;
        assert nombre != null && !nombre.isBlank() :"La placa no puede ser null y tampoco puede ser vacio";
        assert apellido != null && !apellido.isBlank() :"El propietario no puede ser null y tampoco puede ser vacio";
        assert id != null :"El id no puede ser null y tampoco puede ser vacio";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
>>>>>>> Stashed changes
}