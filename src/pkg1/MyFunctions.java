
package pkg1;


public class MyFunctions {
    
    //no return types; no parametar
    public void f1(){
        System.out.println("Hello form f1.");
    }
    
    //no return type; parametar
    public void f2(int num1){
        System.out.println("Hello from f2 "+ num1);
    }
    
    //Return type; no parameter
    public int f3(){
        return 30;
    }
    
    //return type; multipal parameter
    public int f4(int num1, int num2){
        return num1 + num2;
    }
}
