package tamiljava.array;

import java.util.Arrays;
import java.util.Scanner;

public class recreating 

{
    public static void main(String[] args) 
    {
        int[] mynum={ 23, 33, 34,534,654,500,700 };

        System.out.println(mynum);
        System.out.println(Arrays.toString(mynum));

        String fname[]=new String[4];
         Scanner scan=new Scanner(System.in);
    
        for(int i =0;i<fname.length;i++)
        {
            System.out.println(i+"entre your intex of fnmame");
                fname [i]=scan.nextLine();
        }
        for(String fruit:fname)
        {
            System.out.println(fruit);
        }
        
    }
    
}
