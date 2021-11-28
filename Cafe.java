public class Cafe {
  public static void main(String[] args) {
      // APP VARIABLES
      // Lines of text that will appear in the app. 
      String generalGreeting = "Welcome to Cafe Java, ";
      String pendingMessage = ", your order will be ready shortly";
      String readyMessage = ", your order is ready";
      String displayTotalMessage = "Your total is $";
      
      // Menu variables (add yours below)
      double mochaPrice = 3.5;
      double dripCoffee = 5.5;
      double lattePrice = 3.5;
      double cappuccino = 4.0;
  
      // Customer name variables (add yours below)
      String customer1 = "Cindhuri";
      String customer2 = "Sam";
      String customer3 = "Jimmy";
      String customer4 = "Noah";

  
      // Order completions (add yours below)
      boolean isReadyOrder1 = false;
      boolean isReadyOrder2 = false;
      boolean isReadyOrder3 = true;
      boolean isReadyOrder4 = true;
      
  
      // APP INTERACTION SIMULATION (Add your code for the challenges below)
      // Example:
      System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    // ** Your customer interaction print statements will go here ** //
      System.out.println(customer1 + pendingMessage);
      System.out.println(displayTotalMessage + dripCoffee + 0 );
      System.out.println("---------");
    //Noah's Order:
      if (isReadyOrder4) {
        System.out.println(customer4 + readyMessage);
        System.out.println(displayTotalMessage + cappuccino + 0);
      }
      System.out.println("---------");
    //Sam's 2 lattes
      System.out.println(generalGreeting + customer2);
      if (isReadyOrder2) {
        System.out.println(customer2 + readyMessage);
        System.out.println(displayTotalMessage + (lattePrice + lattePrice) + 0);
      } else {
        System.out.println(customer2 + pendingMessage);
      }
      System.out.println("---------");

    //Johnny's messed up order
      System.out.println("Sorry about the mess up " + customer3);
      System.out.println("The actual price is "+ lattePrice + 0 + " ,so here is " + (dripCoffee - lattePrice) + 0 + " back");
  }
}
