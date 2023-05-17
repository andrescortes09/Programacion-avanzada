import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

class Motor {
  private int cilindrada;
  private double velocidadmax;
  private int caballosfuerza;
  private String tipocombustible;

  public Motor (int c, double VM, int CF, String TC){
    this.cilindrada=c;
    this.velocidadmax=VM;
    this.caballosfuerza=CF;
    this.tipocombustible=TC;
  }
  public int getCilindrada() {
    return cilindrada;
}
  public double getVelocidadMax() {
    return velocidadmax;
}
  public int getCaballosFuerza() {
    return caballosfuerza;
}
  public String getTipoCombustible() {
    return tipocombustible;
}
  public String imprimirMotor(){
    return "("+getCilindrada()+", "+getVelocidadMax()+", "+getCaballosFuerza()+", "+getTipoCombustible()+")";
  }
}
class Vehiculo{
  private String placa;
  private String marca;
  private Motor motor;

  public Vehiculo(String placa, String marca){
    this.placa=placa;
    this.marca=marca;
    this.motor=new Motor();
  }
  public Vehiculo(String placa, String marca, int cilindrada, double velocidadmax, int caballosfuerza, String tipocombustible){
    this.placa=placa;
    this.marca=marca;
    this.motor=new Motor(cilindrada, velocidadmax, caballosfuerza, tipocombustible);
  }
  public String getPlaca() {
    return placa;
}
  public String getMarca() {
    return marca;
}
  public Motor getMotor() {
    return motor;
}
  public String imprimirVehiculo(){
    return "("+getPlaca()+", "+getMarca()+", ";motor.getCilindrada()+", "+motor.getVelocidadMax()+", "+motor.getCaballosFuerza()+", "+motor.getTipoCombustible()+")";
  }
}
public class Prueba{
  public static void main (String [] args){
    ArrayList<Motor>lista= new ArrayList <Motor>();
    lista.add(new Motor(1400,240,4,"Diesel"));
    for(Motor mot : lista){
      System.out.println(mot.imprimirMotor());
    }
  }
}