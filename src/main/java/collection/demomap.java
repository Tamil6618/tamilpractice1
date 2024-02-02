package collection;

import java.util.TreeMap;


public class demomap 

{
    public static void main(String[] args) 
    {
        // TreeMap<String, Integer>obj=new TreeMap<String,Integer>();
        // obj.put("tmail", 2);
        // obj.put("selvan", 3);
        // obj.put("salem", 4);
        // obj.put("Tam", 1);
        // obj.put("valapady", 5);
        // System.out.println(obj);

        // System.out.println(obj.get("salem"));
        // System.out.println(obj.containsValue(4));
        // System.out.println(obj.containsKey("Tam"));

        TreeMap<String, MobilePhones> tree =new TreeMap<String, MobilePhones>();
        MobilePhones mob=new MobilePhones("samsung", 12, 35000.89);
        
        MobilePhones mob1=new MobilePhones("nokia", 8, 25000.89);
        MobilePhones mo2=new MobilePhones("oppo", 16, 45000.80);
        MobilePhones mob3=new MobilePhones("oneplus", 34, 65000.8);
        
        tree.put("Tamil", mob3);
        tree.put("sathish",mob1);
        tree.put("kumar",mo2);
        tree.put("sam", mob);
        System.out.println(tree);
        
        

    

        
    }
    
}
