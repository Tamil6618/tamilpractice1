package tamiljava;

public class methodetypes 
{ 
      public void player1()   //without returntype without arguments
      {
    
         String player_name="rohit sharma";
         System.out.println("player name 1:"+player_name);
         int jersy_no=45;
         char ascino=(char)jersy_no;
         System.out.println("player jersy no :"+jersy_no+"\nplayer jersy asci no:"+ascino);
    
    
      }
      
          public void player2(char ascono,int jersy_no)  //without retuen type with arguments
            {
             String player2_name="virat";
             System.out.println("player name 2 is :"+player2_name);
             System.out.println("player no 2 ascino:"+ascono);
             System.out.println("player 2 jersno;"+jersy_no);
      
            }

            public String player3() //with returntype without arguements
            {
                return "player_name";
            }
      
      public static void main(String[] args)    
       {
          methodetypes types=new methodetypes();
          types.player1();

          char ascono='T';
          int jersy_no=ascono;
          types.player2(ascono, jersy_no);

          types.player3();
          String player_name= "rahul";
          System.out.println("player name 3 is :"+player_name);


      }
          
}
