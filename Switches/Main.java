class Main {
  public static void main(String[] args) {
    // Make sure the chef gets the right dish!
    // In the Chef.java file complete the cookFood method.

    // This is the menu
    System.out.println("1 for fries, 2 for a steak, 3 for wings, 4 for a smoothie, 5 for a salad, and any other number for nothing!");

    // Customer orders food
    Chef.cookFood(2);
    Chef.cookFood(4);
    Chef.cookFood(10);
    Chef.cookFood(2);
  }
}

