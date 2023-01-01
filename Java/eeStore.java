public class eeStore{
    // instance fields
    String productType;
    double price;

    // constructor method 
    public eeStore(String product, double intitalPrice){
        productType = product;
        price = intitalPrice;
    }

    // increase price method
    public void increasePrice(double priceToAdd){
        double newPrice = price + priceToAdd;
        price = newPrice;
    }
    
    // get price with tax method
    public double getPriceWithTax(){
        double tax = 0.08;
        double totalPrice = price + (price*tax);
        return totalPrice;
    }

    // main method
    public static void main(String[] args){
        eeStore lemonadeStand = new eeStore("Lemonade", 3.75);
        eeStore cokieShop = new eeStore("Cookies", 5);
        System.out.println(lemonadeStand);
        System.out.println(cokieShop);

    }
public String toString(){
    return "This store sells " + productType + " at a price of " + price + ".";
}
}