// for loop 
import java.util.*;
public class forloop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the value of a: ");
        int a = sc.nextInt();
        System.out.println("The number from 1 to "+a+" is: ");
        for(int i=1; i<=a; i++)
        {
            System.out.println(i);
        }
    }
}
