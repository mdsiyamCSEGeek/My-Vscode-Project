// input 2 number and check its condition.
import java.util.*;
public class Condi3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a==b){
            System.out.print("Both are equal");
        }
        else if(a>b){
            System.out.print("A is greater then B");
        }
        else{
            System.out.print("B is Greater");
        }
    }
};
