// Simple calculator using if else conditions
import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the value of a: ");
        int a = sc.nextInt();
        System.out.print("Type the value of b: ");
        int b = sc.nextInt();
        System.out.println("1. Type 1 for Addition.");
        System.out.println("2. Type 2 for Subtraction.");
        System.out.println("3. Type 3 for Division.");
        System.out.println("4. Type 4 for Modulous.");
        System.out.println("5. Type 5 for Multiplication.");
        while(true)
        {
            System.out.print("Type your option: ");
            int option = sc.nextInt();
            if(option == 1){
                System.out.println("Sum of " +a+ " & " +b+ " is: "+(a+b));
            }
            else if(option == 2){
                System.out.println("Sub of " +a+ " & " +b+ " is: "+(a-b));
            }
            else if(option == 3){
                System.out.println("Div of " +a+ " & " +b+ " is: "+(a/b));
            }
            else if(option == 4){
                System.out.println("Mod of " +a+ " & " +b+ " is: "+(a%b));
            }
            else if(option == 5){
                System.out.println("Mul of " +a+ " & " +b+ " is: "+(a*b));
            }
            else
            {
                System.out.println("Invalid option.");
            }
        }
    }
    
}