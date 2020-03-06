import java.util.Random;

/**
* The StudentArray program implements an application that populates an array
* with generated numbers.
*
* @author  Bradley Wills
* @version 1.0
* @since   2020-03-06
*/

public class StudentArray {
  // Create variables 
  static int randomizedNum;
  static int[][] marks = new int[5][7];
  
  
  static double avgFinder(int[][] numArray) {
    double sumValue = 0;
    double avgValue = 0;
    for (int s = 1; s <= 4; s++) {
      for (int m = 1; m <= 6; m++) {
        sumValue += marks[s][m];
      }
    }
    avgValue = sumValue / (6 * 4);
    return avgValue;
  }
  
  /**
  * Populates the array with random numbers and outputs the average.
  */
  
  public static void main(String[] args) {
    Random randomizer = new Random();
    System.out.println("All the generated marks are:");
    for (int s = 1; s <= 4; s++) {
      for (int m = 1; m <= 6; m++) {
      // Generate random mark
      randomizedNum = (randomizer.nextInt(101));
      System.out.println(randomizedNum);
      // Appends the value to the array
      marks[s][m] = randomizedNum;
      }
    }
    System.out.println("The average is: %" + avgFinder(marks));
  }
}