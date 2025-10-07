// check input nummber is odd or even ; one number inputed.
import java.util.*;
public class Conditional2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if(num%2==0){
            System.out.print("Number Even");
        }
        else{
            System.out.print("Number odd");
        }
    }
};
