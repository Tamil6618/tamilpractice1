package tamiljava.looptypes;


public class jaggedarray 
{
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
}
}