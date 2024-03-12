public class ProductManager {
    public Product product;

    public ProductManager(Product product) {
        this.product = product;
    }

    public void addToShelf(int amount){
        product.stock += amount;
        System.out.println(product.name+ " added to shelf, new amount: " + product.stock);
    }

    public void sell(int amount){
        if(product.stock >= amount) {
            product.stock -= amount;
            System.out.println(product.name + " sold " + amount +
                    " amount,\n new amount on the stock is: " + product.stock);
        }else
            System.out.println("Stock is not enough to sell " + amount + " amount!");
    }

    public void priceUpdate(double newPrice){
        System.out.print("Price has changed: " + product.price + " to ");
        product.price = newPrice;
        System.out.println(product.price);
    }

    public void showProduct(){
        System.out.println("\n\nName: " + product.name + "\nid: " + product.id +
                "\nCategory: " + product.category + "\nPrice: " + product.price +
                "\nOn the stock: " + product.stock + "\n\n");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "product=" + product +
                '}';
    }
}
