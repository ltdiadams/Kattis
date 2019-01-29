import java.util.Scanner;
//use an array

public class everywhere{

  public static void main(String[] args){

    Scanner scan = new Scanner (System.in);
    int testCases = scan.nextInt();
    int count = 0;

    for (int i = 0; i < testCases; i++){
      int n = scan.nextInt();

      while (i < n){
        String name = scan.nextLine();
        if (scan.nextLine() != name){
          count++;

        }
        else{
          //scan.nextLine();
        }
      }
      System.out.println(count);
    }
  }
}
