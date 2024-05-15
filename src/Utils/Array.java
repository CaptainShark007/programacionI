package Utils;

public class Array {
  public static void display(int[] array){
    for (int e:array){
      System.out.print(e+" ");
    }
  }

  public static int[] delete(int[] array, int element){
    int[] newArray = new int[array.length-1];
    int i = 0;

    for (int e:array){
     if(e!=element){
       newArray[i] = e;
       i++;
     }
    }

    return newArray;
  }
}
