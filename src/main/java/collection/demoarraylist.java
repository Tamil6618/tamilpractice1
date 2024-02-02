package collection;
import java.util.ArrayList;
import java.util.Vector;


public class demoarraylist { 
    public static void main(String[] args) 
        
    {
     ArrayList list=new ArrayList();

    list.add("tamilselvan");
    list.add(7010171395l);
    list.add(25);
    list.add('m');
    System.out.println(list);


    Vector list1=new Vector();
    list1.addAll(list);
    list1.add("salem");
    list1.add("636111");

    list1.remove("salem");
    System.out.println("analyst the remove and orijainal value "+list1);



    System.out.println("my arraylist value is "+list);
    System.out.println("my vector list is "+list1);

  list1.removeAll(list);
  System.out.println(list1);

  list1.retainAll(list);
  System.out.println(list1);
   } 
}
    

