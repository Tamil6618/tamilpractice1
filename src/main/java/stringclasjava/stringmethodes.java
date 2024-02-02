package stringclasjava;

public class stringmethodes 
{
    public static void main(String[] args)
     {
       String name1="tamilselvan";
       String name2=new String("sathishkumar");
       String name3=new String("kesavan");

       System.out.println(name1);

       name1=name1.concat("velu");
       System.out.println(name1);
       System.out.println(name1.charAt(5));

       System.out.println(name1.equals("Tamilselvan"));
       System.out.println(name1.equalsIgnoreCase("tamilselvan"));
       System.out.println(name1.compareTo("kesavan"));
       System.out.println(name1.compareToIgnoreCase("sathiishkumar"));

       System.out.println(name2.startsWith("sat"));
       System.out.println(name2.endsWith("mar"));

      name3=name3.replace("van", "vaa");
      System.out.println(name3);
       
      System.out.println(name2.substring(0, 5));
      System.out.println(name3.contains("kes"));
      

      String obj =new String("        tamil selvan     ");
      System.out.println(obj);
      System.out.println(obj.trim());

      String content ="stringbis bassically an object that reprents sequrance of charcter values";
      String spilting [ ]=content.split(" ",12);

      for(String spi:spilting)
      {
        System.out.print(spi);
      }

        
    }
    
}
