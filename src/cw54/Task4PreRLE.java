package cw54;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4PreRLE {

  // Run-length encoding (RLE) (aaabbcddddaaaaa = a3b2c1d4a5)
  // Промежуточная задача - PreRLE -  убрать повторяющиеся подряд буквы
  //
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Введите строку для сжатия: ");
    String input = br.readLine();
    StringBuilder result = new StringBuilder();

    Character prev = null;
    for (int i = 0; i < input.length(); ++i) {
      Character c = input.charAt(i);
      if(!c.equals(prev)) {
        result.append(c);
        prev = c;
      }
    }
    System.out.println("Промежуточный результат сжатия: ");
    System.out.println(result/*.toString*/);
  }
}
