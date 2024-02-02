
  package tamiljava;

import java.util.Scanner;



public class demoScanner
 {

    public static void main(String[] args)
     {

      Scanner tamil = new Scanner(System.in);

        System.out.println("what is ration card holder name:");
        String name=tamil.next();
        System.out.println("how many members in the family:");
        short total_members=tamil.nextShort();
        System.out.println("what is card number:");
        long card_number=tamil.nextLong();
        System.out.println("card is active till now:");
        boolean card_active=tamil.nextBoolean();
        System.out.println("enter your street number;");
        float street_number=tamil.nextFloat();

        System.out.println("card holder name:"+name);
        System.out.println("total members:"+total_members);
        System.out.println("card number is:"+card_number);
        System.out.println("crad is active:"+card_active);
        System.out.println("street no:"+street_number);
        
    }
}
