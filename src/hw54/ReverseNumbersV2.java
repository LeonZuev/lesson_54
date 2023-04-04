package hw54;

import java.util.Arrays;

public class ReverseNumbersV2 {
  public static void main(String[] args) {
    long n = 9876543210L;
    int[] digitizedDigits = digitize(n);
    System.out.printf("long n = %d\n", n);
    System.out.println(Arrays.toString(digitizedDigits));
  }

  public static int[] digitize(long nDigitize) {
    String numberString = Long.toString(nDigitize);
    String stringFromLong = new StringBuilder(numberString).reverse().toString();
    int[] result = new int[stringFromLong.length()];
    for (int i = 0; i < stringFromLong.length(); ++i) {
      result[i] = Character.getNumericValue(stringFromLong.charAt(i));
    }
    return result;
  }
}
