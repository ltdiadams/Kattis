//Logan DiAdams
//Algorithms - Lab 3 DifferentProblem

import java.util.Scanner;

public class DifferentProblem {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//scan.close();

		while (scan.hasNextLong()) {


			long a = scan.nextLong();
			long b = scan.nextLong();

			if(a > b) {
				System.out.println(a - b);
			}

			else {
				System.out.println(b - a);
			}

		}
	}

}
