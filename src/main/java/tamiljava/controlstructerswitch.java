package tamiljava;
import java.util.Scanner;
public class controlstructerswitch 
{
    public static void main(String[] args)
     {
        Scanner scan =new Scanner(System.in);
        System.out.println("whta is your name");
        String name= scan.nextLine();

        switch (name) {
            case "tamil":
                System.out.println("my value is one");
                break;
            case "selvan":
                System.out.println("my value is 4");
                break;
        
            default:
                System.out.println("not my value");
                break;
        }
     





    }
    
}
