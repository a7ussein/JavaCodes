public class PlusAndMinus {
    public static void main(String[] args){
        int zebrasInZoo = 8;
        int giraffesInZoo = 4;
        //prints 12
        int animalsInZoo = giraffesInZoo + zebrasInZoo;
        //prints 2
        int numbZebrasAfterTrade = zebrasInZoo - 2;
        //prints 10
        int numbOfAnimalsAfterTheTrade = numbZebrasAfterTrade + giraffesInZoo;
    
    System.out.println("Number of animals before the trade: " + animalsInZoo);
    System.out.println("Number of animals after the trade: " + numbOfAnimalsAfterTheTrade);
    }
}