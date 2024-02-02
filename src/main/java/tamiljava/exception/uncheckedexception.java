package tamiljava.exception;
import java.util.InputMismatchException;
import java.util.Scanner;

public class uncheckedexception 
{
    public static void main(String[] args) 
    {
      try
      {
      Scanner scan=new Scanner(System.in);
      System.out.println("enter a first value");
      int value1=scan.nextInt();
      System.out.println("enter a value 2");
      int value2=scan.nextInt();
      System.out.println(value1/value2);
      }
      catch(ArithmeticException ae  ) 
      {
        System.out.println("your vlaue 2 is zero anything divided by zero");
      } 
      catch(InputMismatchException ime)
      {
        System.out.println("you can enter only numberic value at value  2");
      }
      finally
      {
        System.out.println("thank you");
      }
    
    }


}
