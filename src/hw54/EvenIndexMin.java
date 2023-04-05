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

public class EvenIndexMin {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Ведите последовательность чисел:");
    String[] input = br.readLine().split(" ");
    List<Integer> numbers = new ArrayList<>();

    for (String number : input) {
      numbers.add(Integer.parseInt(number));
    }

    System.out.println(search(numbers));
  }

  public static int search(List<Integer> numbers) {
    for (int number : numbers) {
      if (number % 2 == 0) {
        System.out.println(number);
      }
    }
    return -1;
  }
}

