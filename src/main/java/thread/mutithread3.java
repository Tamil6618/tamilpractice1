package thread;

class bike3 implements Runnable
 {
   public void run()
    {
        System.out.println("hello tamil");
            
        }
    
 }
 class car3 extends Thread
 {

   public void run()
    {
        for(int i=1;i<=5;i++)
        {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }
    
    }
 }










public class mutithread3 
{
    public static void main(String[] args) 
    {
        Runnable a = new Runnable() 
        {
           public void run()
           {
            for(int i=1;i<=5;i++)
            {
                System.out.println("tmail selvan salem");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
           } 
        };
        car3 b= new car3();
        Thread t1 =new Thread(a);
        t1.setName("tam");
        System.out.println(t1.getName());
        t1.setPriority(1);
        System.out.println(t1.getPriority());
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        t1.start();
       // b.start();

        System.out.println("exit the thread");



         
        
    }
}
