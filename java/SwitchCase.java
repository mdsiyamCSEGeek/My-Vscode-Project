// switch case and print statement;
import java.util.*;
public class SwitchCase {
   public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int num=sc.nextInt();
    switch(num){
        case 1: System.out.print("Hello");
        break;
        case 2: System.out.println("Assalamualaikom");
        break;
        case 3: System.out.println("Bonjour");
        break;
        default: System.out.println("Invalid Number");
    }
   } 
};
