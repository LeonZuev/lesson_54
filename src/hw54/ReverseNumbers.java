package hw54;

import java.util.Arrays;

public class ReverseNumbers {
  public static void main(String[] args) {
    long n = 1234567890L;
    int[] reversedDigits = reverseDigits(n);
    System.out.println(Arrays.toString(reversedDigits));
  }

  public static int[] reverseDigits(long n) {
    return new StringBuilder(String.valueOf(n))
            .reverse()
            .chars()
            .map(Character::getNumericValue)
            .toArray();
  }
}
