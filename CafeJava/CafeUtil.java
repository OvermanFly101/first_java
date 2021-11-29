import java.util.ArrayList;
import java.util.Scanner;
public class CafeUtil {
    
    public int getStreakGoal() {
      //sum together every integer from 1 to 10 and return the sum 
      int sum = 0;
      for(int i = 1; i <= 10; i++){
        sum = sum + i;
      }
      return sum;
    }

    public double getOrderTotal(double[] prices){
      double totalAmount = 0.0;
      for(double num : prices){
        totalAmount = totalAmount + num;
      }
      return totalAmount;
    }

    public void displayMenu(ArrayList<String> menuItems){
      for(int i = 0; i < menuItems.size(); i++){
        String menuItem = menuItems.get(i);
        int menuPlace = i;
        System.out.println(menuPlace + " " + menuItem);
      }
    }

    public String addCustomer(ArrayList<String> customerList){
      Scanner scanner = new Scanner(System.in);
      

      System.out.println("Please enter your name.");
      String userName = scanner.nextLine();
      System.out.println("Hello, " + userName);

      if(customerList.size() > 0){
        int customers = customerList.size();
        System.out.println("There are " + customers + " people in front of you.");
      }
      customerList.add(userName);
      //No return necessary.
      return "Thank you";
    }

    public void printPriceChart(String product, double price, int maxQuantity){
      System.out.println(product);
      double doubleIt = 0;
      for(int i = 1; i <= maxQuantity; i++){
        doubleIt = doubleIt += price;
        System.out.println(String.format("%s - $ %.2f", i, doubleIt));
      }
    }

    
}