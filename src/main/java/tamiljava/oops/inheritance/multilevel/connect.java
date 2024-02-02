package tamiljava.oops.inheritance.multilevel;

public class connect extends son
{
    public void connection()
    {
     System.out.println("it is connection to step by step");
    }
    public static void main(String[] args)
    {
      connect con= new connect();
      con.bike();
      con.carbrands();
      con.myletters();  
    }
}
