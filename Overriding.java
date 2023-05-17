/*Fecha: 10/05/2023
  Autor: Andrés Cortés
  Tema: Overrinding en Java
*/

class Padre {
  //Se crea un método show
  void show(){
    System.out.println("Show() desde Clase padre");
  }
}
class Hija extends Padre {
  //Se sobreescribe el método show
  void show(){
    System.out.println("Show() desde Clase hija");
  }
}
public class Overriding{
  public static void main (String [] args){
    Padre padre1 = new Padre();
    padre1.show();
    Hija hija1 = new Hija();
    hija1.show();
  }
}
