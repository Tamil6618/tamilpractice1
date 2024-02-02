package tamiljava.array;

import java.util.Arrays;
import java.util.Scanner;

public class twotosing 

{
    public static void twotosing(int [][]data)
    {
        int[] twosing=new int[19];
        int number=0;
        for(int row=0;row<data.length;row++)
        {
            for(int col=0;col<data[row].length;col++)
            {
               twosing[number]=data[row][col];
               number++ ;
            }
        }
        System.out.println(Arrays.toString(twosing));

    }
    public static void main(String[] args) 
    {
      int [] [] mynumber=new int[6][];
      mynumber[0]=new int[4];
      mynumber[1]=new int[5];
      mynumber[2]=new int[1];
      mynumber[3]=new int[3];
      mynumber[4]=new int[4];
      mynumber[5]=new int[2]; 
      int count=9;
      for(int row=0;row<mynumber.length;row++)
      {
        for(int col=0;col<mynumber[row].length;col++)
        {
         count+=2;
         mynumber[row][col]=count;
        }
    } 
      for(int row=0;row<mynumber.length;row++)
      {
        for(int col=0;col<mynumber[row].length;col++)
        {
         System.out.print(mynumber[row][col]+ " ");
        }
        System.out.println();
          }
          twotosing(mynumber);
}
}