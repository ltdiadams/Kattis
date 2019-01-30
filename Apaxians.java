import java.util.Scanner;

public class Apaxians{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String name = sc.next();

    char[] arr = name.toCharArray();
    System.out.print(arr[0]);

    for (int i = 1; i < name.length(); i++){

      if (arr[i] == arr[i-1]){ //will give a null pointer because
                              //no array at -1 if i = 0
        continue;
      }

      System.out.print(arr[i]);
    }
    System.out.println();
  }
}