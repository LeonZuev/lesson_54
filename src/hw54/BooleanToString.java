package hw54;

public class BooleanToString {
  public static void main(String[] args) {
    boolean booleanValue = true;
    System.out.println(convert(booleanValue));
  }

  public static String convert(boolean b) {
    return Boolean.toString(b);
    /*return b ? "true" : "false";*/
    /*return String.valueOf(b);*/
    /*return b+"";*/
    /*return (b==true)?"true":"false";*/
  }

 /* public static String convert(boolean value){
    return String.valueOf(value);
  }*/
}