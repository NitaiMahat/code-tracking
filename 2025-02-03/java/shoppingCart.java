import java.util.Scanner;
public class shoppingCart {
  public static void main(String[] args) {
    String item;
    double price;
    int quantity;
    double total;

    Scanner console = new Scanner(System.in);

    System.out.print("What item would you like to buy?: ");
    item = console.nextLine();

    System.out.print("What is the price for each?: ");
    price = console.nextDouble();

    System.out.print("How many would you like??: ");
    quantity = console.nextInt();

    System.out.println();
    System.out.println("You have bought " + quantity + " " + item +"/s");
    
    total =  (double) (price * quantity);

    System.out.println("Your total is $" + total);
    
    console.close();
  }
  
}
