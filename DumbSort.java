package selfDemo;

import java.util.Scanner;

/**
 * @author lgupta
 *
 */
public class DumbSort {

  /**
   * @param args
   */
  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    // taking input in int array
    int n = s.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = s.nextInt();
    }
    incorrectIndexOfDumbSort(arr);

  }

  /**
   * printing the incorrect index.
   */
  public static void incorrectIndexOfDumbSort(int[] arr) {

    dumbSort(arr);

    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i] > arr[i + 1]) {
        System.out.println(i);
        return;

      }
    }
    System.out.println("OK");
  }

  /**
   * Implemented Dumb Sort as given in problem statement
   *
   */
  public static void dumbSort(int[] arr) { // L is a 0-indexed list of integers

    boolean done = false;
    while (!done) {
      done = true;
      for (int i = 0; i < arr.length - 2; i++) {
        if (arr[i] > arr[i + 2]) {
          done = false;
          int temp = arr[i + 2];
          arr[i + 2] = arr[i];
          arr[i] = temp;

        }
      }
    }
  }
}
