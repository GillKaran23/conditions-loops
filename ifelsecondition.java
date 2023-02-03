// if else condition
import java.util.*;
public class ifelsecondition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the value of a: ");
        int a = sc.nextInt();
        System.out.print("Type the value of b: ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("A value is greater.");
        }
        else
        {
            System.out.println("B is not smaller the A.");
        }
    }
}
