public class eliventhGradeTeacher{
    // instance field
    String teacherName; 
    String subjectTought;
    String roomNumber;
    double MyGradeInTheirClass;

    // constructor method
    public eliventhGradeTeacher(String Name, String Subject, String room, double Grade){
        teacherName = Name;
        subjectTought = Subject;
        roomNumber = room;
        MyGradeInTheirClass = Grade;

    }
    // main method
    public static void main(String[] args){
        eliventhGradeTeacher Stocker = new eliventhGradeTeacher("Sarah Stocker", "Intro Black&White photography", "D106", 94 );
        eliventhGradeTeacher Thomas = new eliventhGradeTeacher("Allison Thomas", "Chemistry Academic", "C108", 95);
        eliventhGradeTeacher Boutin = new eliventhGradeTeacher("Troy Boutin", "English 11 Academic","D217", 97);
        eliventhGradeTeacher Roy = new eliventhGradeTeacher("Colby Roy", "US History Academic", "B213", 86);
        eliventhGradeTeacher Dresser = new eliventhGradeTeacher("Jon Dresser", "CTE Information Tech 1", "V117", 96);
        eliventhGradeTeacher Boucher = new eliventhGradeTeacher("David Boucher", "Pre-Calculus", "C117", 94);
    // Teachers Strings
     String StockerString = "Mrs. " + Stocker.teacherName + " who is in room " + Stocker.roomNumber + " Teaches " + Stocker.subjectTought + " and my year grade in her class is " + Stocker.MyGradeInTheirClass + "%";
     String ThomasString = "Mrs. " + Thomas.teacherName + " who is in room " + Thomas.roomNumber + " Teaches " + Thomas.subjectTought + " and my year grade in her class is " + Thomas.MyGradeInTheirClass + "%";
     String BoutinString = "Mr. " + Boutin.teacherName + " who is in room " + Boutin.roomNumber + " Teaches " + Boutin.subjectTought + " and my year grade in his class is " + Boutin.MyGradeInTheirClass + "%";
     String RoyString = "Mr. " + Roy.teacherName + " who is in room " + Roy.roomNumber + " Teaches " + Roy.subjectTought + " and my year grade in his class is " + Roy.MyGradeInTheirClass + "%";
     String DresserString = "Mr. " + Dresser.teacherName + " who is in room " + Dresser.roomNumber + " Teaches " + Dresser.subjectTought + " and my year grade in his class is " + Dresser.MyGradeInTheirClass + "%";
     String BoucherString = "Mr. " + Boucher.teacherName + " who is in room " + Boucher.roomNumber + " Teaches " + Boucher.subjectTought + " and my year grade in his class is " + Boucher.MyGradeInTheirClass + "%";
// finalProduct = all strings added together 
    String finalProduct= StockerString + "\n" + "Also, " + ThomasString + "\n" + "Also, " + BoutinString + "\n" + "Also, " + RoyString + "\n" + "Also, " + DresserString + "\n" + "Also, " + BoucherString +"\n";

   // Print Statement
    System.out.println(finalProduct);

    }
}
