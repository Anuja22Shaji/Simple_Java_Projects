
import java.util.Scanner;

public class SimpleClaculator {
 public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("enther the first number");
     int num1=sc.nextInt();
     System.out.println("enther the operator : + , * , / , - ");
     char optr=sc.next().charAt(0);
     System.out.println("enter the second number");
     int num2=sc.nextInt();
     int result;
     switch (optr) {
         case '+': result=num1+num2;
             break;
         case '*': result=num1*num2;
             break;
         case '-': result=num1-num2;
             break;
         case '/':if(num2!=0){ result=num1/num2;}
                  else{
                    System.err.println("error in division");
                    return;
                  }
             break;    
         default:
             System.out.println("Invalid Operator");
             return;
     }
System.out.println("result="+result);



 }
    
}
