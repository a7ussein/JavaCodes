public class Dog {
// instance field
    String breed;
    boolean hasOwner;
    int age;
// constructor field
public Dog(String dogBreed, boolean dogOwned, int dogYears){
    breed = dogBreed;
    hasOwner = dogOwned;
    age = dogYears;
}
// main method 
public static void main(String[] args){
    System.out.println("Main method started");
    Dog fido = new Dog("poodle", false, 4);
    Dog numzio = new Dog("shiba inu", true, 12);
    boolean isFidoOlder = fido.age > numzio.age;
    int totalDogYears = numzio.age + fido.age;
    System.out.println("Two dogs created: a " + fido.breed + " and a " + numzio.breed);
    System.out.println("The statement that fido is an older dog is: " + isFidoOlder);
    System.out.println("The total age of the dogs is: " + totalDogYears);
    System.out.println("Main method finished");
}
}
