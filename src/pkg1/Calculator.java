/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author Student
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    
     //instance variables
        int num1, num2, num3;
        
       //Setters
       public void setNum1(int num1){
           this.num1=num1;
       }
       public void setNum2(int num2){
           this.num2=num2;
       }
       public void setNum3(int num3){
           this.num3=num3;
       }

       
       //Getters
       public int getNum1(){
           return this.num1;
       }
       public int getNum2(){
           return this.num2;
       }
       public int getNum3(){
           return this.num3;
       }
       
       

       
       //Methods
       
       public void CalcSum(){
           this.num3 = this.num1+this.num2;
       }
       
       public void CalcDif(){
           this.num3 = this.num1+this.num2;
       }
       
       public void CalcPrd(){
           this.num3 = this.num1+this.num2;
       }
       
       public void CalcDiv(){
           this.num3 = this.num1+this.num2;
       }
       
  
    
}
