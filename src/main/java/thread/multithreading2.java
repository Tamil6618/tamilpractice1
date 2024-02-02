package thread;

class bike1 extends Thread
 {
   public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println("Tamilselvan");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    }
 }
 class car1 extends Thread
 {

   public void run()
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




public class multithreading2 
{
    public static void main(String[] args) throws InterruptedException 
    {
        bike1 a = new bike1();
        car1 b= new car1();
    
      //  a.start();
        a.start();
        //b.start();
        b.start();
      
        if (a.isAlive()) 
        {
         System.out.println("exicute the threard running");
           
        }
        a.join();
        b.join();
       
        if (b.isAlive()) 
        {
         System.out.println("exe");   
        }
        System.out.println("exit");

   
    }
    
}
