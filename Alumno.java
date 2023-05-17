public class alumno extends Persona {
  
  private String idalumno;

  public alumno (String nombre, String apellido, int edad){
    super(nombre, apellido, edad);
      idprofesor="unkonwn";
  }

  public void setIdAlumno (String idprofesor){
    this.idprofesor=idprofesor;
}
  public String getIdAlumno(){
    return idprofesor;
  }

  public String tostring(){
    return ""+getNombre()+" "+getApellido()+"-"+getEdad()+"-"+getIdAlumno();
  }
}