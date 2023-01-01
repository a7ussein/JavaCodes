public class eStore{
    // instance fields
    String productType;

    // constructor method
    public eStore(String product){
        productType = product;
    }
    // advertise method 
    public void advertise(){
        System.out.println("Selling " + productType + "!");
        System.out.println("Come spend some money !");
    }
    // main method
    public static void main(String[] args){
        eStore lemonadeStnad = new eStore("lemonade");
        lemonadeStnad.advertise();

    }
}