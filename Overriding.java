/*Fecha: 10/05/2023
  Autor: Andrés Cortés
  Tema: Overrinding en Java
*/

class Padre {
  private void m1(){
    System.out.println("Desde padre el m1()");
  }
  protected void m2(){
    System.out.println("Desde padre el m2(()");
  }
}
class Hija extends Padre {
  public void m1(){
    System.out.println("Desde hija el m1()");
  }  
  @Override
  public void m2(){
    System.out.println("Desde hija el m2(()");
  }
}
public class Overriding{
  public static void main (String [] args){
    Padre obj1 = new Padre();
    obj1.m2();
    Padre obj2 = new Hija();
    obj2.m2();
  }
}