/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathactivity;
import java.util.Scanner;

/**
 *
 * @author caitl
 */

class Math{
    int numOne;
    int numTwo;
    int resultOne;
    int resultTwo;
    int resultThree;
    int resultFour;
    int average;
    
    //Get the two numbers from the user
    public void getInput(){
        //create a scanner object that checks for user input
        Scanner myObj = new Scanner(System.in);
        
        //get the first number from the user
        System.out.println("Enter the first number");
        this.numOne = myObj.nextInt();
        
        //get the second number from the user
        System.out.println("Enter the second number");
        this.numTwo = myObj.nextInt();
    }
    
    //Add the two inputs
    public void addition(){
        this.resultOne = numOne + numTwo;
        System.out.println(resultOne);
    }
    
    //Subtracts the two inputs
    public void subtract(){
        this.resultTwo = numOne - numTwo;
        System.out.println(resultTwo);
    }
    
    //Multiply the two inputs
    public void multiply(){
        this.resultThree = numOne * numTwo;
        System.out.println(resultThree);
    }
    
    //Divide the two inputs
    public void divide(){
        this.resultFour = numOne / numTwo;
        System.out.println(resultFour);
    }
    
    //Calculate the average of all the results
    public void average(){
        this.average = (resultOne + resultTwo + resultThree + resultFour) / 4;
        System.out.println(average);
    }
    
    //Check if the number is higher than or lower than 100
    public void checkResult(){
        if (average > 100){
            System.out.println("The average is higher than 100");
        }
        if(average == 100){
            System.out.println("The average is equal to 100");
        }
            
        else{
            System.out.println("The average is lower than a hundred");
        }
    }   
}

public class MathActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Math calculate = new Math();
        
        calculate.getInput();
        
        calculate.addition();
        calculate.subtract();
        calculate.multiply();
        calculate.divide();
        calculate.average();
        
        calculate.checkResult();
        
    }
    
}
