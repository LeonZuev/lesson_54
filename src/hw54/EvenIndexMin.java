package hw54;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
  /*
  Найти минимальное чётное число в последовательности положительных чисел
  или вывести -1, если такого числа не существует.
  Оценить временную и пространственную сложность алгоритма.

  не понял, откуда брать саму последовательность
   */

/**
 * Сложности:
 * @Временная O(n)
 * Алгоритм проходит по каждому элементу списка 1 раз,
 *  (n) = количеству элементов в списке
 * @Пространственная O(n)
 * кол-во памяти пропорционально кол-ву данных
 */

public class EvenIndexMin {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Ведите последовательность чисел через пробел:");
    String[] input = br.readLine().split(" ");
    List<Integer> numbers = new ArrayList<>();

    for (String number : input) {
      numbers.add(Integer.parseInt(number)); // O(n)
    }

    search(numbers);
  }
  /**
   * Поиск минимального чётного числа
   *
   * @param numbers список чисел
   * @minEvenNumber  минимальное чётное число в последовательности
   * @number временная переменная для перебора массива и вывода результата
   * @return индекс или -1, если число не найдено
   */
  public static void search(List<Integer> numbers) {
    Integer minEvenNumber = null; // O(n)
    for (int number : numbers) {
      if (number % 2 == 0 && (minEvenNumber == null || number < minEvenNumber)) {
        minEvenNumber = number; // O(n)
      }
    }

      if (minEvenNumber != null) {
        System.out.println("Минимальное чётное число в последовательности:");
        System.out.println(minEvenNumber);
      }
      else {
        System.out.println("-1");
      }
    }
  }




