// else if condition
import java.util.*;
public class elseifcondition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the value of a: ");
        int a = sc.nextInt();
        System.out.print("Type the value of b: ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("A value is greater.");
        }
        else if(b>a)
        {
            System.out.println("B is greater A.");
        }
        else{
            System.out.println("A and B is equal.");
        }
    }
}
