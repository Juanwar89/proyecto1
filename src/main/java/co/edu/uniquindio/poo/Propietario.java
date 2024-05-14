package co.edu.uniquindio.poo;

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


}