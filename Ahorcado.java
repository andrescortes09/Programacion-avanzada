/*
* Autor: Andrés Cortés
* Objetivo: Desarrollar un juego de ahorcado en el que el usuario tiene 6 intentos para adivinar todas las letras, si lo hace gana
*
* */

import java.util.Scanner;

public class Ahorcado {

    private String palabraSecreta; // Almacena la palabra secreta
    private char[] estadoPalabra; // Arreglo para representar el estado de la palabra adivinada
    private int intentosRestantes; // Número de intentos restantes
    private boolean juegoTerminado; // Indica si el juego ha terminado

    public Ahorcado(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta.toLowerCase(); // Convierte la palabra secreta a minúsculas
        estadoPalabra = new char[palabraSecreta.length()]; // Inicializa el arreglo de estado de la palabra
        for (int i = 0; i < palabraSecreta.length(); i++) {
            estadoPalabra[i] = '_'; // Inicializa el estado de la palabra con guiones bajos
        }
        intentosRestantes = 6; // Establece el número máximo de intentos
        juegoTerminado = false; // El juego no ha terminado inicialmente
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);

        while (!juegoTerminado) {
            System.out.println("Palabra: " + String.valueOf(estadoPalabra)); // Muestra el estado actual de la palabra
            System.out.println("Intentos restantes: " + intentosRestantes); // Muestra el número de intentos restantes
            System.out.print("Ingresa una letra: ");
            String input = scanner.nextLine().toLowerCase(); // Lee la letra ingresada por el jugador y la convierte a minúsculas
            if (input.length() != 1) {
                System.out.println("Ingresa solo una letra."); // Verifica que se haya ingresado solo una letra
                continue; // Continúa con la siguiente iteración del ciclo
            }
            char letra = input.charAt(0); // Obtiene la primera letra ingresada
            if (!Character.isLetter(letra)) {
                System.out.println("Ingresa una letra válida."); // Verifica que se haya ingresado una letra válida
                continue; // Continúa con la siguiente iteración del ciclo
            }
            if (!intentarLetra(letra)) {
                intentosRestantes--;
                System.out.println("La letra no está en la palabra."); // La letra no está en la palabra secreta
                if (intentosRestantes == 0) {
                    juegoTerminado = true;
                    System.out.println("¡Perdiste! La palabra secreta era: " + palabraSecreta); // Se han agotado los intentos
                }
            } else {
                if (String.valueOf(estadoPalabra).equals(palabraSecreta)) {
                    juegoTerminado = true;
                    System.out.println("¡Ganaste! Adivinaste la palabra: " + palabraSecreta); // El jugador ha adivinado la palabra
                }
            }
            System.out.println();
        }

        scanner.close();
    }

    private boolean intentarLetra(char letra) {
        boolean letraEncontrada = false;
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                estadoPalabra[i] = letra; // Actualiza el estado de la palabra si la letra está presente
                letraEncontrada = true;
            }
        }
        return letraEncontrada;
    }

    public static void main(String[] args) {
        Ahorcado ahorcado = new Ahorcado("programacion"); // Crea una instancia del juego de Ahorcado
        ahorcado.jugar(); // Inicia el juego
    }
}
