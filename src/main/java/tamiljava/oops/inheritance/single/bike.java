package tamiljava.oops.inheritance.single;

public class bike extends car
{
public void bike()
{
    String mybike ="yamaha";
    System.out.println("my bike name is "+mybike);


}
public void number()
{
 int [] mynumber = new int[4];
 mynumber[0]=6;
 mynumber[1]=3;
 mynumber[2]=0;
 mynumber[3]=7;
 for(int i=0;i<mynumber.length;i++)
 { 
  System.out.println(mynumber[i]);
 }


}
    public static void main(String[] args) 
    
    {
     
      bike ca=new bike();
      ca.carbrands();
      ca.myletters();
      ca.bike();
      ca.number();  

    }
}
