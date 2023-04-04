package cw54;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5RLE {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите строку для сжатия: ");
    String input = br.readLine();
    StringBuilder result = new StringBuilder();

    Character prev = null;
    int counter = 0;
    for (int i = 0; i < input.length(); ++i) {
      Character c = input.charAt(i);
      if (!c.equals(prev)) {
        if (counter > 1) {
          /*result.append(counter);*/
          System.out.print(counter);
        }

        /*result.append(c);*/
        System.out.print(c);
        prev = c;
        counter = 1;
      }
      else {
        ++counter;
      }
    }
    if (counter > 1) {
      System.out.println(counter);
    }
    System.out.println();
    /*System.out.println("Промежуточный результат сжатия: ");*/
    System.out.println(result/*.toString*/);
  }
}
