class Persona {
  private String nombre;
  private String apellido;
  private int edad;

  public Persona(String nombre, String apellido, int edad){
    this.nombre=nombre;
    this.apellido=apellido;
    this.edad=edad;
  }

  public String getNombre(){
    return nombre;
  }

  public String getApellido(){
    return apellido;
  }

  public int getEdad(){
    return edad;
  }
}

class Practicante extends Persona {
  private String idPracticante;

  public Practicante(String nombre, String apellido, int edad){
    super(nombre, apellido, edad);
    idPracticante="unknown";
  }

  public void setIdPracticante(String idPracticante){
    this.idPracticante=idPracticante;
  }

  public String getIdPracticante(){
    return idPracticante;
  }

  public String toString(){
    return getNombre()+"-"+getApellido()+"-"+getEdad()+"-"+getIdPracticante();
  }
}

class Profesor extends Persona {
  private String idProfesor;

  public Profesor(String nombre, String apellido, int edad){
    super(nombre, apellido, edad);
    idProfesor="unknown";
  }

  public void setIdProfesor(String idProfesor){
    this.idProfesor=idProfesor;
  }

  public String getIdProfesor(){
    return idProfesor;
  }

  public String toString(){
    return getNombre()+" "+getApellido()+"-"+getEdad()+"-"+getIdProfesor();
  }
}

class Alumno extends Persona {
  private String idAlumno;

  public Alumno(String nombre, String apellido, int edad){
    super(nombre, apellido, edad);
    idAlumno="unknown";
  }

  public void setIdAlumno(String idAlumno){
    this.idAlumno=idAlumno;
  }

  public String getIdAlumno(){
    return idAlumno;
  }

  public String toString(){
    return getNombre()+" "+getApellido()+"-"+getEdad()+"-"+getIdAlumno();
  }
}

public class HerenciaPrincipal{
  public static void main (String [] args){
    Profesor profesor1 = new Profesor("profesor","mendoza cuba", 33);
    profesor1.setIdProfesor("profesor123456789");
    System.out.println(profesor1.toString());

    Alumno alumno1 = new Alumno("alumno","pardo manila", 15);
    alumno1.setIdAlumno("alumno123456789");
    System.out.println(alumno1.toString());

    Practicante practicante1 = new Practicante("practicante","torres nilo", 19);
    practicante1.setIdPracticante("practicante123456789");
    System.out.println(practicante1.toString());
  }
}
