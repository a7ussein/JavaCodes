public class Store {
    // instance field 
    String productType;
    int inventoryCount;
    double inventoryPrice;

    // constructor method
    public Store(String product, int count, double price) {
        productType = product; 
        inventoryCount = count;
        inventoryPrice = price; 
    }
    // main method 
    public static void main(String[] args){
        Store lemoStand = new Store("lemonade" , 42, 0.99);
        Store cookieShop = new Store("cookies", 12, 3.75);

        System.out.println("Our first shop sells " + lemoStand.productType + " at " + lemoStand.inventoryPrice);
        System.out.println("Our second shop has " + cookieShop.inventoryCount + " " + cookieShop.productType + " remaining.");
    }
    
}
