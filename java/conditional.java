import java.util.*;
// input one number and check adult or not .

public class conditional {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        if(a>18){
            System.out.print("you are adult");
        }
        else{
            System.out.print("Not adult ");
            
        }
    }
};
