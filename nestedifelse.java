// nested if else
import java.util.*;
public class nestedifelse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the value of a: ");
        int a = sc.nextInt();
        if(a>1){
            if(a<10){
                System.out.println(a+" is greater than 1 and smaller than 10.");
            }
            else if(a>10 && a<50){
                System.out.println(a+" is greater than 10 and smaller than 50.");
            }
            else{
                System.out.println(a+" is greater than 50.");
            }

        }
        else{
            System.out.println("Type number greater than 1.");
        }
    }
}