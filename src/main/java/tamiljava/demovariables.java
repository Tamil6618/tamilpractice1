package tamiljava;

import java.util.Scanner;



public class demovariables 


{
    
    public void local()
    
    {
        Scanner tamil=new Scanner(System.in);

        System.out.println("my ration card number");
        double cardnumber=tamil.nextDouble();
        System.out.println("card holder name");
        String name=tamil.next();
        System.out.println("number kg sugar to bought");
        float sugar=tamil.nextFloat();

        System.out.println("my ration card number:"+cardnumber);
        System.out.println("card holder nmae:"+name);
        System.out.println("sugar:"+sugar);



    }

    public static void main(String[] args) 
    {
        Scanner tamil=new Scanner(System.in);

        System.out.println("name of the other member of card ");
        String name_of_members=tamil.next();
        System.out.println("total members in family");
        int number_of_members=tamil.nextInt();
        System.out.println("name of other members:"+name_of_members);
        System.out.println("number of family members:"+number_of_members);
        
        demovariables demo=new demovariables();
        demo.local();
        demovariables demo2=new demovariables();

       System.out.println( "my street no is "+demovariables.mystreetno);  

        
    }
     String hometown="salem";
     
     static short mystreetno=12;

    

}
