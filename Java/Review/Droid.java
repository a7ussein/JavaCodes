public class Droid{
  // instances field
  String name;
  int batteryLevel;
  // constructor field
  public Droid(String DroidName){
    name = DroidName;
    batteryLevel = 100;
  }
  // toString method
  public String toString(){
    System.out.println("Hello I am the Droid: " + name);
    return()
  }

  // methods
    public void performTask(){

    }
    public void displaybatteryLevel(){

    }
  // main method
  public static void main(String[] args){
    Droid firstDroid = new Droid("Codey");
    System.out.println(firstDroid.name);
  }
}