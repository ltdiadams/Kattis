import java.util.Scanner;
import java.util.HashSet;
//use an array

public class everywhere {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int testCases = scan.nextInt();
    int n = 0;

    HashSet<String> places = new HashSet<String>();

    for (int i = 0; i < testCases; i++) {
      n = scan.nextInt();

      for (int j = 0; j < n; j++) {

        places.add(scan.next());
          //scan.nextLine();
      }

        System.out.println(places.size());
        places.clear();

    }
  }
}

