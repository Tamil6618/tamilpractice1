package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;



public class demoset
 {
public static void main(String[] args)
 {
    TreeSet<Double> height=new TreeSet<Double>();
    height.add(88.3);
    height.add(23.4);
    height.add(54.6);
     height.add(85.6);
      height.add(55.6);
       height.add(34.6);
        height.add(53.6);
         height.add(67.6);
          height.add(99.6);
          System.out.println(height);
          
          HashSet<Double> hi= new HashSet<Double>();
          hi.addAll(height);          
          Iterator<Double>it=hi.iterator();
           while(it.hasNext())
           {
            System.out.println(it.next()+"demo values");
           }

          


}
    
}
