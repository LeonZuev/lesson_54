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

/**
 * Сложности:
 *
 * @Временная O(n)
 * Алгоритм проходит по каждому элементу 2 раза:
 * для поиска максимума и для поиска минимума(n2).
 * 2 - не влияет на функцию.
 * (n^2) - если бы циклы были вложенные.
 *  (n) = количество слов в массиве
 *
 * @Пространственная O(n)
 * кол-во памяти пропорционально кол-ву данных.
 * (n^2) - при использовании двумерного массива.
 */
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
    /*
    Вывести все самые короткие слова через пробел:
     -найти самое короткое слово:
       -вывести слова с его длинной.
     */
    /**
     * Поиск коротких слов
     *
     * @param wordList список слов
     * @param minLength переменная для поиска букв в слове
     * @param MAX_VALUE максимальная константа для начала поиска букв
     * @minEvenNumber  минимальное чётное число в последовательности
     * @number временная переменная для перебора массива и вывода результата
     * @return индекс или -1, если число не найдено
     */
    int minLength = Integer.MAX_VALUE;//начинаем поиск от максимума
    for (String word : wordList) {
      if (word.length() < minLength) {
        minLength = word.length();
      }
    }

    System.out.println("Самые короткие слова:");
    System.out.print("");
    for (String word : wordList) {
      if (word.length() == minLength) {
        System.out.print(word + " ");
      }
    }
    System.out.println();
  }
}
