class Chef {
  static void cookFood(int dish){

    // 1. Create a switch case with the following strings being printed out for each case.
      // Here are your fries
      // Here is your steak
      // Here are your wings
      // Here is your smoothie
      // Here is your salad
      // You want nothing?!

    switch(dish)
      {
        case 1:
          {
            System.out.println("Here are your fries");
            break;
          }
        case 2:
          {
            System.out.println("Here is your steak");
            break;
          }
        case 3:
          {
            System.out.println("Here are your wings");
            break;
          }
        case 4:
          {
            System.out.println("Here is your smoothie");
            break;
          }
        case 5:
          {
            System.out.println("Here is your salad");
            break;
          }
        default:
          {
            System.out.println("You want nothing?!");
            break;
          }
      }


  }
}