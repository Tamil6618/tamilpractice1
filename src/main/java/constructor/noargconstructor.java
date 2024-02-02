package constructor;

public class noargconstructor
 {
    public noargconstructor()
    {
        System.out.println("constructor is Special methode run  at initalize object");
    }
    public void Checking()
    {
        System.out.println("without return type  methode ");
    }

    public static void main(String[] args) 
    {
       noargconstructor no =new noargconstructor(); 
      // no.Checking();
    }
}
