package tamiljava.oops.inheritance.single;

import java.util.Arrays;

public class car 
{
    public void carbrands()
    {
     String[] carname= {"bmw", "auddi" , "benz", "kia" ," jaguar"};
     System.out.println(Arrays.toString(carname));

    }
public void myletters()
{
   char[] myleeter= {'a','b', 'c','d'};
   for(char letter:myleeter)
   { 
    System.out.println("my letter is" +myleeter);
   }

}
}
