//Create a project name Classwork then create a program which will give a decision about greate.

package pkg1;
import java.util.Scanner;

public class Classwork {
    
    
    public static void main(String[] args) {
        
        int num, A, B, C, D, E;
        A= 70;
        B= 60;
        C= 50;
        D= 40;
        
        Scanner sc = new Scanner(System.in);
        System.err.println("Plese enter your marks: ");
        num = sc.nextInt();
        
        if (num >= 70){
            System.out.println("Congratulations to you for your for A grate with " +num+("marks"));
        }
        else if(num<A && num>=B){
            System.out.println("Congratulations to you for your B grate with"+num+("marks"));
        }
        else if(num<B && num>=C){
            System.out.println("Congractulatios to you for your C grate with"+num+("marks"));
        }
        else if(num<C && num>=D){
            System.out.println("Congratulation to you for your D grate with"+num+("marks"));
        }
        else if(num<D){
            System.out.println("Sorry your result is fail with"+num+("marks"));
        }
    }
}
