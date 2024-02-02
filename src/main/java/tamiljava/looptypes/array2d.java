package tamiljava.looptypes;
public class array2d
{
  public static void main(String[] args)  
  {
    float [][] class_cgpa={{7.6f, 6.8f, 9.6f, 6.7f} ,{5.8f ,9.4f ,6.7f,8.6f} ,{5.5f,6.5f,7.7f,8.7f} ,{4.3f,5.3f,6.6f,8.7f} ,{9.9f,8.8f,6.7f,8.7f} };
     
    for(int row=0;row<=4;row++)
    {
        for(int col=0;col<=3;col++)
        {
          System.out.print(class_cgpa[row] [col]+ " ");
        }
        System.out.println();
    }

} 

}