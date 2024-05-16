//Escribir un programa que pregunte al usuario:
//a) Su nombre y luego lo salude
//b) Dos números y luego muestre el producto
package Funciones;

import java.util.Scanner;

public class Ejercicio1 {
  static  Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.print("Ingrese su nombre: ");
    String name = scan.nextLine();

    saludar(name);

    System.out.print("Ingrese un número a: ");
    int a = scan.nextInt();

    System.out.print("Ingrese un número b: ");
    int b = scan.nextInt();

    producto(a,b);
  }

  public static void saludar(String name) {
    System.out.println("Hola "+name+"!");
  }

  public static void producto(int a, int b) {
    System.out.println("El producto es: "+(a*b));
  }
}
