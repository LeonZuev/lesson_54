package hw54;

/*
Дана последовательность слов (количество, а затем и сами слова,
каждое слово с новой строки).
Вывести все самые короткие слова через пробел.
Оценить временную и пространственную сложность алгоритма.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShortWordSearch {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите количество слов: ");
    int num = Integer.parseInt(br.readLine());
    String[] wordList = new String[num];

    System.out.println("Введите слова, каждое в новой строке: ");
    int i;
    for (i = 0; i < num; ++i) {
      wordList[i] = br.readLine();
    }
    for (String word : wordList) {
      System.out.println(word);
    }
  }
}
