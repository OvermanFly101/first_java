import java.util.ArrayList;
public class TestCafe {
  public static void main(String[] args){
    CafeUtil cafeOps = new CafeUtil();

    //---Streak---
    //System.out.println("Streak: " + cafeOps.getStreakGoal());

    //---Get Total---
    double[] orderItems = {2.50, 4.35, 3.25};
    
    //System.out.println(String.format("Your order total is: $ %.2f", cafeOps.getOrderTotal(orderItems)));

    //---Get Menu---
    ArrayList<String> menuItems = new ArrayList<String>();
    menuItems.add("drip coffee");
    menuItems.add("cappuccino");
    menuItems.add("latte");
    menuItems.add("mocha");

    //cafeOps.displayMenu(menuItems);

    //---Add a customer---
    ArrayList<String> customerList = new ArrayList<String>();
    customerList.add("Evan");
    customerList.add("Muhammad");
    customerList.add("Christian");

    //String testAddCustomer = cafeOps.addCustomer(customerList);

    //---Price Chart---
    //cafeOps.printPriceChart("Coffee Beans", 5.00, 5);
  }
}