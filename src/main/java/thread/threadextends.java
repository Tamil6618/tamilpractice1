package thread;

public class threadextends extends Thread

{
 public void run()
 {
    System.out.println( "Thread creating thread extends");
 }
 public static void main(String[] args) 
 {
    threadextends the= new threadextends();
    the.start();
    //the.run();
    
 }
}
