import java.util.Scanner;
public class calc
{
   public static void main(){
       System.out.println("Enter Num:");
       Scanner i = new Scanner(System.in);
       double x = i.nextDouble();
       System.out.println("Enter Another Num:");
       double y = i.nextDouble();
       
       System.out.println("sum: "+Calculator.add(x,y)+"\nproduct: "+Calculator.mult(x,y)+"\ndifference: "+Calculator.sub(x,y)+"\nquotient: "+Calculator.div(x,y));
    }
}
