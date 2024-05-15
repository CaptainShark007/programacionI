import Utils.Array;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int[] array = {1,2,3,4,5,6,7,8,9};
    int element;

    System.out.println("El arreglo cargado es:");
    Array.display(array);
    System.out.println("\nIngrese un número a eliminar:");
    element = scan.nextInt();
    System.out.println("El nuevo arreglo es:");
    Array.display(Array.delete(array,element));
  }
}
