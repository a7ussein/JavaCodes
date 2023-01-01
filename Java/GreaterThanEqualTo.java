public class GreaterThanEqualTo {
    public static void main(String[] args){
        double recommendedWaterIntake = 8;
        double daysInChallenge = 30;
        double yourWaterIntake = 235.5;
    double totalRecommendedAmount = recommendedWaterIntake * daysInChallenge;
    //boolean is set to the resulr of checking if youWaterIntake at least as much as totalReomendedAmount
    boolean isChalengeComplete = yourWaterIntake >= totalRecommendedAmount;

System.out.println(isChalengeComplete);
    }
}