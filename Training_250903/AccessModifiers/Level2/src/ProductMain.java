public class ProductMain {
    private String name;
    private double price;
    private static int totalProducts = 0;

    public ProductMain(String name, double price) {
        this.name = name;
        this.price = price;
        totalProducts++;
    }
 
    public void displayProductDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
}