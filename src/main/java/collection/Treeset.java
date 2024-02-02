package collection;

import java.util.Iterator;
import java.util.TreeSet;

import tamiljava.oops.inheritance.multilevel.son;


public class Treeset {
    public static void main(String[] args) {
        TreeSet<MobilePhones> poorvika =new TreeSet<MobilePhones>();
        poorvika.add(new MobilePhones("redmi",4,1200.90));
        poorvika.add(new MobilePhones("iphone",128,65000.00));
        poorvika.add(new MobilePhones("oneplus",12,450000.00));
        poorvika.add(new MobilePhones("mi",4,1200.90));
        MobilePhones obj=new MobilePhones("vivo", 64, 80000.9);
        poorvika.add(obj);

        //System.out.println(poorvika);
        Iterator it=poorvika.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }



    }
    
}
class MobilePhones implements Comparable<MobilePhones>
{

    String mobilename;
    Integer ram;
    Double price;



public MobilePhones(String mobilename, Integer ram, Double price) {
    this.mobilename=mobilename;
    this.ram=ram;
    this.price=price;




}
@Override
public String toString()
{
    return "MobilePhones [mobilename="+mobilename+",ram="+ram+".price="+price+"]";

}

@Override
public int compareTo(MobilePhones ab) {
    // TODO Auto-generated method stub
    return ab.price.compareTo(this.price);
}

}




