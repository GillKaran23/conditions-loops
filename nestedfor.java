/*

1
12
123
1234
12345

 */
import java.util.*;
public class nestedfor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the value of n: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }    
}
