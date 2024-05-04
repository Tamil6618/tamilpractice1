package tamiljava;


public class overloading 

{
    public static void mobilephone()
    {
        System.out.println("my mobile name oppo");
    }
    
    public static void mobilephone(String name)
    {
    System.out.println("my brother mobile name is "+name);
    }
    
    public static void mobilephone(int mobileprice)
    {
        int square;
        square=mobileprice*mobileprice;
        System.out.println("my mobile price"+mobileprice);

    }





 public static void main(String[] args)
{
  
  mobilephone();
  mobilephone(1200);
  mobilephone("opppo");

    

 }
    
}
