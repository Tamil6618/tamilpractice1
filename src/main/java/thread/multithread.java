package thread;


 class bike
 {
    void add()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Tamilselvan");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }
 }
 class car{

    void add1()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Tamil");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    
    }
 }





public class multithread {
    public static void main(String[] args) {

        bike b= new bike();
        car c= new car();
    
        b.add();
        c.add1();

        
    }
    
}
