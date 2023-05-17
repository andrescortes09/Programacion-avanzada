import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

class Jugador{
  //Atributos
  private String nombre;
  private int elo;
  private int edad;
  private int valorpremio;
  //Constructor
  public Jugador (String n, int elo, int e, int v){
    this.nombre=n;
    this.elo=elo;
    this.edad=e;
    this.valorpremio=v;
  }
  //métodos
  //mostrar nombre

  public String getNombre() {
    return nombre;
}
  //mostrar Elo

    public int getElo() {
    return elo;
}
  //mostrar edad

    public int getEdad() {
    return edad;
}
  //mostrar valor premio

    public int getValorPremio() {
    return valorpremio;
}
  //método para imprimir jugador

  public String imprimirJugador(){
    return "("+getNombre()+","+getElo()+","+getEdad()+","+getValorPremio()+")";
  }
}//Fin clase Jugador
//En las siguientes 3 clases se usa compare para comparar cada jugador
//Clase para ordenar por Elo

class OrdenarJugadorElo implements Comparator <Jugador>{
  public int compare (Jugador jug1, Jugador jug2){
    return jug1.getElo()-jug2.getElo();
  }
}
//Clase para ordenar por edad

class OrdenarJugadorEdad implements Comparator <Jugador>{
  public int compare (Jugador jug1, Jugador jug2){
    return jug1.getEdad()-jug2.getEdad();
  }
}
//Clase para ordenar por valor premio

class OrdenarJugadorvalorPremio implements Comparator <Jugador>{
  public int compare (Jugador jug1, Jugador jug2){
    return jug1.getValorPremio()-jug2.getValorPremio();
  }
}
//Función principal

public class Planilla {
  public static void main (String [] args){
    ArrayList<Jugador> lista = new ArrayList<Jugador>();
    //Se agregan 7 jugadores

    lista.add(new Jugador("Andres", 1345, 19, 134500));
    lista.add(new Jugador("Daniel", 1432, 23, 143200));
    lista.add(new Jugador("Esteban", 1234, 20, 123400));
    lista.add(new Jugador("Andrea", 1111, 16, 111100));
    lista.add(new Jugador("Daniela", 1222, 25, 122200));
    lista.add(new Jugador("Ester", 1254, 54, 125400));
    lista.add(new Jugador("Juana", 1322, 24, 132200));
    //Se requiere la lista desordenada

    System.out.println();
    System.out.println("Se imprime la lista inicial sin ordenar: ");
    for (Jugador jug : lista){
      System.out.println(jug.imprimirJugador());
    }
    System.out.println();
    
    //Se requiere la lista ordenada por elo
    Collections.sort(lista, new OrdenarJugadorElo());
    System.out.println("Se imprime la lista ordenada por Elo: ");
    for (Jugador jug : lista){
      System.out.println(jug.imprimirJugador());
    }
    System.out.println();
    
    //Se requiere la lista ordenada por edad
    Collections.sort(lista, new OrdenarJugadorEdad());
    System.out.println("Se imprime la lista ordenada por edad: ");
    for (Jugador jug : lista){
      System.out.println(jug.imprimirJugador());
    }
    System.out.println();
    
    //Se requiere la lista ordenada por valor premio
    Collections.sort(lista, new OrdenarJugadorvalorPremio());
    System.out.println("Se imprime la lista ordenada por el valor del premio: ");
    for (Jugador jug : lista){
      System.out.println(jug.imprimirJugador());
    }
    System.out.println();
  }
}//Fin 