package Basic;

class Calculator {
     
    public int add(int num1, int num2){
        System.out.println("in add");
        return num1+num2;
    }
}

public class OOPS1 {
    public static void main(String args[]){
        int num1 = 4;
        int num2 = 5;

        Calculator calc = new Calculator();

        int result = calc.add(num1, num2);

        System.out.println("The result is : " + result);
    }
}
