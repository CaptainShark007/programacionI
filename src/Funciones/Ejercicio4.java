//Escribir un programa que pida al usuario dos intervalos expresados
//en horas, minutos y segundos, sume sus duraciones, y muestre por pantalla
//la duración total en horas, minutos, segundos
package Funciones;

import java.util.Scanner;

public class Ejercicio4 {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    int segA;
    int segB;

    System.out.print("Ingrese las horas del intervalo A: ");
    int horas = scan.nextInt();

    System.out.print("Ingrese los minutos del intervalo A: ");
    int minutos = scan.nextInt();

    System.out.print("Ingrese los segundos del intervalo A: ");
    int segundos = scan.nextInt();

    segA = Ejercicio2.segundos(horas,minutos,segundos);

    System.out.print("Ingrese las horas del intervalo B: ");
    horas = scan.nextInt();

    System.out.print("Ingrese los minutos del intervalo B: ");
    minutos = scan.nextInt();

    System.out.print("Ingrese los segundos del intervalo B: ");
    segundos = scan.nextInt();

    segB = Ejercicio2.segundos(horas,minutos,segundos);

    Ejercicio2.horasMinutosSegundos(segA + segB);
  }
}
