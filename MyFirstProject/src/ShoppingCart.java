import java.util.Scanner;

public class ShoppingCart {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        double totalPrice;

        System.out.print("What item would you like to buy?: ");
        item = input.nextLine();

        System.out.print("What is the price for each?: ");
        price = input.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = input.nextInt();

        totalPrice = price * quantity;

        System.out.println("You have bought " +quantity+ " " +item+
        "/s");
        System.out.print("The total price is: $" +Math.round(totalPrice * 100.0) / 100.0);

        input.close();
    }
}
