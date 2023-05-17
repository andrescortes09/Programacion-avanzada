import java.util.Arrays;

class CompararCadenas {
  public static void main(String[] args){
    String cadena1 = "Los amigos";
    String cadena2 = "los amigos";
    //Se instancia objeto del tipo string
    //Oject objCadena = cadena1;
    //Determinar si mabas cadenas son iguales
    System.out.println(cadena1.compareTo(cadena2));
    System.out.println(cadena1.compareToIgnoreCase(cadena2));
    System.out.println(cadena1.equals(cadena2));
    System.out.println(cadena1 == cadena2);
  }
}