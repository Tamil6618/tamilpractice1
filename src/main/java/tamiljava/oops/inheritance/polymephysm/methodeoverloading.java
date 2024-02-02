package tamiljava.oops.inheritance.polymephysm;

public class methodeoverloading 

    {
        public static void SQUARE()
        {
            System.out.println("my mobile name oppo");
        }
        
        public static void SQUARE(String name)
        {
        System.out.println("my brother mobile name is "+name);
        }
        public static void SQUARE(int mobileprice)
        {
            int square;
            square=mobileprice*mobileprice;
            System.out.println("my mobile price"+mobileprice);
    
        }
    public static void main(String[] args)
     
    {
        SQUARE();
        SQUARE(122);
        SQUARE("oppo");
        
    }
    
    
    
    
    
    
}
