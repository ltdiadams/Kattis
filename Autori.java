//Logan DiAdams
//Algorithms - Lab 3 Autori Problem
import java.util.Scanner;

public class Autori {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();
		String values[] = s.split("-");

		for (int i = 0; i < values.length; i++) {
			System.out.print(values[i].charAt(0));
		}
	}

}
