package tamiljava.looptypes;

public class doehileloop 
{
    public static void main(String[] args) 
    {
        double myw=97;
        do 
        {
         if(myw<=70)
         {
           System.out.println("my weight is"+myw);
         }
         else
         {
            System.out.println("over weight");
         }
         myw-=5;
            
        } while (myw>=30);
    }
    
   
    
}
