import java.util.Scanner;

public class Enlarging{

  public static boolean isPrime(int n){
    int i;

    if(n == 2){
      return true;
    }

    if(n % 2 == 0){
      return false;
    }

    for(i = 3; i <= Math.sqrt(n); i += 2){
      if (n % i == 0){
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    while (true){
        int num = sc.nextInt();

        for(int i = 2*num + 1; true; i++){
          if(num == 0){
            //break;
            System.exit(0);
          }
          if(isPrime(i)){
            System.out.print(i);
            break;
          }
        }
        if(!isPrime(num)){
          System.out.print(" (" + num + " is not prime)" );
          //break;
        }
        System.out.println();
      }
  }
}