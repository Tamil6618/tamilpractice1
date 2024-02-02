package tamiljava;

import tamiljava.looptypes.forloop;

public class demoarray1 
{
    public static void main(String[] args) 
    {
        String [] studentdetilas={"tamil", "english" ,"mathsc", "physics" ,"chemistry"};
        System.out.println(studentdetilas.length);
          int mark[]=new int[5];
          mark[0]=  88;
          mark[1]=  89;
          mark[3]=  65;
          mark[2]=  66;
          mark[4]=  90;
          for(int i=0;i<=mark.length-1;i++)
          {
            System.out.println(studentdetilas[i]+ mark[i]);
           // System.out.println(  mark[i]);
            
          }

    }
    
}
