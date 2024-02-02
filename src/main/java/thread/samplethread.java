package thread;


class laptop extends Thread
{
    public void run()
    {
        for(int index=0;index<=5;index++)
        {
          System.out.println("welcome to the thread laptop"+index);
          try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
    }

}

class computer extends Thread
{
    public void run()
    {
        for(int index=0;index<=5;index++)
        {
          System.out.println("computer "+index);
          try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
    }

}








public class samplethread 
{
public static void main(String[] args) throws InterruptedException 
{
    laptop lap=new laptop();
    lap.start();
    while (lap.isAlive()) 
    {

        
        System.out.println("my laptop class thread is wokring");
        break;
    }
    lap.join();
    computer com=new computer();
    Thread th=new Thread(com);
    th.start();

    th.join();
    System.out.println("welcome to Thread ... strat  work");

    
}
    
}
