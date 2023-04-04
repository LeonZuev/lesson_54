package hw54;

import cw54.Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
  /*
  Найти минимальное чётное число в последовательности положительных чисел
  или вывести -1, если такого числа не существует.
  Оценить временную и пространственную сложность алгоритма.
   */

public class EvenIndexMin {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    List<Integer> numbers = Utils.readList();

    System.out.println("Ведите последовательность чисел:");
    numbers = Collections.singletonList(Integer.parseInt(br.readLine()));

    if (i != -1) {
      System.out.println("Минимальное чётное число: ");
    }
  }

  public static int search(List<Integer> numbers) {
    for (int i = 0; i < numbers.size(); ++i) {
      if (numbers.get(i)/2 == 0) {
        return i;
      }
    }

  }
}

