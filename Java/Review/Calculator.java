// Author: Ahmed Hussein
// a basic calculator using methods
public class Calculator {
    // constructor 
    public Calculator(){

    }
    // Methods
    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }
    public int Multiply(int a, int b){
        return a * b;
    }
    public int divide(int a, int b){
        return a / b;
    }
    public int modulo(int a, int b){
        return a % b;
    }
public static void main(String[] args){
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(5 , 7));
    System.out.println(myCalculator.subtract(45 , 11));
}
}
