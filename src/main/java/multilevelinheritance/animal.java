package multilevelinheritance;

public class animal implements cat,mouse,dog
{
    
        public void catname()
        {
            System.out.println("my cat  name is");
        }
        public void musename()
        {
            System.out.println("my mouse name is");
        }
        public void dogname()
        {
            System.out.println("my dog name is ");
        }
        public static void main(String[] args) 
        {
          animal a=new animal();
          a.catname();
          a.dogname();
          a.musename();
            
        }
    
    
}
