public class Profesor extends Persona {
  
  private String idprofesor;

  public profesor (String nombre, String apellido, int edad){
    super(nombre, apellido, edad);
      idprofesor="unkonwn";
  }

  public void setIdProfesor (String idprofesor){
    this.idprofesor=idprofesor;
}
  public String getIdProfesor(){
    return idprofesor;
  }

  public String tostring(){
    return ""+getNombre()+" "+getApellido()+"-"+getEdad()+"-"+getIdProfesor();
  }
}