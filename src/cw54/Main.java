package cw54;
/*
 поиск числа таргет в списке намберс

 вернёт первый возможный индекс или -1, если числа нет

 */

import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> numbers =
    System.out.println(find());
  }

    public static int find (List < Integer > nubers,int target){
      for (int i = 0; i < nubers.size(); ++i) {
        if (nubers.get(i) == target) {
          // i - наш ответ
          return i;
        }
      }
      return -1;
    }

}
