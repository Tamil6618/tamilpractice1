package tamiljava.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import tamiljava.looptypes.forloop;

public class listinganarray 
{
    public static void main(String[] args) 
    {
        String []members_name=new String [5] ;
        for(int pos=0;pos<members_name.length;pos++)
        {
          Scanner scan =new Scanner(System.in);
          System.out.println("enter your family memer name");
        //   String name= scan.nextLine();
          members_name[pos]=scan.next();
        }
        System.out.println(Arrays.toString(members_name));
    

    // for( String members:members_name)
    // {
    //    System.out.println(members);
    // }
    // for(int i=0;i<members_name.length;i++)
    // {
    //     System.out.println(members_name[i]);
    // }

}
}
