public class Student {
    // instance field
    String studentName;
    double studentGrade;
    float studentPrecentage;

    // constructor method
    public Student(String Name, double Grade, float Precentage){
        studentName = Name;
        studentGrade = Grade;
        studentPrecentage = Precentage;
    }
     // main method
     public static void main(String[] args){ 
    Student firstStudent = new Student("Ahmed", 255, 100);
    Student secondStudent = new Student("Ali", 255, 100);
// Strings
  String ahmedString = firstStudent.studentName + " has a grade of " + firstStudent.studentGrade + " and his precentage is " + firstStudent.studentPrecentage + "%";
  String aliString = secondStudent.studentName + " has a grde of " + secondStudent.studentGrade + " and his precentage is " + secondStudent.studentPrecentage + "%";
    
// Print Statements
System.out.println(ahmedString + ".\nAlso, " + aliString);
     }
}
