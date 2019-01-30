import java.util.Scanner;

public class Aaah{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    String first = scan.next();
    String second = scan.next();

    if(first.length() < second.length()){
      System.out.println("no");
    }
    else{
      System.out.println("go");
    }
  }
}