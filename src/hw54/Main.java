package hw54;

import java.util.Arrays;

public class Main {

  /*
  парсим лонг в стринг с разворотом
   */
  public static void main(String[] args) {
    long n = 1234567890L;
    int[] reversedDigits = reverseDigits(n);
    System.out.println(Arrays.toString(reversedDigits));

    long nDigitize = 9876543210L;
    int[] digitizedDigits = digitize(nDigitize);
    System.out.println(Arrays.toString(digitizedDigits));

    //найти иголку в стоге сена
    String[] haystack = {"asd", "sd", "eig", ";oi", "nuh", "needle", "oiv"};
    String needleFound = findNeedle(haystack);
    System.out.println(needleFound);


    String phoneNumber = "1234567890";
    int[] digits = (Long.parseLong(phoneNumber);
    System.out.println(createPhoneNumber(String));
  }
  }

  public static int[] reverseDigits(long n) {
    return new StringBuilder(String.valueOf(n))
            .reverse()
            .chars()
            .map(Character::getNumericValue)
            .toArray();
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

  //найти иголку в стоге сена
  public static String findNeedle(Object[] haystack) {
    return String.format("found the needle at position %d", Arrays.asList(haystack).indexOf("needle"));
  }

  public static String createPhoneNumber(final String n) {
    return "("+n[0]+n[1]+n[2]+") "+n[3]+n[4]+n[5]+"-"+n[6]+n[7]+n[8]+n[9];
  }
}