package co.edu.uniquindio.poo;

public record Propietario(String nombre, String apellido, String iD){
    public String getNombre(){
      assert nombre != null && !nombre.isBlank() :"La placa no puede ser null y tampoco puede ser vacio";
      return nombre;
    }
    public String getApellido(){
      assert apellido != null && !apellido.isBlank() :"El propietario no puede ser null y tampoco puede ser vacio";
      return apellido;
    }
    public String getID(){
      assert iD != null && iD.isBlank() :"El modelo no puede ser null y tampoco puede ser vacio";
      return iD;
    }
}