package tamiljava;

import com.google.gwt.i18n.server.MessageFormatUtils.StaticArgChunk;

public class variablestypes 

{
 static String name="jhonn";
 static int age=25;

 char letter='b';
 long mobilenumber=7010171395l;

 public void bike()
 {
    int bikeno=3691;
     String bikename="yamaha";
     System.out.println("my bike name"+bikename);
     System.out.println("bike no is"+bikeno);
 }
  

 public static void main(String[] args)
  {
   float milage=54.5f;
   System.out.println("bike milage is "+milage); 
   variablestypes var=new variablestypes();
   var.bike();
   System.out.println( "my name is "+variablestypes.name);
   System.out.println( variablestypes.age);
   System.out.println(var.mobilenumber);
   System.out.println(var.letter);


 }

    


}
