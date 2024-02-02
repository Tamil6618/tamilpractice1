package tamiljava;

import java.util.Scanner;


public class controlstructre 

{
    public static void main(String[] args) 
    {
       Scanner demo = new Scanner(System.in);
       System.out.println("enter your roll no :");
       int rollno=demo.nextInt();
       if (rollno==10 && rollno==11 || rollno==12 || rollno==9 || rollno%9!=0 && rollno%11!=0 && rollno%12!=0 && rollno%10!=010) 
       {
        System.out.println(rollno+"this is my roll number");

       } 
       else
        {
        System.out.println(rollno+"this is not my roll number");
       }
          
        }

    }
    
