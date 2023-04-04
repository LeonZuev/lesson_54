package hw54;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumberToArray {

  public static void main(String[] args) {
    String phoneNumber = "1234567890";
    List<String> phoneNumberList = new ArrayList<>();

    for (int i = 0; i < phoneNumber.length(); i++) {
      phoneNumberList.add(String.valueOf(phoneNumber.charAt(i)));
    }
    System.out.println("1234567890");
    System.out.println(createPhoneNumber(phoneNumberList));
  }

  public static String createPhoneNumber(final List<String> n) {
    return "(" + n.get(0) + n.get(1) + n.get(2) + ") " + n.get(3) + n.get(4) + n.get(5) +
            "-" + n.get(6) + n.get(7) + n.get(8) + n.get(9);
  }
}
