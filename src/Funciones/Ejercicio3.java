//Escriba dos funciones que
//a) Dado dos números, imprimir la suma, resta, división y multiplicación de ambos
//b) Dado un número, imprimir su tabla de multiplicar
package Funciones;

import java.util.Scanner;

public class Ejercicio3 {
  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingrese un número a: ");
    int a = scan.nextInt();

    System.out.print("Ingrese un número b: ");
    int b = scan.nextInt();

    calculos(a,b);

    System.out.print("Ingrese un número c: ");
    int c = scan.nextInt();

    tabla(c);
  }

  public static void calculos(int a, int b){
    System.out.println(a+"+"+b+" = "+(a+b));
    System.out.println(a+"-"+b+" = "+(a-b));
    System.out.println(a+"*"+b+" = "+(a*b));
    System.out.println(a+"/"+b+" = "+(a/b));
  }

  public static void tabla(int a){
    int cont = 0;

    while (cont<=10) {
      System.out.println(a+"x"+cont+"="+(a*cont));
      cont++;
    }
  }
}
