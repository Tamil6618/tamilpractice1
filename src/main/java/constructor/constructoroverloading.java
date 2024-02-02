package constructor;

public class constructoroverloading 
{
    public constructoroverloading()
    {
        System.out.println("its important question ");
    }
    public constructoroverloading(String topic_name)
    {
        System.out.println(topic_name);
    }
    public constructoroverloading(int mobno)
    {
        System.out.println(mobno);
    }

    public static void main(String[] args)
     {

        constructoroverloading con =new constructoroverloading();
        constructoroverloading con1=new constructoroverloading(0436654);
        constructoroverloading cen2=new constructoroverloading("constructer over loading important question");
        
    }
}
