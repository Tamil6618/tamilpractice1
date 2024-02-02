package tamiljava;

public class DemoTypecast 
{
    public static void main(String[] args) 
    { 
        char letter='t';
        short height=(short) letter;
        long regno=height;
        System.out.println("myletter:"+letter);
        System.out.println("my height:"+height);
        System.out.println("my regno:"+regno);

                        //wdening
            
              short weight=65;
              float count=weight;
              System.out.println("weight:"+weight+"\tmy height:"+height
              );
              System.out.println("count:"+count); 
              
                    //narrowing
            long mymobileno=7010171395L;
            float myweight=(float)mymobileno;
            System.out.println("my mobile no:"+mymobileno+"\naltermobileno:"+regno);
            System.out.println("my weight in grams:"+myweight);
            
    

        

        
    }
    
}
