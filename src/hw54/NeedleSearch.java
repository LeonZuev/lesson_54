package hw54;

import java.util.Arrays;

public class NeedleSearch {
  public static void main(String[] args) {
    String[] haystack = {"asd", "sd", "eig", ";oi", "nuh", "needle", "oiv"};
    String needleFound = findNeedle(haystack);
    System.out.println("'asd', 'sd', 'eig', 'oi', 'nuh', 'needle', 'oiv'");
    System.out.println(needleFound);
  }

  public static String findNeedle(Object[] haystack) {
    return String.format("found the needle at position [%d]", Arrays.asList(haystack).indexOf(
            "needle"));
  }
}
