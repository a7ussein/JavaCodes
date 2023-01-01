public class Profiles{
    // instance field
    String pName;
    int pAge;
    double desiredSalary;
    char pGender = 'm';
    boolean lookingForJob;

// constructor method
public Profiles(String Name, int age, double Salary, char gender, boolean jobStutus){
    pName = Name;
    pAge = age;
    desiredSalary = Salary;
    pGender = gender;
    lookingForJob = jobStutus;
}
    // main method
    public static void main(String[] args){
        Profiles firstProfile = new Profiles("Ahmed Hussein", 18, 25000, 'm', true);
        Profiles secondProfile = new Profiles("Omar Mahmoud", 18 ,500000, 'm', false);
    String ahmedString = "Name: " + firstProfile.pName + "\nAge: " + firstProfile.pAge + "\nGender: " + firstProfile.pGender + "\nDesired Salary: " + firstProfile.desiredSalary + "\nLooking for a job: " + firstProfile.lookingForJob;
    String omarString = "Name: " + secondProfile.pName + "\nAge: " + secondProfile.pAge + "\nGender: " + secondProfile.pGender + "\nDesired Salary: " + secondProfile.desiredSalary + "\nLooking for a job: " + secondProfile.lookingForJob;
    
// print Statements
System.out.println("PROFILES: \n");
System.out.println(ahmedString);
System.out.println("___________________________________________________________________________________________");
System.out.println(omarString);
    }
}