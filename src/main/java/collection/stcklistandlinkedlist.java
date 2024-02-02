package collection;


    
import java.util.Stack;

import com.google.gwt.user.client.rpc.core.java.util.LinkedList_CustomFieldSerializer;
public class stcklistandlinkedlist {
public static void main(String[] args) 
    

{ 
{
    Stack lifo=new Stack();
    Stack <String> lifo1=new Stack<String>();

    lifo.push("tamilselvan");
    lifo.push(7871171957l);
    lifo.push('s');
    lifo.push(180);
    lifo.push("salem");
    System.out.println(lifo);
    System.out.println(lifo+"before remove vaues");
    lifo.pop();
    System.out.println(lifo+"after remove values");


    if (lifo1.empty()==true) 
    {
        System.out.println("your  values is emty");

        
    }
    else
    {
        System.out.println("your values is not emty");
    }
    System.out.println(lifo.search(180));
    System.out.println(lifo.peek());





}    
}

    
}
