// do while loop
import java.util.*;
public class dowhileloop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the value of a: ");
        int a = sc.nextInt();
        System.out.print("Type the value of b: ");
        int b = sc.nextInt();
        System.out.println("Number from "+a+" to "+b+" are:");
        do{
            System.out.println(a);
            a++;
        }
        while(a<=b);
    }
}
