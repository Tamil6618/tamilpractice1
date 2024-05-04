package tamiljava.array;

import java.util.Arrays;
import java.util.Scanner;

import tamiljava.oops.inheritance.multilevel.father;


public class paasimganarray {
    public static void passing(int num[])
    {
        num[5]=500;
        for(int i=0;i<num.length;i++)
        { 
            if (num[i]==500) 
            {
            System.out.println( "500 number is founded"+i);
          }
            

        }
    

    }
    public static void main(String[] args) 
    {
        int[] mynum={ 23, 33, 34,534,654,500,700 };
        passing(mynum);
        System.out.println(mynum);
        System.out.println(Arrays.toString(mynum));
        int pos=4;  
        //reading an arrays
        System.out.println(mynum[pos]);
       



        
    }
    
}
