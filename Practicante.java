public class Practicante extends Persona{
  
  private String idpracticante;

  public practicante(String nombre, String apellido,int edad){
    super(nombre,apellido,edad);
    idpracticante="unknown";
  }
  public void setIdPracticante (String idpracticante){
    this.idpracticante=idpracticante;
  }
  public String getIdPracticante(){
    return idpracticante;
  }
  public String toString(){
    return ""+getNombre()+"-"+getApellido()+"-"+getEdad()+"-"+getIdPracticante();
  }
}