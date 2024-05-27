package co.edu.uniquindio.poo;

public record Propietario(String nombre, String apellido, String iD)
{
  
 public Propietario{
  assert iD != null :"El iD no puede ser null";
  assert nombre != null && !nombre.isBlank() :"El nombre no puede ser null y tampoco puede ser vacio";
  assert apellido != null && !apellido.isBlank() :"El apellido no puede ser null y tampoco puede ser vacio";
  

 }
 
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