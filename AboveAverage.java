import java.util.Scanner;

public class AboveAverage{

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();

    for(int i = 0; i < num; i++){
      int students = scan.nextInt();
      double[] grades = new double[students];
      double avg, counter;
      avg = 0;
      counter = 0;

      for(int j = 0; j<students; j++){
        double score = scan.nextDouble();
        grades[j] = score;
        avg += score;
      }

      avg = avg/students;
      for(int x=0; x<students; x++){
        if(grades[x] > avg){
          counter++;
        }
      }
      double total = counter / students * 100;
      System.out.printf("%.3f%s\n", total, "%");
      //System.out.print("%");

    }




  }

}