public class HerenciaPrincipal{
  public static void main (String [] args){
    profesor profesor1 = new profesor("profesor","mendoza cuba", 33);
    profesor1.setIdProfesor("profesor123456789");
    System.out.println(profesor1.tostring());

    alumno alumno1 = new alumno("alumno","pardo manila", 15);
    alumno1.setIdAlumno("alumno123456789");
    System.out.println(alumno1.tostring());

    practicante practicante1 = new practicante("practicante","torres nilo", 19);
    practicante1.setIdPracticante("practicante123456789");
    System.out.println(practicante1.tostring());
  }
}