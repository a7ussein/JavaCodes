public class Song {
    public static void main(String[] args){
        String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
        String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
        String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
//boolean to test if line1 and line2 are the same
        boolean lineOneAndTwo = line1.equals(line2);
    System.out.println("The equality of Line 1 and two is " + lineOneAndTwo);
//boolean to test if line2 and line3 are the same
        boolean lineTwoAndThree = line2.equals(line3);
    System.out.println("The equality of line 2 and three is " + lineTwoAndThree);
    }
}