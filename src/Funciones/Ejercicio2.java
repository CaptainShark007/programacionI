//Escribir dos funciones que permitan calcular:
//a) La duración en segundos de un intervalo dado en horas, minutos y segundos
//b) La duración en horas, minutos y segundos de un intervalo dado en segundos
package Funciones;

import java.util.Scanner;

public class Ejercicio2 {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingrese las horas: ");
    int horas = scan.nextInt();

    System.out.print("Ingrese los minutos: ");
    int minutos = scan.nextInt();

    System.out.print("Ingrese los segundos: ");
    int segundos = scan.nextInt();

    System.out.println("La duración en segundos es: "+segundos(horas,minutos,segundos));

    System.out.print("Ingrese segundos: ");
    segundos = scan.nextInt();

    horasMinutosSegundos(segundos);
  }

  public static int segundos(int hrs, int min, int seg) {
    int totalMin = (hrs*60)+min;

    return (totalMin*60)+seg;
  }

  public static void horasMinutosSegundos(int seg) {
    int totalHrs = seg/3600;
    int totalMin = (seg%3600)/60;
    int totalSeg = (seg%3600)%60;

    System.out.println("La duración es "+totalHrs+":"+totalMin+":"+totalSeg);
  }
}
