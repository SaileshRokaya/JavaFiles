
package pkg2;
import pkg1.BasicIO;
import pkg1.Calculator;

public class TestIO {
    public static void main(String[] args) {
        String id, name, address, num1, num2;
        BasicIO io = new BasicIO();
        
        Calculator c2 = new Calculator();
        int n1, n2, n3;
        
//        io.print("Enter your id: ");
//        id = io.readString();
//        io.print("Enter your Name: ");
//        name = io.readString();
//        io.print("Enter your Address: ");
//        address = io.readString();
        

        //Input
        io.print("Enter your first number: ");
        num1 = io.readString();
        
        io.print("Enter your second number: ");
        num2 = io.readString();
        
        
        //Type Conversion
        //String to Integer
        n1= Integer.parseInt(num1);
        n2= Integer.parseInt(num2);
        c2.setNum1(n1);
        c2.setNum2(n2);
        c2.CalcSum();
        
        //Output
        io.print("The sum is: "+c2.getNum3());
        
//        io.print("Your first number is: "+num1+ " and "+" second number is: "+num2);
        
        
//        io.print("Your id is: "+id+","+"your name is: "+name+" and "+"your address is: "+address);
        
    }
}
