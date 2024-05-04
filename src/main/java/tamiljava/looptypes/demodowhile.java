package tamiljava.looptypes;

public class demodowhile 
{
  public void tamil(float w)
    
    {
     do
     {
      if (w<=50) 
      {
        System.out.println("the weight is eligible");
      }
      else
      {
        System.out.println("under weight not eligible");

      } 
      w-=10;
     } 
     while(w>=30);
     
    
    }
    public static void main(String[] args) 
    {
        demodowhile whil=new demodowhile();
        whil.tamil(34f);
    }
}
