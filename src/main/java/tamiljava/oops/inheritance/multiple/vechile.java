package tamiljava.oops.inheritance.multiple;

/**
 * connect
 */
public class vechile implements colur,bike
{

public void mycar(String carname )
{
    System.out.println("my car brand is "+carname);
}
public void mbike()
{
 System.out.println("yamaha");
}
public void mycolur()
{
    System.out.println("black and red");
}
    public static void main(String[] args) 

    {
    
    vechile ve=new vechile();
    ve.mbike();
    ve.mycar("bmw");
    ve.mycolur();
     
    }
}