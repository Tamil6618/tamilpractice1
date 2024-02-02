package tamiljava;
import java.util.Scanner;
public class arrays2
 {
  public static void main(String[] args) 
  
  {
    Scanner scan=new Scanner(System.in);
    String [] subjectname=new String[5];
    for(int mark=0;mark<subjectname.length;mark++)
    {
     System.out.println("enter the subject name :");
     subjectname[mark]=scan.nextLine();
     
    }
     
    for(int i=0;i<subjectname.length;i++)
    {
      System.out.println(subjectname[i]);
    }
  }  
}
