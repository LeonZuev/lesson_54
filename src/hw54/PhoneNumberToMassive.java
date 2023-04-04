package hw54;

public class PhoneNumberToMassive {
  public static void main(String[] args) {

    String phoneNumber = "1234567890";
    String[] phoneNumberArray = new String[phoneNumber.length()];

    for (int i = 0; i < phoneNumber.length(); ++i) {
      phoneNumberArray[i] = String.valueOf(phoneNumber.charAt(i));
    }
    System.out.println(createPhoneNumber(phoneNumberArray));
  }

  public static String createPhoneNumber(final String[] n) {
    return "("+n[0]+n[1]+n[2]+") "+n[3]+n[4]+n[5]+"-"+n[6]+n[7]+n[8]+n[9];
  }
}