package tamiljava;

public class demomethodes 
{
   public float studetdetails(int rollno,char section,int std)
   
   {
    float persentage=rollno;
    System.out.println("my persentage is"+persentage);
    System.out.println("student roll no"+rollno);
    System.out.println("student scetion"+section);
    System.out.println("student std"+std);
    return rollno;
   } 
    
    public static void main(String[] args) 
    {
        demomethodes methodes=new demomethodes();

        int rollno=12;
        

        float persentage=methodes.studetdetails(rollno, 'A', 1);
        System.out.println("my cgpa is"+persentage);
        
    }
}
