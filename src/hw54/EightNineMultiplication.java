package hw54;

import java.util.Scanner;

public class EightNineMultiplication {
  /*
  Если число чётное - умножаем его на 8
  в противном случае на 9
   */

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int n = scanner.nextInt();
    int result = simpleMultiplication(n);
    System.out.println("Result: " + result);
  }

  public static int simpleMultiplication(int n) {
    return n * (n % 2 + 8);
    /*return n * (8 + (n & 1));*/
    /*return n % 2 == 0 ? n * 8 : n * 9;*/
  }
}
