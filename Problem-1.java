Problem-1: Create a small calculator which performs operations such as Addition, Subtraction, Multiplication and Division using class.
  Calculator inputs :> ‘a’, ‘b’ and ‘type of operation’
  Datatype :> ‘a’ = double, ‘b’ = double, ‘type of operation’ = string
 
 import java.util.Scanner;
class calculator{
 public void Operation(double a,double b,String type) {
     double result = 0;
     if(type.equalsIgnoreCase("addition")){
      result = a+b;
     }
     else if(type.equalsIgnoreCase("subtraction")){
      result = a-b;
     }
     else if(type.equalsIgnoreCase("multiplication")){
      result = a*b;
     }
     else if(type.equalsIgnoreCase("division")){
      if(b!=0){
        result = a/b;
      }
    
      else{
      System.out.println("Error: Division by zero");
      return;
      }
    }
    else{
      System.out.println("Invalid Operation");
      return;
    } 
    System.out.println("Result: "+result);
     }
}

public class Problem1{
public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a: ");
  double a = sc.nextDouble();
  System.out.println("Enter b: ");
  double b = sc.nextDouble();
  System.out.println("Enter the type of operation (addition, subtraction, multiplication, division):");
  String type = sc.next();
  calculator calc = new calculator();
  calc.Operation(a, b, type);
  sc.close();
}
}
