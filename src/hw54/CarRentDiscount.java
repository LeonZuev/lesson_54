package hw54;

public class CarRentDiscount {
  private static final int COST_PER_DAY = 40;
  private static final int SEVEN_DAYS_DISC = 50;
  private static final int TREE_DAYS_DISC = 20;
  static int days = 5;

  public static void main(String[] args) {
    int d = days;
    int totalCost = rentalCost(d);
    System.out.println("Total cost of car rental: $" + totalCost);
  }

  public static int rentalCost(int d) {
    if (d < 3)       return d * COST_PER_DAY;
    else if (d >= 7) return d * COST_PER_DAY - SEVEN_DAYS_DISC;
    else             return d * COST_PER_DAY - TREE_DAYS_DISC;
  }
}