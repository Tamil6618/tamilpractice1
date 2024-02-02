package tamiljava.looptypes;

import java.util.Scanner;

public class forloop 
{
    public static void main(String[] args)
     {
      int selectedapple=0;

      for(int storage =5;storage<10;storage++)
      {
        System.out.println("current number of apple");
        Scanner scan=new Scanner(System.in);
        System.out.println("enter apples weight");
        float weight=scan.nextFloat();
        if (weight<=5&&weight>=4) 
        {
         System.out.println("the apple was eligible to the box");
         selectedapple++;

        }
        else
        {
            System.out.println("the apple is not eligilble");
        }
      }
        System.out.println("selected fruit count"+selectedapple);



    }
}
