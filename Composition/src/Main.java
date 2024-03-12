import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Product product = new Product(869012, "Computer", "Technology", 125.65, 5);
        ProductManager manager = new ProductManager(product);

        int decision;
        int amount;
        double newPrice;
        System.out.println("Welcome to the market!\n");
        do{
            System.out.println("Please select the option that you want to do!");
            System.out.println("****----****----****----****----****----****----****----****");
            System.out.println("1. Show Product details");
            System.out.println("2. Add product to the shelves");
            System.out.println("3. Sell product to the customer");
            System.out.println("4. Update the price of the product");
            System.out.println("0. Exit");
            System.out.println("****----****----****----****----****----****----****----****");
            System.out.print("Enter here: ");
            decision = inp.nextInt();
            switch (decision){
                case 1:
                    manager.showProduct();
                    break;
                case 2:
                    System.out.print("Please enter the amount of the addition: ");
                    amount = inp.nextInt();
                    manager.addToShelf(amount);
                    break;
                case 3:
                    System.out.print("Please enter the amount of the sell process: ");
                    amount = inp.nextInt();
                    manager.sell(amount);
                    break;
                case 4:
                    System.out.print("Please enter the new price for product: ");
                    newPrice = inp.nextDouble();
                    manager.priceUpdate(newPrice);
                    break;
                case 0:
                    System.out.println("Exiting!");
                    break;
                default:
                    System.out.println("Please enter a valid operation!");
                    break;
            }
        }while(decision != 0);

    }
}