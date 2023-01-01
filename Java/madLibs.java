public class madLibs{
    /*
    This program generates a mad libbed story. 
    Author: Ahmed Hussein
    Date: 04/22/2022
    */
    public static void main(String[] args)
    {
//Strings
        //Names
            String name1 = "Ahmed";
            String name2 = "Losifer";
        //Adjectives
            String adjective1 = "really good";
            String adjective2 = "great";
            String adjective3 = "cool";
        //Verbs
            String verb1 = "sing";
        //Nouns
            String noun1 = "people";
            String noun2 = "games";
            String noun3 = "money";
            String noun4 = "coffe";
            String noun5 = "headphones";
            String noun6 = "chicken";
        //Places
            String place1 = "New Jersey";
//Integers
        //Numbers
            int Number = 700;

 //The template for the story
    String story = "This morning " +name1+ " woke up feeling " +adjective1+ ". 'It is going to be a" +adjective2+ " day!' Outside, a buch of " +noun1+ 
    " were protesting to keep " +noun2+ " in stores. They began to " +verb1+ " to the rythm of the " +noun3+ " ,which made all the " +noun4+ "s very " +adjective3+
    " .Concerned, " +name1+ " texted " +name2+ " , who flew " +name1+ " to " +place1+ " and dropped " +name1+ " in a pudle of frozen " +noun5+ ". " +name1+ 
    " woke up in the year " +Number+ ", in a world where " +noun6+ "s ruled the world.";
//Print Statement

    System.out.println(story);

    }
}